import java.sql.SQLOutput;

public class bloodData
{

    String bloodType;
    String RhFactor;

    public bloodData()
    {
        bloodType = "O";
        RhFactor = "+";
    }

    public bloodData(String type, String factor)
    {

        this.bloodType = type;
        this.RhFactor = factor;

    }

    public void setBloodType(String bloodType)
    {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor)
    {
        this.RhFactor = rhFactor;
    }

    public String getBloodType()
    {
        return bloodType;
    }

    public String getRhFactor()
    {
        return RhFactor;
    }
}
