package info.scce.dime.rest;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * An object serializer that uses a local instance of an {@link ObjectMapper} to serialize objects, so that
 * an independent reference counting occurs.
 *
 * @author frohme
 */
public class ContextIndependentSerializer extends JsonSerializer<Object> {

    private final ObjectMapper objectMapper;

    public ContextIndependentSerializer() {
        this.objectMapper = JacksonProvider.getPreconfiguredMapper();
    }

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        objectMapper.writeValue(gen, value);
    }
}
