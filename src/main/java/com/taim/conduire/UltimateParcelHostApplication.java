package com.taim.conduire;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.taim.conduire.sdk.shopee.auth.ApiVersionType;
import com.taim.conduire.sdk.shopee.orders.Orders;
import com.taim.conduire.sdk.shopee.auth.AuthConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class UltimateParcelHostApplication {

    public static void main(String[] args) throws JsonProcessingException, UnsupportedEncodingException {

        SpringApplication.run(UltimateParcelHostApplication.class, args);
        AuthConfig authConfig= new AuthConfig("https://partner.shopeemobile.com/api",2000446L,"47a10776077c33d6b9a3d38bb01672878a4a9d77cee0a052040aa6f68c0c0cb4",319153213L,System.currentTimeMillis()/1000L);
        Orders orders= new Orders(authConfig, ApiVersionType.V1);

        List<String> orders_sn= Arrays.asList("211024NNWWUXBK","2110174DYV1A1W","211015TYJ0UR34","211014SDM5S04V");
        Map<String,Object> params= new HashMap<>();
        params.put("ordersn_list",orders_sn);

// 211024NNWWUXBK 2110174DYV1A1W 211015TYJ0UR34 211014SDM5S04V
        System.out.print(orders.getOrderDetails("orders/detail",params));

    }

}
