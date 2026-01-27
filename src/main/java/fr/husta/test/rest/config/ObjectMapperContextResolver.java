package fr.husta.test.rest.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Produces;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 * JAX-RS Provider for Jackson's {@link ObjectMapper}.
 */
@Provider
@Produces("application/json")
public class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {

    private static final Logger log = LoggerFactory.getLogger(ObjectMapperContextResolver.class);

    private final ObjectMapper mapper;

    public ObjectMapperContextResolver() {
        log.debug("init : {} (JAX-RS @Provider)", this.getClass().getSimpleName());

        mapper = JsonMapper.builder()
                .addModule(new JavaTimeModule())
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .build();
    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
        return mapper;
    }
}
