package cleitoncorrea.com.service;

import cleitoncorrea.com.entity.UserEntity;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

    public UserEntity createUser(UserEntity userEntity){
        userEntity.persist(userEntity);
        return userEntity;
    }
}
