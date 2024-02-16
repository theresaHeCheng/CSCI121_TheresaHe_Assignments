import java.util.Scanner;
import java.time.LocalDate;
public class TestWedding
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Initializing the bride
        System.out.println("First name of the bride:");
        String bFirstName = input.nextLine();
        System.out.println("Last name of the bride:");
        String bLastName = input.nextLine();
        Person bride = new Person(bFirstName, bLastName);

        //Initializing the groom
        System.out.println("First name of the groom:");
        String gFirstName = input.nextLine();
        System.out.println("Last name of the groom:");
        String gLastName = input.nextLine();
        Person groom = new Person(gFirstName, gLastName);

        //Initializing couple
        Couple couple = new Couple(bride, groom);

        //Initialize wedding
        System.out.println("Location of event:");
        String location = input.nextLine();
        System.out.println("Insert the date of the event numerically");
        System.out.println("Year:");
        int year = input.nextInt();
        System.out.println("Month:");
        int month = input.nextInt();
        System.out.println("Day:");
        int day = input.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        Wedding wedding = new Wedding(couple, date, location);

        //Prints wedding details
        System.out.printf
                ("You're invited to witness the marriage of %s %s and %s %s\n",
                        wedding.getCouple().getBride().getFirstName(),
                        wedding.getCouple().getBride().getLastName(),
                        wedding.getCouple().getGroom().getFirstName(),
                        wedding.getCouple().getGroom().getLastName()
                );
        System.out.println("at " + wedding.getLocation());
        System.out.println("on " + wedding.getDate());


    }
}
