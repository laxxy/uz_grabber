package com.company.remote.operations;


import com.company.remote.operations.context.RequestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class test {

    @BeforeTest
    public void iniit() {}

    @Test
    public void run() {
        try {
        RequestContext requestContext = new RequestContext();
        String execute = CreatePost.execute(requestContext, false);

            ArrayList<String> value = Func.parseJSON.apply(execute, "value");
            if (value.size() > 1 ) {
                SendEmail.send1();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
