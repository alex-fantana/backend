package com.example.backend.service;

import com.example.backend.Model.Right;
import com.example.backend.repository.RightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RightService {
    @Autowired
    RightRepository rightRepository;

    public RightService(RightRepository rightRepository) {
        this.rightRepository = rightRepository;
    }

    public List<Right> findAllRights() {
        return rightRepository.findAll();
    }

    public Right save(Right right) {
        return rightRepository.save(right);
    }

    public void deleteRight(Right right){
        rightRepository.delete(right);
    }

    public void deleteRightById(Long id){
        rightRepository.deleteById(id);
    }
}
