package com.project.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

/**
 * @author fajaryudi
 * @created 2023/02/16 - 11.32
 */
@Controller
public class UserController {

    @Autowired
    UserRepository repo;

    @QueryMapping
//    @SchemaMapping(typeName = "Query",value = "User")
    Iterable<User> users() {
        return repo.findAll();
    }

    @QueryMapping
    Optional<User> userById(@Argument Long id) {
        return repo.findById(id);
    }

    @MutationMapping
    User addOrEditUser(@Argument User user){
        return repo.save(user);
    }

    @MutationMapping
    Optional<User> deleteUserById(@Argument Long id) {
        Optional<User> user = repo.findById(id);
        if (user.isPresent()){
            repo.delete(user.get());
            return user;
        }
        return null;
    }
}
