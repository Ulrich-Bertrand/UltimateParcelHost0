package com.taim.conduire.sdk.shopee;

import com.taim.conduire.sdk.shopee.oauth.OAuthConfig;

public class ShopeeApi {
    //To change on format shopee
    private static final String API_URL_FORMAT = "%s/wp-json/wc/%s/%s";
    private static final String API_URL_BATCH_FORMAT = "%s/wp-json/wc/%s/%s/batch";
    private static final String API_URL_ONE_ENTITY_FORMAT = "%s/wp-json/wc/%s/%s/%d";
    private static final String URL_SECURED_FORMAT = "%s?%s";
    private HttpClient client;
    private OAuthConfig config;
    private String apiVersion;

    public ShopeeApi(OAuthConfig config, ApiVersionType apiVersion) {
        this.config = config;
        this.client = new DefaultHttpClient();
        this.apiVersion = apiVersion.getValue();
    }

}
