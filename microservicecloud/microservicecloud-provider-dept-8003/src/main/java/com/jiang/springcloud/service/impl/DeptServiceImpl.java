package com.jiang.springcloud.service.impl;

import com.jiang.entities.Dept;
import com.jiang.springcloud.dao.DeptDao;
import com.jiang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findByID(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
