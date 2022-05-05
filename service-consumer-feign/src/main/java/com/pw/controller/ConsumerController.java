package com.pw.controller;

import com.pw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author peng
 * @date 2022/5/5
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private ProductService productService;


    @GetMapping("product/list")
    public List<String> getProductList() {
      return   productService.getList();
    }
}
