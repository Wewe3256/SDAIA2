package org.example.Exceptions;

//import jakarta.ws.rs.ext.Provider;
//import org.glassfish.jersey.spi.ExceptionMappers;
//@Provider
//public class DataNotFoundExceptionMapper implements ExceptionMappers<DataNotFoundException> {
//}
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.example.FilterDTO.ErrorMessage;
//import org.example.dto.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

    @Override
    public Response toResponse(DataNotFoundException exception) {
        ErrorMessage err = new ErrorMessage();
        err.setErrorContent(exception.getMessage());
        err.setErrorCode(404);
        err.setDocumentationUrl("https://google.com");

        return Response
                .status(Response.Status.NOT_FOUND)
                .entity(err)
                .build();
    }
}