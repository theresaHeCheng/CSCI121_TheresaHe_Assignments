import java.util.Scanner;

public class TestPatient
{
    public static void main(String[] args)
    {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        Patient patientDefault = new Patient();
        Patient patient0 = new Patient();

        int patient0ID = -1;
        int patient0Age = -1;
        String patient0BloodType = "";
        String patient0RhFactor = "";

        System.out.println("Please input the patient's data. First their ID number, age, blood type, then rh factor.");

        patient0ID = inputInt.nextInt();
        patient0Age = inputInt.nextInt();
        patient0BloodType = inputString.nextLine();
        patient0RhFactor = inputString.nextLine();

        while(patient0ID < 0 || patient0Age < 0 || patient0BloodType.isEmpty() || patient0RhFactor.isEmpty())
        {
            System.out.println("Please put the data in.");
            patient0ID = inputInt.nextInt();
            patient0Age = inputInt.nextInt();
            patient0BloodType = inputString.nextLine();
            patient0RhFactor = inputString.nextLine();
        }

        while
        (
                !(patient0BloodType.equals(TestBloodData.bloodTypes.O.name()) ||
                        patient0BloodType.equals(TestBloodData.bloodTypes.A.name()) ||
                        patient0BloodType.equals(TestBloodData.bloodTypes.B.name()) ||
                        patient0BloodType.equals(TestBloodData.bloodTypes.AB.name()) ||
                        patient0BloodType.equals(TestBloodData.bloodTypes.o.name()) ||
                        patient0BloodType.equals(TestBloodData.bloodTypes.a.name()) ||
                        patient0BloodType.equals(TestBloodData.bloodTypes.b.name()) ||
                        patient0BloodType.equals(TestBloodData.bloodTypes.ab.name())) ||
                        !(patient0RhFactor.equals("+") || patient0RhFactor.equals("-"))
        )
        {

            System.out.println("Please input a valid blood type.");
            patient0BloodType = inputString.nextLine().toUpperCase();
            patient0RhFactor = inputString.nextLine();

        }

        patient0.idNumber = patient0ID;
        patient0.age = patient0Age;
        patient0.bloodData = new bloodData(patient0BloodType, patient0RhFactor);

        Patient patient1 = new Patient();
        int patient1ID = -1;
        int patient1Age = -1;
        String patient1BloodType = "";
        String patient1RhFactor = "";

        System.out.println("Please input the patient's data. First their ID number, age, blood type, then rh factor.");

        while(patient1ID < 0 || patient1Age < 0 || patient1BloodType.isEmpty() || patient1RhFactor.isEmpty())
        {
            System.out.println("Please put the data in.");
            patient1ID = inputInt.nextInt();
            patient1Age = inputInt.nextInt();
            patient1BloodType = inputString.nextLine();
            patient1RhFactor = inputString.nextLine();
        }

        while
        (
                !(patient1BloodType.equals(TestBloodData.bloodTypes.O.name()) ||
                        patient1BloodType.equals(TestBloodData.bloodTypes.A.name()) ||
                        patient1BloodType.equals(TestBloodData.bloodTypes.B.name()) ||
                        patient1BloodType.equals(TestBloodData.bloodTypes.AB.name()) ||
                        patient1BloodType.equals(TestBloodData.bloodTypes.o.name()) ||
                        patient1BloodType.equals(TestBloodData.bloodTypes.a.name()) ||
                        patient1BloodType.equals(TestBloodData.bloodTypes.b.name()) ||
                        patient1BloodType.equals(TestBloodData.bloodTypes.ab.name())) ||
                        !(patient1RhFactor.equals("+") || patient0RhFactor.equals("-"))
        )
        {

            System.out.println("Please input a valid blood type.");
            patient1BloodType = inputString.nextLine().toUpperCase();
            patient1RhFactor = inputString.nextLine();

        }

        System.out.printf("Default patient data:\nID: %d\nAge: %d\nBlood Type: %s%s\n",
        patientDefault.idNumber, patientDefault.age, patientDefault.bloodData.getBloodType(), patientDefault.bloodData.getRhFactor());

        System.out.printf("\nPatient %d is %d years old and their blood type is %s%s\n",
        patient0.idNumber, patient0.age, patient0.bloodData.getBloodType().toUpperCase(), patient0.bloodData.getRhFactor());

        System.out.printf("\nPatient %d is %d years old and their blood type is %s%s\n",
        patient1.idNumber, patient1.age, patient1.bloodData.getBloodType().toUpperCase(), patient1.bloodData.getRhFactor());

    }
}
