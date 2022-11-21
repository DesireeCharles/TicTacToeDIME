package info.scce.dime.rest;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;

/**
 * An object deserializer that deserializes objects serialized with {@link ContextIndependentSerializer}.
 *
 * @author frohme
 */
public class ContextIndependentDeserializer<T> extends JsonDeserializer<T> implements ContextualDeserializer {

    private final ObjectMapper objectMapper = JacksonProvider.getPreconfiguredMapper();

    private final JavaType type;

    public ContextIndependentDeserializer() {
        this(null);
    }

    public ContextIndependentDeserializer(JavaType type) {
        this.type = type;
    }

    @Override
    public T deserialize(JsonParser p, DeserializationContext ctx) throws IOException {
        return objectMapper.readValue(p, this.type);
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) {
        return new ContextIndependentDeserializer<>(ctxt.getContextualType());
    }
}
