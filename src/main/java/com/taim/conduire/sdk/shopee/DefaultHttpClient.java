package com.taim.conduire.sdk.shopee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

public class DefaultHttpClient implements HttpClient {
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String APPLICATION_JSON = "application/json";
    private CloseableHttpClient httpClient = HttpClientBuilder.create().build();
    private ObjectMapper mapper = new ObjectMapper();

    public DefaultHttpClient() {
    }

    public Map get(String url) {
        HttpGet httpGet = new HttpGet(url);
        return (Map)this.getEntityAndReleaseConnection(httpGet, Map.class);
    }

    public List getAll(String url) {
        HttpGet httpGet = new HttpGet(url);
        return (List)this.getEntityAndReleaseConnection(httpGet, List.class);
    }

    public Map post(String url, Map<String, String> params, Map<String, Object> object) {
        List postParameters = this.getParametersAsList(params);

        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            uriBuilder.addParameters(postParameters);
            HttpPost httpPost = new HttpPost(uriBuilder.build());
            httpPost.setHeader("Content-Type", "application/json");
            return this.postEntity(object, httpPost);
        } catch (URISyntaxException var7) {
            throw new RuntimeException(var7);
        }
    }

    public Map put(String url, Map<String, String> params, Map<String, Object> object) {
        List postParameters = this.getParametersAsList(params);

        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            uriBuilder.addParameters(postParameters);
            HttpPut httpPut = new HttpPut(uriBuilder.build());
            httpPut.setHeader("Content-Type", "application/json");
            return this.postEntity(object, httpPut);
        } catch (URISyntaxException var7) {
            throw new RuntimeException(var7);
        }
    }

    public Map delete(String url, Map<String, String> params) {
        List postParameters = this.getParametersAsList(params);

        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            uriBuilder.addParameters(postParameters);
            HttpDelete httpDelete = new HttpDelete(uriBuilder.build());
            return (Map)this.getEntityAndReleaseConnection(httpDelete, Map.class);
        } catch (URISyntaxException var6) {
            throw new RuntimeException(var6);
        }
    }

    private Map postEntity(Map<String, Object> objectForJson, HttpEntityEnclosingRequestBase httpPost) {
        try {
            HttpEntity entity = new ByteArrayEntity(this.mapper.writeValueAsBytes(objectForJson), ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            return (Map)this.getEntityAndReleaseConnection(httpPost, Map.class);
        } catch (JsonProcessingException var4) {
            throw new RuntimeException(var4);
        }
    }

    private List<NameValuePair> getParametersAsList(Map<String, String> params) {
        List<NameValuePair> postParameters = new ArrayList();
        if (params != null && params.size() > 0) {
            Iterator var3 = params.keySet().iterator();

            while(var3.hasNext()) {
                String key = (String)var3.next();
                postParameters.add(new BasicNameValuePair(key, (String)params.get(key)));
            }
        }

        return postParameters;
    }

    private <T> T getEntityAndReleaseConnection(HttpRequestBase httpRequest, Class<T> objectClass) {
        Object var6;
        try {
            HttpResponse httpResponse = this.httpClient.execute(httpRequest);
            HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity == null) {
                throw new RuntimeException("Error retrieving results from http request");
            }

            Object result = this.mapper.readValue(httpEntity.getContent(), Object.class);
            if (!objectClass.isInstance(result)) {
                throw new RuntimeException("Can't parse retrieved object: " + result.toString());
            }

            var6 = objectClass.cast(result);
        } catch (IOException var10) {
            throw new RuntimeException(var10);
        } finally {
            httpRequest.releaseConnection();
        }

        return (T) var6;
    }
}

