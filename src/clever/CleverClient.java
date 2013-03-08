package clever;
import org.apache.http.*;
import org.apache.http.client.*;
import org.json.*;
import clever.CleverResponse;
import clever.CleverSchool;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.auth.AuthScope;
import org.apache.http.impl.auth.BasicScheme;


public class CleverClient
{
    private static final String CLEVER_API_URL = "https://DEMO_KEY:@api.getclever.com";
    private static final String CLEVER_API_VERSION = "/v1.1/";
    
    public static String getVersionedAPIURL()
    {
        return CLEVER_API_URL + CLEVER_API_VERSION;
    }
    public static void main(String args[])
    {
        getSchools();
        getStudents();
        getTeachers();
        
    }
    
    public static void getSchools()
    {
        JSONObject jsonObject = getJSONObject(CleverSchool.PATH);   

        CleverSchool[] schools=null;
        try
        {
            JSONArray jsonArray = jsonObject.getJSONArray("data");    
            int count = jsonArray.length();               
            schools = new CleverSchool[count];      
            for(int i=0;i<count;i++)
            {
                CleverSchool school = CleverSchool.fromJsonObject(jsonArray.getJSONObject(0).getJSONObject("data"));
                System.out.println(school.getName());                
                schools[i]=school;            
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }        
    }

    public static void getStudents()
    {
        JSONObject jsonObject = getJSONObject(CleverStudent.PATH);
        
        CleverStudent[] students=null;
        try
        {
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            int count = jsonArray.length();
            students = new CleverStudent[count];
            for(int i=0;i<count;i++)
            {
                CleverStudent student = CleverStudent.fromJsonObject(jsonArray.getJSONObject(0).getJSONObject("data"));
                System.out.println(student.getFirstName() + " "+ student.getLastName());
                students[i]=student;
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void getTeachers()
    {
        JSONObject jsonObject = getJSONObject(CleverTeacher.PATH);
        
        CleverTeacher[] teachers=null;
        try
        {
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            int count = jsonArray.length();
            teachers = new CleverTeacher[count];
            for(int i=0;i<count;i++)
            {
                CleverTeacher teacher = CleverTeacher.fromJsonObject(jsonArray.getJSONObject(0).getJSONObject("data"));
                System.out.println(teacher.getLastName());
                teachers[i]=teacher;
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static JSONObject getJSONObject(String path)
    {
        String fullPath = CleverClient.getVersionedAPIURL()+path;
        try
        {            
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(fullPath);
            System.out.println("executing request" + httpGet.getRequestLine());
            HttpResponse httpResponse =  httpClient.execute(httpGet);
            CleverResponse cleverResponse = new CleverResponse(httpResponse);
            return cleverResponse.getJsonObject();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}