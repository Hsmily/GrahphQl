package com.example.demo.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.model;
import com.example.demo.repo.repo;
import com.example.demo.service.service;

@Service
public class serviceimpl implements service {

    @Autowired
    private repo  Repo;

    public model create(model model) {
        // Implement the logic to save the model in the repository
        return Repo.save(model);
    }

    public List<model> getAll() {
        return Repo.findAll();
    }

    @Override
    public model get(int Id) {
        return Repo.findById(Id).orElseThrow();
    }

	@Override
	public model add(model model) {
		// TODO Auto-generated method stub
	 return Repo.save(model);
	}

	

	
}
