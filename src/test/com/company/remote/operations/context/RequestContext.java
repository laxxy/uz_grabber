package com.company.remote.operations.context;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Никита Овсянников on 06.07.2017.
 */
public class RequestContext {

    private URL url;
    private String urlParameters;

    public RequestContext() throws MalformedURLException {
        url = new URL(Parameters.URL);
    }

    public URL getUrl() {
        return url;
    }

    public RequestContext setUrl(URL url) {
        this.url = url;
        return this;
    }

    public String getUrlParameters() {
        return urlParameters;
    }

    public RequestContext setUrlParameters(String urlParameters) {
        this.urlParameters = urlParameters;
        return this;
    }
}
