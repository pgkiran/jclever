package clever;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CleverStudent
{
    public static final String PATH = "student?limit=5000";
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
}