
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double giftValue = Double.valueOf(scan.nextLine());
        
        if(giftValue >= 5000 && giftValue < 25000) {
            int lowerLimit = 100;
            double tax = 0.08;
            System.out.println("Tax: " + (lowerLimit + (giftValue - 5000) * tax));
        } else if (giftValue >= 25000 && giftValue < 55000) {
            int lowerLimit = 1700;
            double tax = 0.1;
            System.out.println("Tax: " + (lowerLimit + (giftValue - 25000) * tax));
        } else if(giftValue >= 55000 && giftValue < 200000 ) {
            int lowerLimit = 4700;
            double tax = 0.12;
            System.out.println("Tax: " + (lowerLimit + (giftValue - 55000) * tax));
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            int lowerLimit = 22100;
            double tax = 0.15;
            System.out.println("Tax: " + (lowerLimit + (giftValue - 200000) * tax));
        } else if (giftValue >= 1000000) {
            int lowerLimit = 142100;
            double tax = 0.17;
            System.out.println("Tax: " + (lowerLimit + (giftValue - 1000000) * tax));
        } else {
            System.out.println("No tax!");
        }
    }
}
