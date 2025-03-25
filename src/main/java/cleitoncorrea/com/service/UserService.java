package cleitoncorrea.com.service;

import cleitoncorrea.com.entity.UserEntity;
import cleitoncorrea.com.exception.UserException;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class UserService {

    public UserEntity createUser(UserEntity userEntity){
        userEntity.persist(userEntity);
        return userEntity;
    }

    public List<UserEntity> findAll(Integer page, Integer pagesize){
    return UserEntity.findAll().page(page, pagesize).list();
    }

    public UserEntity findById(UUID userid){

        return (UserEntity) UserEntity.findByIdOptional(userid).orElseThrow(UserException::new);

    }
}
