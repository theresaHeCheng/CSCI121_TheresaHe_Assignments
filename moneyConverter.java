import java.util.Scanner;
import java.lang.Math;
public class moneyConverter {

    public static double maxCoins(double currency, double coinValue){
        return (currency - (currency % coinValue));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double currency = sc.nextDouble();
        double quarters = 0;
        double dimes = 0;
        double nickels = 0;

        if(currency / 0.25 != 0){
            quarters = (maxCoins(currency, 0.25)) / 0.25;
            currency = Math.round((currency - (quarters * 0.25)) * 100.0) / 100.0;
            System.out.println("Quarters: " + quarters);
        }

        if(currency / 0.1 != 0){
            dimes = (maxCoins(currency, 0.1) / 0.1);
            currency = Math.round((currency - (dimes * 0.1)) * 100.0) / 100.0;
            System.out.println("Dimes: " + dimes);
        }

        if(currency / 0.05 != 0){
            nickels = (maxCoins(currency, 0.05)/0.05);
            System.out.println("Nickels: " + nickels);
        }

    }
}
