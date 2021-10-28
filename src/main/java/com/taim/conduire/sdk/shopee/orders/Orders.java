package com.taim.conduire.sdk.shopee.orders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.taim.conduire.sdk.shopee.auth.ApiVersionType;
import com.taim.conduire.sdk.shopee.httpclient.DefaultHttpClient;
import com.taim.conduire.sdk.shopee.httpclient.HttpClient;
import com.taim.conduire.sdk.shopee.auth.AuthConfig;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class Orders implements IOrders {

    private HttpClient client;
    private AuthConfig config;
    private String version;

    public Orders(AuthConfig config, ApiVersionType apiVersion) {
        this.client=new DefaultHttpClient();
        this.config=config;
        this.version= apiVersion.getValue();
    }

    @Override
    public Map getOrderList(String endpointBase) throws JsonProcessingException, UnsupportedEncodingException {
        String finalUrl= String.format("%s/%s/%s",config.getUrl(),this.version,endpointBase);
        return this.client.get(config,finalUrl);
    }

    @Override
    public Map getShopInfo(String endpointBase) throws JsonProcessingException, UnsupportedEncodingException {
        String finalUrl= String.format("%s/%s/%s",config.getUrl(),this.version,endpointBase);
        return this.client.get(config,finalUrl);
    }

    @Override
    public Map getAll(String endpoindBase, Map<String, Object> params) throws JsonProcessingException, UnsupportedEncodingException {
        String finalUrl= String.format("%s/%s/%s",config.getUrl(),this.version,endpoindBase);
        return this.client.getAll(config,finalUrl,params);
    }

    @Override
    public Map getOrderDetails(String endpoindBase, Map<String, Object> params) throws JsonProcessingException, UnsupportedEncodingException {
        String finalUrl= String.format("%s/%s/%s",config.getUrl(),this.version,endpoindBase);
        return this.client.getAll(config,finalUrl,params);
    }
}
