package com.example.backend.repository;

import com.example.backend.Model.Right;
import com.example.backend.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query("SELECT r.rights FROM Role r WHERE r = :role")
    Set<Right> findRightsByRole(Role role);
}
