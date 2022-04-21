package com.pw.service.impl;

import com.pw.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peng
 * @date 2022/4/20
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RibbonClient ribbonClient;

    @Override
    public List<String> list() {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("ce");
        objects.add("ce1");
        objects.add("ce2");
        objects.add("ce3");
        return objects;
    }
}
