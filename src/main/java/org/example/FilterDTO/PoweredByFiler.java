package org.example.FilterDTO;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.ext.Provider;

import java.io.IOException;
import java.net.URI;

@Provider
public class PoweredByFiler  implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext RequestContext) throws IOException {
       URI uri = RequestContext .getUriInfo().getAbsolutePath();
       System.out.println(uri);
    }
}
