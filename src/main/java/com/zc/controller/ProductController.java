package com.zc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.pojo.Product;
import com.zc.pojo.Result;
import com.zc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/{pageNum}/{size}")
    public Result getAll(@PathVariable int pageNum, @PathVariable int size,
                         @RequestParam("type") String type,@RequestParam("label")String label){
        PageHelper.startPage(pageNum,size);
        List<Product> all = service.getAll(type,label);
        PageInfo<Product> pageInfo=new PageInfo<>(all,3);
        return new Result(200,pageInfo,"ok");
    }

    @GetMapping("/type")
    public Result getType(){
        return new Result(200,service.getTypes(),"ok");
    }

    @GetMapping("/label")
    public Result getLabel(){
        return new Result(200,service.getLabels(),"ok");
    }

}
