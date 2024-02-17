package com.zc.service;

import com.zc.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    List<Product> getAll(String type,String label);
    List<String> getTypes();
    List<String> getLabels();
}
