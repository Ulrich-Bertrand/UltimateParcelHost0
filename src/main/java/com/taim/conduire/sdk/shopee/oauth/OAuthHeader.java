package com.taim.conduire.sdk.shopee.oauth;


public enum OAuthHeader {
    OAUTH_TIMESTAMP("oauth_timestamp"),
    OAUTH_NONCE("oauth_nonce"),
    OAUTH_SIGNATURE_METHOD("oauth_signature_method"),
    OAUTH_SIGNATURE("oauth_signature");

    private String value;

    private OAuthHeader(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}


