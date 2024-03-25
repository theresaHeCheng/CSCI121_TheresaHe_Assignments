import java.util.Scanner;

public class TestBloodData
{

    enum bloodTypes
    {
        O, A, B, AB, o, a, b, ab
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your blood type. The type (A, B, AB, O) then factor (+ or -)");

        String userType = input.nextLine().toUpperCase();
        String userFactor = input.nextLine();

        bloodData userData = new bloodData(userType, userFactor);

        while
        (
                !(userType.equals(bloodTypes.O.name()) ||
                        userType.equals(bloodTypes.A.name()) ||
                        userType.equals(bloodTypes.B.name()) ||
                        userType.equals(bloodTypes.AB.name()) ||
                        userType.equals(bloodTypes.o.name()) ||
                        userType.equals(bloodTypes.a.name()) ||
                        userType.equals(bloodTypes.b.name()) ||
                        userType.equals(bloodTypes.ab.name())) ||
                        !(userFactor.equals("+") || userFactor.equals("-"))
        )
        {

            System.out.println("Please input a valid blood type.");
            userType = input.nextLine().toUpperCase();
            userFactor = input.nextLine();

        }

        userData.setBloodType(userType);
        userData.setRhFactor(userFactor);

        bloodData defaultData = new bloodData();

        System.out.printf("The default data is %s%s.\n", defaultData.getBloodType(), defaultData.getRhFactor());
        System.out.printf("User data is %s%s.\n", userData.getBloodType().toUpperCase(), userData.getRhFactor());

        defaultData.setBloodType(userType);
        defaultData.setRhFactor(userFactor);

        System.out.printf("The default data has been updated to match the user's: %s%s\n", defaultData.getBloodType(),
                                                                                            defaultData.getRhFactor());

    }
}
