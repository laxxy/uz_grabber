package net.uz.core;

import net.uz.core.context.RequestContext;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class MainTest {


    /*public static void main(String[] args) throws MalformedURLException {
        String s = "oxana0817@ukr.net";
        String s1 = "cosxtgx@gmail.com";
            RequestContext requestContext = new RequestContext();
            while (true)
                    try {
                Thread.sleep(5000);
                String execute = CreatePost.execute(requestContext, false);
                if (execute.contains("error")) continue;
                ArrayList<String> value = Func.parseJSON.apply(execute, "value");
                if (value.get(0).contains("848 К") && value.size() == 1) continue;
                if (value.size() > 1) {
                    System.out.println(" >>>>>>> " + value.size());
                    SendEmail.send1(s);
                    SendEmail.send1(s1);
                    break;
                }
                System.out.println("send request");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
            }*/

    @Test
    public void run() throws MalformedURLException {
        String s = "oxana0817@ukr.net";
        String s1 = "cosxtgx@gmail.com";
            RequestContext requestContext = new RequestContext();
            while (true)
                    try {
                Thread.sleep(5000);
                String execute = CreatePost.execute(requestContext, false);
                if (execute.contains("error")) continue;
                ArrayList<String> value = Func.parseJSON.apply(execute, "value");
                if (value.get(0).contains("848 К") && value.size() == 1) continue;
                if (value.size() > 1) {
                    System.out.println(" >>>>>>> " + value.size());
                    SendEmail.send1(s);
                    SendEmail.send1(s1);
                    break;
                }
                System.out.println("send request");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
            }
}
