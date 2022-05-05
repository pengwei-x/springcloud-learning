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
        objects.add("梨");
        objects.add("葡萄");
        objects.add("橘子");
        return objects;
    }
}
