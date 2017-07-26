package com.company.remote;

import com.company.remote.operations.CreateGet;
import com.company.remote.operations.CreatePost;
import com.company.remote.operations.context.Credentials;
import com.company.remote.operations.context.RequestContext;

import java.io.IOException;


/**
 * Created by Никита Овсянников on 05.07.2017.
 */
public class test {
    public static void main(String[] args) {
        try {
            Credentials credentials = new Credentials();
            RequestContext requestContext = new RequestContext();
            //requestContext.setUrlParameters(RequestContext.generateLoginParameters(credentials));
            String execute = CreatePost.execute(requestContext, false);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
