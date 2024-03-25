public class Patient
{
    int idNumber;
    int age;
    bloodData bloodData;

    public Patient()
    {
        this.idNumber = 0;
        this.age = 0;
        this.bloodData = new bloodData("O", "+");
    }

    public Patient(int ID, int age, bloodData bloodData)
    {
        this.idNumber = ID;
        this.age = age;
        this.bloodData = bloodData;
    }
}
