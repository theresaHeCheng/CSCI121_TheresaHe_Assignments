public class Person
{
    String firstName;
    String lastName;
    public Person(String fName, String lName)//constructor
    {
        firstName = fName;
        lastName = lName;
    }
    public void setFName(String fName)
    {
        this.firstName = fName;
    }

    public void setLName(String lName)
    {
        this.lastName = lName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
}
