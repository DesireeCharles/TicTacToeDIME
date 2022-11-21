package info.scce.dime.process;

import java.util.ArrayList;
import java.util.List;

public class ProcessCallFrame {

    public List<CallFrame> getCallFrames() {
        return callFrames;
    }

    private List<CallFrame> callFrames = new ArrayList<>();
    private boolean authenticationRequired = false;

    public boolean isAuthenticationRequired() {
        return authenticationRequired;
    }

    public void setAuthenticationRequired(boolean authenticationRequired) {
        this.authenticationRequired = authenticationRequired;
    }

    public ProcessCallFrame() {}

    public ProcessCallFrame(List<CallFrame> callFrames) {
        this.callFrames = callFrames;
    }
}
