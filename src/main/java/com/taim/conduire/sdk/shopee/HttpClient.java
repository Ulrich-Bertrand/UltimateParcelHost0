package com.taim.conduire.sdk.shopee;

import java.util.List;
import java.util.Map;

public interface HttpClient {
    Map get(String var1);

    List getAll(String var1);

    Map post(String var1, Map<String, String> var2, Map<String, Object> var3);

    Map put(String var1, Map<String, String> var2, Map<String, Object> var3);

    Map delete(String var1, Map<String, String> var2);
}
