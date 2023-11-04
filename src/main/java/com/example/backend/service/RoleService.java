package com.example.backend.service;

import com.example.backend.Model.Right;
import com.example.backend.Model.Role;
import com.example.backend.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;


    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> findAll(){
        return roleRepository.findAll();
    }
    public Role getRoleById(Long id){
        return roleRepository.findById(id).orElse(null);
    }
    public void deleteById(Long id){
        roleRepository.deleteById(id);
    }
    public void deleteRole(Role role){
        roleRepository.delete(role);
    }
    public Set<Right> findAllRightsByRoles(Role[] roles){
        Set<Right> allRights = new HashSet<>();
        for(Role role : roles){
            Set<Right> thisRolesRights = new HashSet<>(roleRepository.findRightsByRole(role));
            allRights.addAll(thisRolesRights);
        }
        return allRights;
    }
    public void updateRole(Role role){
roleRepository.save(role);
    }
    public void saveRole(Role role){
        roleRepository.save(role);
    }

    public Role findById(Long id){
        return roleRepository.findById(id).orElse(null);
    }
}
