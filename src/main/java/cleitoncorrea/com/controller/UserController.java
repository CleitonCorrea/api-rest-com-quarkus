package cleitoncorrea.com.controller;

import cleitoncorrea.com.entity.UserEntity;
import cleitoncorrea.com.service.UserService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    private final UserService userService;


    public UserController(UserService userService){
        this.userService = userService;
    }

    @POST
    @Transactional
    public Response createUser(UserEntity userEntity){
        return Response.ok(userService.createUser(userEntity)).build();
    }

}
