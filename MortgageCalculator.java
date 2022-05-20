import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        byte monthsInYear = 12;
        byte percent = 100;
        int numberOfPayments = 0;
        float monthlyInterest = 0;
        double mortgage = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();
        scanner.nextLine(); // handles the enter key
        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Period (years): ");
        byte years = scanner.nextByte();
        scanner.nextLine();
        
        scanner.close();
        
        mortgage = calculateMortgage(annualInterest, percent, years, principal);

        System.out.print("Mortgage: " + formatMortgage(mortgage);
    }
    
    public static float calculateMortgage(float annualInterest, byte percent, byte years, int principal){
        float monthlyInterest = annualInterest / percent / 12;
        byte numberOfPayments = years * 12;
        double mortgage = principal*(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))/(Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }
    
    public static String formatMortgage(double mortgage){
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        return mortgageFormatted;
    }
}
