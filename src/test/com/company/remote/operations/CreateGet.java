package com.company.remote.operations;


/**
 * Created by Никита Овсянников on 06.07.2017.
 */
public class CreateGet {

    /*public static String execute(String paramaters, Credentials credentials) throws IOException {

        URL obj = new URL(paramaters);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", "User-Agent");
        con.setRequestProperty("Authorization", credentials.getBearer());

        int responseCode = con.getResponseCode();
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }*/

}
