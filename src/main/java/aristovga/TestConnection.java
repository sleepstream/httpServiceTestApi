package aristovga;


import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.get;

public class TestConnection {

    private String path;

    public TestConnection(String url) {
        this.path = url;
    }

    public Response getResponse()
    {
        Response response;
        try {
            response = get(path);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            response =  null;
        }
        return response;
    }

    public Integer getStatus()
    {
        Integer status = null;
        Response responce = getResponse();
        if(responce!= null)
            status = responce.getStatusCode();
        else
            status = -1;
        return status;
    }
}
