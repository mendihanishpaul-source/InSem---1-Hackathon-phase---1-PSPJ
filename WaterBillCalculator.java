import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter water consumption in litres: ");
        double consumption = sc.nextDouble();

        int billAmount;

        
        if (consumption <= 500) {

            billAmount = 100;

        } else {

            billAmount = 200;
            
        }

       
        System.out.println("The total water bill is: Rs." + billAmount);

        sc.close();
    }
}

