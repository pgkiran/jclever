package clever;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class CleverSchool
{
    public static final String PATH = "schools?limit=5000";
    private String guid;
    private String lastModified;
    private String sisId;
    private String stateId;
    private String ncesId;
    private String schoolNumber;
    private String lowGrade;
    private String highGrade;
    private String principalName;
    private String principalEmail;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String district;
    
    public void setGuid(String guid)
    {
        this.guid=guid;
    }
 
    public String getGuid()
    {
        return this.guid;
    }
    //TODO: format to date object
    public void setLastModified(String lastModified)
    {
        this.lastModified=lastModified;
    }
 
    public String getLastModified()
    {
        return lastModified;
    }
    
    public void setSisId(String sisId)
    {
        this.sisId=sisId;
    }
 
    public String getSisId()
    {
        return this.sisId;
    }
    public void setStateId(String stateId)
    {
        this.stateId=stateId;
    }
    public String getStateId()
    {
        return this.stateId;
    }
    public void setNcesId(String ncesId)
    {
        this.ncesId=ncesId;
    }
    
    public String getNcesId()
    {
        return this.ncesId;
    }

    public void setSchoolNumber(String schoolNumber)
    {
        this.schoolNumber=schoolNumber;
    }
    
    public String getSchoolNumber()
    {
        return this.schoolNumber;
    }
    
    public void setLowGrade(String lowGrade)
    {
        this.lowGrade=lowGrade;
    }
    
    public String getLowGrade()
    {
        return this.lowGrade;
    }
 
    public void setHighGrade(String highGrade)
    {
        this.highGrade=highGrade;
    }
    
    public String getHighGrade()
    {
        return this.highGrade;
    }
    
    public void setPrincipalName(String principalName)
    {
        this.principalName=principalName;
    }
    
    public String getPrincipalName()
    {
        return this.principalName;
    }
    public void setPrincipalEmail(String principalEmail)
    {
        this.principalEmail=principalEmail;
    }
    public String getPrincipalEmail()
    {
        return this.principalEmail;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setCity(String city)
     {
         this.city=city;
     }
     public String getCity()
     {
         return this.city;
     }

    public void setState(String state)
    {
        this.state=state;
    }
    public String getState()
    {
        return this.state;
    }
    public void setZip(String zip)
    {
        this.zip=zip;
    }
    public String getZip()
    {
        return this.zip;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }    
    public String getPhone()
    {
        return this.phone;
    }
    public void setDistrict(String district)
    {
        this.district=district;
    }
    public String getDistrict()
    {
        return this.district;
    }
    public static CleverSchool fromJsonObject(JSONObject jsonObject) throws org.json.JSONException
    {
     CleverSchool school = new CleverSchool();
     school.setGuid(jsonObject.getString("id"));  
     school.setLastModified(jsonObject.getString("last_modified"));
     school.setPhone(jsonObject.getString("phone"));
     school.setSchoolNumber(jsonObject.getString("school_number"));
     JSONObject locationJSONObject = jsonObject.getJSONObject("location");
     school.setZip(locationJSONObject.getString("zip"));
     school.setAddress(locationJSONObject.getString("address"));
     school.setState(locationJSONObject.getString("state"));
     school.setCity(locationJSONObject.getString("city"));
     school.setLowGrade(jsonObject.getString("low_grade"));
     school.setHighGrade(jsonObject.getString("high_grade"));
     school.setStateId(jsonObject.getString("state_id"));
     school.setNcesId(jsonObject.getString("nces_id"));
     JSONObject principalJSONObject = jsonObject.getJSONObject("principal");
     school.setPrincipalName(principalJSONObject.getString("name"));
     school.setPrincipalEmail(principalJSONObject.getString("email"));    
     school.setSisId(jsonObject.getString("sis_id"));
     school.setName(jsonObject.getString("name"));
     school.setDistrict(jsonObject.getString("district"));     
     return school;
    }
}