package com.project.user;

import com.project.userRole.UserRole;
import jakarta.persistence.*;
import lombok.Data;

/**
 * @author fajaryudi
 * @created 2023/02/16 - 11.16
 */

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false)
    private String username;
    private String fullName;
    private String email;
    private String password;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private UserRole userRole;

}
