package com.pw.controller;

import com.pw.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author peng
 * @date 2022/4/20
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("test")
    public List<String> test(){
       return providerService.list();
    }
}
