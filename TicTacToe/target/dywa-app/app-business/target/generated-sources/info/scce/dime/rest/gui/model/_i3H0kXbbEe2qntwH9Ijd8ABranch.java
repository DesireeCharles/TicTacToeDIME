
		// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumeInput
		
		package info.scce.dime.rest.gui.model;
		
		public class _i3H0kXbbEe2qntwH9Ijd8ABranch{
			

			info.scce.dime.process.ProcessCallFrame callStack;
			
			@com.fasterxml.jackson.annotation.JsonProperty("dywaData")
			@com.codingrodent.jackson.crypto.Encrypt
			@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = info.scce.dime.rest.ContextIndependentSerializer.class)
			@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = info.scce.dime.rest.ContextIndependentDeserializer.class)
			public info.scce.dime.process.ProcessCallFrame getCallStack() {
				return callStack;
			}
			

			@com.fasterxml.jackson.annotation.JsonProperty("dywaData")
			public void setCallStack(info.scce.dime.process.ProcessCallFrame callStack) {
				this.callStack = callStack;
			}
		}
