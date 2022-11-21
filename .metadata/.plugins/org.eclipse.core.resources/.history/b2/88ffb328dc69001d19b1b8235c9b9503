package info.scce.dime.rest;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class RESTContext {
    info.scce.dime.process.ProcessCallFrame callStack;

    @com.fasterxml.jackson.annotation.JsonProperty("dywaData")
    @com.codingrodent.jackson.crypto.Encrypt
    @JsonSerialize(using = ContextIndependentSerializer.class)
    @JsonDeserialize(using = ContextIndependentDeserializer.class)
    public info.scce.dime.process.ProcessCallFrame getCallStack() {
        return callStack;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dywaData")
    public void setCallStack(info.scce.dime.process.ProcessCallFrame callStack) {
        this.callStack = callStack;
    }

}
