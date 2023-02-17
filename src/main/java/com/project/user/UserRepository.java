package com.project.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fajaryudi
 * @created 2023/02/16 - 11.21
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
