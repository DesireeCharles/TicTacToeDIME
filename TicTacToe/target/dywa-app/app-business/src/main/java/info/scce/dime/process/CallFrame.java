package info.scce.dime.process;

public class CallFrame {

    private String pointer;
    private String majorGUI;
    private JSONContext context;

    public CallFrame() {}

    public CallFrame(String pointer, DIMEProcessContext context) {
        this.pointer = pointer;
        this.context = context.toJSON();
    }

    public CallFrame(String pointer, DIMEProcessContext context, String majorGUI) {
        this(pointer, context);
        this.majorGUI = majorGUI;
    }

    public String getPointer() {
        return pointer;
    }

    public String getMajorGUI() {
        return this.majorGUI;
    }

    public void setMajorGUI(String majorGUI) {
        this.majorGUI = majorGUI;
    }

    public void setPointer(String pointer) {
        this.pointer = pointer;
    }

    public JSONContext getContext() {
        return context;
    }

    public void setContext(JSONContext context) {
        this.context = context;
    }
}
