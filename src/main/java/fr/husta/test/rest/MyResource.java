package fr.husta.test.rest;

import fr.husta.test.pojo.SimplePojo;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

@Path("/app")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
    @Path("test")
    public Response getTest() {
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.setOldDate(new Date());
        simplePojo.setName("test-1");
        simplePojo.setDob(LocalDate.now());
        simplePojo.setTimestamp(LocalDateTime.now());
        simplePojo.setTimestampWithTimezone(ZonedDateTime.now());

        return Response.ok(simplePojo).build();
    }

}
