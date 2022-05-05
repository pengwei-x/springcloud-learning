package com.pw.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peng
 * @date 2022/5/5
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<String> getList() {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("苹果");
        objects.add("桃子");
        objects.add("香蕉");
        objects.add("榴莲");
        return objects;
    }
}
