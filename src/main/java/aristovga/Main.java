package aristovga;


import com.jayway.restassured.response.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    private static final InputStreamReader isr=new InputStreamReader(System.in);

    public static void main(String[] args) {
        System.out.println("End");
        BufferedReader br= new BufferedReader(isr);

        String path = null;
        try {
            path = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        TestConnection testConnection = new TestConnection(path);
        int tmp = testConnection.getStatus();
        System.out.println("Current status:\n"+tmp);
        Response response = testConnection.getResponse();
        System.out.println("Response headers:\n"+response.getHeaders().toString());
    }

}
