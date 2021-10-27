package com.taim.conduire.sdk.shopee.oauth;

public final class OAuthConfig {
    private final String url;
    //parameters for authentification on Shopee Api

    public OAuthConfig(String url, String consumerKey, String consumerSecret) {
        if (url != null && !url.isEmpty()) {
            this.url = url;
        } else {
            throw new IllegalArgumentException("All arguments are required");
        }
    }

    public String getUrl() {
        return this.url;
    }

}
