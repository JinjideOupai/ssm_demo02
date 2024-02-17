package com.zc.service.impl;

import com.zc.mapper.ProductMapper;
import com.zc.pojo.Product;
import com.zc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper mapper;

    @Override
    public List<Product> getAll(String type,String label) {
        return mapper.getAll(type,label);
    }

    @Override
    public List<String> getTypes() {
        return mapper.getTypes();
    }

    @Override
    public List<String> getLabels() {
        return mapper.getLabels();
    }
}
