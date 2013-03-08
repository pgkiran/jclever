package clever;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CleverTeacher
{
    public static final String PATH = "teachers";
    private String email;
    private String lastModified;
    private String district;
    private String school;
    private String sis_id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String id;
 
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setDistrict(String district)
    {
        this.district = district;
    }
    public String getDistrict()
    {
        return this.district;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }
    public String getSchool()
    {
        return this.school;
    }

    public void setSisID(String sis_id)
    {
        this.sis_id = sis_id;
    }
    public String getSisID()
    {
        return this.sis_id;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return this.lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }
    public String getMiddleName()
    {
        return this.middleName;
    }

    public void setLastModified(String lastModified)
    {
        this.lastModified=lastModified;
    }
 
    public String getLastModified()
    {
        return lastModified;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    public String getId()
    {
        return this.id;
    }
    public static CleverTeacher fromJsonObject(JSONObject jsonObject) throws org.json.JSONException
    {
     CleverTeacher teacher = new CleverTeacher();
     teacher.setId(jsonObject.getString("id"));  
     teacher.setEmail(jsonObject.getString("email"));       
     teacher.setLastModified(jsonObject.getString("last_modified"));
     teacher.setSisID(jsonObject.getString("sis_id"));
     teacher.setDistrict(jsonObject.getString("district"));     
     teacher.setSchool(jsonObject.getString("school"));      
     JSONObject nameJSONObject = jsonObject.getJSONObject("name");
     teacher.setLastName(nameJSONObject.getString("last"));
     teacher.setFirstName(nameJSONObject.getString("first"));    
     teacher.setMiddleName(nameJSONObject.getString("middle"));         
     return teacher;
    }
    
}