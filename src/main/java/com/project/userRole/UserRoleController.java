package com.project.userRole;

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
public class UserRoleController {

    @Autowired
    UserRoleRepository repo;

    @QueryMapping
    Iterable<UserRole> userRoles() {
        return repo.findAll();
    }

    @QueryMapping
    Optional<UserRole> userRoleById(@Argument Long id) {
        return repo.findById(id);
    }

    @MutationMapping
    UserRole addOrEditUserRole(@Argument UserRole userRole){
        return repo.save(userRole);
    }

    @MutationMapping
    Optional<UserRole> deleteUserRoleById(@Argument Long id) {
        Optional<UserRole> userRole = repo.findById(id);
        if (userRole.isPresent()){
            repo.delete(userRole.get());
            return userRole;
        }
        return null;
    }

}
