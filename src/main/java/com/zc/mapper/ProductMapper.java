package com.zc.mapper;

import com.zc.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    List<Product> getAll(@Param("type")String type,@Param("label")String label);
    List<String> getTypes();
    List<String> getLabels();
}
