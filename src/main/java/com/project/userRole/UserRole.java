package com.project.userRole;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author fajaryudi
 * @created 2023/02/16 - 11.16
 */

@Entity
@Data
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
}
