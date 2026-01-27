package fr.husta.test.rest;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Set;

@ApplicationPath("/rest")
public class RestApplication extends Application {

    private static final Logger log = LoggerFactory.getLogger(RestApplication.class);

    @Override
    public Set<Class<?>> getClasses() {
        return Collections.emptySet();
    }

}
