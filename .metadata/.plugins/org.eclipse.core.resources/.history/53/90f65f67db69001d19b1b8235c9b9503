package info.scce.dime.exception;

import java.util.Collections;

import javax.ejb.ApplicationException;

import com.codingrodent.jackson.crypto.Encrypt;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import info.scce.dime.process.ProcessCallFrame;
import info.scce.dime.rest.ContextIndependentDeserializer;
import info.scce.dime.rest.ContextIndependentSerializer;

@ApplicationException
@JsonAutoDetect(fieldVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
public class GUIEncounteredSignal extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final GUIResult guiResult;

	@JsonCreator
	public GUIEncounteredSignal(
			@JsonProperty("guiResult")
					GUIResult guiResult) {
		this.guiResult = guiResult;
	}

	@JsonProperty
	public void setStatus(int status) {
		this.status = status;
	}

	@JsonProperty
	public int getStatus() {
		return status;
	}

	private int status = 200;

	public GUIEncounteredSignal(ProcessCallFrame callStack, String id) {
		this.guiResult = new GUIResult(callStack, new GUIInfo(id, Collections.emptyMap(), null));
	}

	public GUIEncounteredSignal(ProcessCallFrame callStack, String id, Object inputs) {
		this.guiResult = new GUIResult(callStack, new GUIInfo(id, inputs, null));
	}

	public GUIEncounteredSignal(ProcessCallFrame callStack, String id, Object inputs, String event,
			Object eventInputs) {
		this.guiResult = new GUIResult(callStack, new GUIInfo(id, inputs, new GUIEvent(event, eventInputs)));
	}

	public GUIEncounteredSignal(GUIInfo major, GUIEncounteredSignal minor) {
		this.guiResult = new GUIResult(minor.getGuiResult().getCallStack(), major, minor.getGuiResult().major_sib);
	}

	public GUIEncounteredSignal(GUIEncounteredSignal major, GUIEncounteredSignal minor) {
		this.guiResult = new GUIResult(minor.getGuiResult().getCallStack(), major.guiResult.getMajor_sib(),
				minor.getGuiResult().major_sib);
	}

	@JsonProperty
	public GUIResult getGuiResult() {
		return guiResult;
	}

	@Override
	public Throwable fillInStackTrace() {
		return this;
	}

	public static class GUIResult {

		private final GUIInfo major_sib;

		private final GUIInfo minor_sib;

		private final ProcessCallFrame callFrame;

		@JsonCreator
		public GUIResult(
				@JsonProperty("dywaData")
						ProcessCallFrame callFrame,
				@JsonProperty("major_sib")
						GUIInfo major_sib,
				@JsonProperty("minor_sib")
						GUIInfo minor_sib) {

			this.callFrame = callFrame;
			this.major_sib = major_sib;
			this.minor_sib = minor_sib;
		}

		public GUIResult(ProcessCallFrame callStack, GUIInfo major_sib) {
			this(callStack, major_sib, null);
		}

		@JsonProperty("dywaData")
		@Encrypt
		@JsonSerialize(using = ContextIndependentSerializer.class)
		@JsonDeserialize(using = ContextIndependentDeserializer.class)
		public ProcessCallFrame getCallStack() {
			return callFrame;
		}

		@JsonProperty
		public GUIInfo getMajor_sib() {
			return major_sib;
		}

		@JsonProperty
		public GUIInfo getMinor_sib() {
			return minor_sib;
		}
	}

	public static class GUIInfo {

		private final String id;

		private Object inputs;

		private final GUIEvent event;

		@JsonCreator
		public GUIInfo(
				@JsonProperty("id")
						String id,
				@JsonProperty("inputs")
						Object inputs,
				@JsonProperty("event")
						GUIEvent event) {
			this.id = id;
			this.inputs = inputs;
			this.event = event;
		}

		public String getId() {
			return id;
		}

		public Object getInputs() {
			return inputs;
		}

		public GUIEvent getEvent() {
			return event;
		}

		@JsonIgnore
		public void updateInputs(Object newInputs) {
			this.inputs = newInputs;
		}

	}

	public static class GUIEvent {

		private final String name;

		private final Object inputs;

		@JsonCreator
		public GUIEvent(
				@JsonProperty("name")
						String name,
				@JsonProperty("inputs")
						Object inputs) {
			this.name = name;
			this.inputs = inputs;
		}

		public String getName() {
			return name;
		}

		public Object getInputs() {
			return inputs;
		}
	}

}
