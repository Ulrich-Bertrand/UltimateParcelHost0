package com.taim.conduire.controller;

import com.taim.conduire.domain.ShopeeOrderData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ShopeeOrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String orderList() {
        String url = "http://example.org/path/to/api";
        ShopeeOrderData response = restTemplate.getForObject(url, ShopeeOrderData.class);
        return response.toString();
    }
}
