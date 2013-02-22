package clever;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CleverStudent
{
    public static final String PATH = "students";
  private String dob;
    private String email;
    private String gender;
    private String frlStatus;
    private String grade;
    private boolean isHispanic;
    private String race;
    private String school;
    private String sisId;
    private String stateId;
    private String studentNumber;
    private String zip;
    private String lastName;
    private String firstName;
    private String middleName;
    private String id;
    
    public void setDOB(String dob)
    {
        this.dob = dob;
    }
    public String getDOB()
    {
        return this.dob;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setGender(String gender)
    {
        this.gender = gender;        
    }
    public String getGender()
    {
        return gender;
    }
    public void setFRLStatus(String frlStatus)
    {
        this.frlStatus = frlStatus;
    }
    public String getFRLStatus()
    {
        return frlStatus;
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    public String getGrade()
    {
        return this.grade;
    }
    public void setIsHispanic(boolean isHispanic)
    {
        this.isHispanic = isHispanic;
    }
    public boolean getIsHispanic()
    {
        return isHispanic;
    }
    
    public void setRace(String race)
    {
        this.race = race;
    }
    
    public String getRace()
    {
        return this.race;
    }
    public void setSchool(String school)
    {
        this.school=school;
    }
    public String getSchool()
    {
        return this.school;
    }
    public void setSisId(String sisId)
    {
        this.sisId = sisId;
    }
    public String getSisId()
    {
        return sisId;
    }
    public void setStateId(String stateId)
    {
        this.stateId = stateId;
    }
    public String getStateId()
    {
        return this.stateId;
    }
    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    public String getStudentNumber()
    {
        return this.studentNumber;
    }
    public void setZip(String zip)
    {
        this.zip = zip;
    }
    public String getZip()
    {
        return this.zip;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }
    public String getMiddleName()
    {
        return this.middleName;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getId()
    {
        return this.id;
    }
 
    public static CleverStudent fromJsonObject(JSONObject jsonObject) throws org.json.JSONException
    {
    CleverStudent student = new CleverStudent();
     student.setId(jsonObject.getString("id"));  
     student.setDOB(jsonObject.getString("dob"));
     student.setEmail(jsonObject.getString("email"));
     JSONObject locationJSONObject = jsonObject.getJSONObject("location");
     student.setZip(locationJSONObject.getString("zip"));
     student.setGender(jsonObject.getString("gender"));
     student.setFRLStatus(jsonObject.getString("frl_status"));
     student.setGrade(jsonObject.getString("grade"));
     String hispanic = jsonObject.getString("hispanic_ethnicity");
     if(hispanic!=null && hispanic.equalsIgnoreCase("Y"))
     {
         student.setIsHispanic(true);         
     }
     student.setRace(jsonObject.getString("race"));
     student.setSchool(jsonObject.getString("school"));
     student.setSisId(jsonObject.getString("sis_id"));
     student.setStateId(jsonObject.getString("state_id"));
     student.setStudentNumber(jsonObject.getString("student_number"));
     JSONObject nameJSONObject = jsonObject.getJSONObject("name");     
     student.setLastName(nameJSONObject.getString("last"));
     student.setFirstName(nameJSONObject.getString("first"));
     student.setMiddleName(nameJSONObject.getString("middle"));
     return student;
    }   

}