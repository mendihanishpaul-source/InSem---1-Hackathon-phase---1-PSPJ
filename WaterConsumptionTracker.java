import java.util.Scanner;

public class WaterConsumptionTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter morning water usage: ");
        int morningUsage = scanner.nextInt();

        System.out.print("Enter evening water usage: ");
        int eveningUsage = scanner.nextInt();

      
        int totalConsumption = calculateTotal(morningUsage, eveningUsage);

        
        System.out.println("The total water consumption is: " + totalConsumption + " litres");

        scanner.close();
    }

    
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
}