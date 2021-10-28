package com.taim.conduire.sdk.shopee.httpclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.taim.conduire.sdk.shopee.auth.AuthConfig;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public interface HttpClient {

    Map getAll(AuthConfig config,String var1, Map<String,Object> params) throws JsonProcessingException, UnsupportedEncodingException;
    Map get(AuthConfig config, String url) throws JsonProcessingException, UnsupportedEncodingException;

    Map post(String var1, Map<String, String> var2, Map<String, Object> var3);

    Map put(String var1, Map<String, String> var2, Map<String, Object> var3);

    Map delete(String var1, Map<String, String> var2);
}
