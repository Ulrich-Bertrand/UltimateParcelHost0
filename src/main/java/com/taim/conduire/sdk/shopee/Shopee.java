package com.taim.conduire.sdk.shopee;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface Shopee {
    Map create(String var1, Map<String, Object> var2);

    Map get(String var1, int var2);

    List getAll(String var1, Map<String, String> var2);

    default List getAll(String endpointBase) {
        return this.getAll(endpointBase, Collections.emptyMap());
    }

    Map update(String var1, int var2, Map<String, Object> var3);

    Map delete(String var1, int var2);

    Map batch(String var1, Map<String, Object> var2);

}
