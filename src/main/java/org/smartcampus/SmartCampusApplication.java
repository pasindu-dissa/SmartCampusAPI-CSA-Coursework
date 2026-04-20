package org.smartcampus;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api/v1")
public class SmartCampusApplication extends Application {
    // The JAX-RS runtime will automatically scan your packages for @Path classes.
}
