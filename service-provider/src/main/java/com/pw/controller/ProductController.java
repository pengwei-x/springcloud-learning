package com.pw.controller;

import com.pw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author peng
 * @date 2022/5/5
 */
@RequestMapping("product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public List<String> getList(){
        System.out.println("调用服务提供者");
     return  productService.getList();
    }
}
