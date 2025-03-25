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

    @GET
    public Response findAll(@QueryParam("page") @DefaultValue("0") Integer page,
                            @QueryParam("pagesize") @DefaultValue("10") Integer pagesize){

        var users = userService.findAll(page,pagesize);
        return Response.ok(users).build();

    }

    @POST
    @Transactional
    public Response createUser(UserEntity userEntity){
        return Response.ok(userService.createUser(userEntity)).build();
    }

}
