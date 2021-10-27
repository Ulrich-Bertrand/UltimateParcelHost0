package com.taim.conduire.sdk.shopee.oauth;

public enum SpecialSymbol {
    AMP("&", "%26"),
    EQUAL("=", "%3D"),
    PLUS("+", "%2B"),
    STAR("*", "%2A"),
    TILDE("~", "%7E");

    private String plain;
    private String encoded;

    private SpecialSymbol(String plain, String encoded) {
        this.plain = plain;
        this.encoded = encoded;
    }

    public String getPlain() {
        return this.plain;
    }

    public String getEncoded() {
        return this.encoded;
    }
}
