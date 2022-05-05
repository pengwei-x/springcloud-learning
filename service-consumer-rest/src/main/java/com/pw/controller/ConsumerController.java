package com.pw.controller;

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
    private RestTemplate restTemplate;


    @GetMapping(value = "product/list", produces = "application/json;charset=utf-8")
    public List<String> getProductList() {
        System.out.println("1111");
//        List forObject = restTemplate.getForObject("http://localhost:7001/product/list", List.class);
        List forObject = restTemplate.getForObject("http://SERVICE-PROVIDER/product/list", List.class);
        return forObject;
    }
}
