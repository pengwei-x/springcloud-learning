package com.pw.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author peng
 * @date 2022/5/5
 */
@FeignClient("SERVICE-PROVIDER")
public interface ProductService {

    /**
     * 远程调用
     * @return
     */
    @GetMapping("product/list")
    List<String> getList();
}
