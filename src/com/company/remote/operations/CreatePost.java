package com.company.remote.operations;


import com.company.remote.operations.context.Parameters;
import com.company.remote.operations.context.RequestContext;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by Никита Овсянников on 05.07.2017.
 */
public class CreatePost {

    public static String execute(RequestContext requestContext, boolean followRedirects) throws IOException {
        HttpURLConnection con;
            URL obj = requestContext.getUrl();
            con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("POST");
            con.setInstanceFollowRedirects(followRedirects);
            con.setUseCaches(false);
            con.setRequestProperty("User-Agent", "User-Agent");
            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

            // Send post request
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(requestContext.getUrlParameters() + Parameters.CALL);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);


        String result = "";
        String line;

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        while ((line = reader.readLine()) != null) {
            result += line;
        }
        wr.close();
        reader.close();
        System.out.println(result);
            return result;
    }
}
