import java.util.Scanner;
public class UseDinnerParty
{
    public static void main(String[] args)
    {
        int numGuests;
        int menuChoice;
        Scanner input = new Scanner(System.in);

        System.out.println("How many guests will be attending?");
        numGuests = input.nextInt();
        Party party = new Party();
        party.setGuests(numGuests);
        System.out.println("The party has " + party.getGuests() + " guests.");
        party.displayInvitation();

        System.out.println("How many guests will be attending the dinner party?");
        numGuests = input.nextInt();
        System.out.println("Which menu option should be served? 1 for chicken 2 for veggie");
        menuChoice = input.nextInt();
        DinnerParty dinnerParty = new DinnerParty();
        dinnerParty.setGuests(numGuests);
        dinnerParty.setDinnerChoice(menuChoice);
        System.out.println("The party has " + dinnerParty.getGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getDinnerChoice() + " will be served.");
        dinnerParty.displayInvitation();


    }
}
