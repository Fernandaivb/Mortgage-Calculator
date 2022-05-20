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
        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        System.out.println("Period (years): ");
        byte years = scanner.nextByte();

        monthlyInterest = annualInterest / percent / monthsInYear;
        numberOfPayments = years * monthsInYear;
        mortgage = principal*(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))/(Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
    }
}
