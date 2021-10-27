package com.taim.conduire.sdk.shopee.oauth;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.taim.conduire.sdk.shopee.HttpMethod;
import org.apache.commons.codec.binary.Base64;

public class OAuthSignature {

    private static final String UTF_8 = "UTF-8";
    private static final String HMAC_SHA256 = "HmacSHA256";
    private static final String SIGNATURE_METHOD_HMAC_SHA256 = "HMAC-SHA256";
    private static final String BASE_SIGNATURE_FORMAT = "%s&%s&%s";
    private static final String DELETE_PARAM_FORCE = "force";

    private OAuthSignature() {
    }
/*
        public static Map<String, String> getAsMap(OAuthConfig config, String endpoint, HttpMethod httpMethod, Map<String, String> params) {
            if (config != null && endpoint != null && httpMethod != null) {
                Map<String, String> authParams = new HashMap();
                authParams.put(OAuthHeader.OAUTH_CONSUMER_KEY.getValue(), config.getConsumerKey());
                authParams.put(OAuthHeader.OAUTH_TIMESTAMP.getValue(), String.valueOf(System.currentTimeMillis() / 1000L));
                authParams.put(OAuthHeader.OAUTH_NONCE.getValue(), UUID.randomUUID().toString());
                authParams.put(OAuthHeader.OAUTH_SIGNATURE_METHOD.getValue(), "HMAC-SHA256");
                authParams.putAll(params);
                if (HttpMethod.DELETE.equals(httpMethod)) {
                    authParams.put("force", Boolean.TRUE.toString());
                }

                String oAuthSignature = generateOAuthSignature(config.getConsumerSecret(), endpoint, httpMethod, authParams);
                authParams.put(OAuthHeader.OAUTH_SIGNATURE.getValue(), oAuthSignature);
                return authParams;
            } else {
                return Collections.emptyMap();
            }
        }

        public static Map<String, String> getAsMap(OAuthConfig config, String endpoint, HttpMethod httpMethod) {
            return getAsMap(config, endpoint, httpMethod, Collections.emptyMap());
        }

        public static String getAsQueryString(OAuthConfig config, String endpoint, HttpMethod httpMethod, Map<String, String> params) {
            if (config != null && endpoint != null && httpMethod != null) {
                Map<String, String> oauthParameters = getAsMap(config, endpoint, httpMethod, params);
                String encodedSignature = ((String)oauthParameters.get(OAuthHeader.OAUTH_SIGNATURE.getValue())).replace(SpecialSymbol.PLUS.getPlain(), SpecialSymbol.PLUS.getEncoded());
                oauthParameters.put(OAuthHeader.OAUTH_SIGNATURE.getValue(), encodedSignature);
                return mapToString(oauthParameters, SpecialSymbol.EQUAL.getPlain(), SpecialSymbol.AMP.getPlain());
            } else {
                return "";
            }
        }

        public static String getAsQueryString(OAuthConfig config, String endpoint, HttpMethod httpMethod) {
            return getAsQueryString(config, endpoint, httpMethod, Collections.emptyMap());
        }

        private static String generateOAuthSignature(String customerSecret, String endpoint, HttpMethod httpMethod, Map<String, String> parameters) {
            String signatureBaseString = getSignatureBaseString(endpoint, httpMethod.name(), parameters);
            String secret = customerSecret + SpecialSymbol.AMP.getPlain();
            return signBaseString(secret, signatureBaseString);
        }

        private static String signBaseString(String secret, String signatureBaseString) {
            try {
                Mac macInstance = Mac.getInstance("HmacSHA256");
                SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
                macInstance.init(secretKey);
                return Base64.encodeBase64String(macInstance.doFinal(signatureBaseString.getBytes("UTF-8")));
            } catch (InvalidKeyException | UnsupportedEncodingException | NoSuchAlgorithmException var4) {
                throw new RuntimeException(var4);
            }
        }

        private static String urlEncode(String s) {
            try {
                return URLEncoder.encode(s, "UTF-8");
            } catch (UnsupportedEncodingException var2) {
                throw new RuntimeException(var2);
            }
        }

        private static String getSignatureBaseString(String url, String method, Map<String, String> parameters) {
            String requestURL = urlEncode(url);
            Map<String, String> encodedParameters = percentEncodeParameters(parameters);
            encodedParameters = getSortedParameters(encodedParameters);
            String paramsString = mapToString(encodedParameters, SpecialSymbol.EQUAL.getEncoded(), SpecialSymbol.AMP.getEncoded());
            return String.format("%s&%s&%s", method, requestURL, paramsString);
        }

        private static String mapToString(Map<String, String> paramsMap, String keyValueDelimiter, String paramsDelimiter) {
            return (String)paramsMap.entrySet().stream().map((entry) -> {
                return (String)entry.getKey() + keyValueDelimiter + (String)entry.getValue();
            }).collect(Collectors.joining(paramsDelimiter));
        }

        private static Map<String, String> percentEncodeParameters(Map<String, String> parameters) {
            Map<String, String> encodedParamsMap = new HashMap();
            Iterator var2 = parameters.entrySet().iterator();

            while(var2.hasNext()) {
                Entry<String, String> parameter = (Entry)var2.next();
                String key = (String)parameter.getKey();
                String value = (String)parameter.getValue();
                encodedParamsMap.put(percentEncode(key), percentEncode(value));
            }

            return encodedParamsMap;
        }

        private static String percentEncode(String s) {
            try {
                return URLEncoder.encode(s, "UTF-8").replace(SpecialSymbol.PLUS.getPlain(), SpecialSymbol.PLUS.getEncoded()).replace(SpecialSymbol.STAR.getPlain(), SpecialSymbol.STAR.getEncoded()).replace(SpecialSymbol.TILDE.getEncoded(), SpecialSymbol.TILDE.getPlain());
            } catch (UnsupportedEncodingException var2) {
                throw new RuntimeException(var2.getMessage(), var2);
            }
        }

        private static Map<String, String> getSortedParameters(Map<String, String> parameters) {
            return new TreeMap(parameters);
        }
    }
*/

}
