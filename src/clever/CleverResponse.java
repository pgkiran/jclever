package clever;
import org.apache.http.*;
import org.apache.http.util.EntityUtils;
import org.json.*;

public class CleverResponse
{
    HttpResponse httpResponse;
    
    public CleverResponse(HttpResponse httpResponse)
    {
        this.httpResponse=httpResponse;
    }
    
    public JSONObject getJsonObject()
    {
        try
        {
            return new JSONObject(EntityUtils.toString(this.httpResponse.getEntity()));
        }
        catch(Exception e)
        {
            return null;
        }
    }
}