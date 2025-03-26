package cleitoncorrea.com.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class UserExceptionMapping implements ExceptionMapper<UserException> {

    @Override
   public Response toResponse(UserException exception){
        return Response.status(Response.Status.NOT_FOUND.getStatusCode(),"User Not Found").build();
    }
}
