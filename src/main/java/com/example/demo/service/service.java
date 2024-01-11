package com.example.demo.service;


import com.example.demo.model.model;

import java.util.List;

public interface service {
    model create(model model);
    
    List<model> getAll();
    
    model get(int Id);

	model add(model model);
}
