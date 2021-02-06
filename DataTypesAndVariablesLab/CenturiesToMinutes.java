package FundamentalsJava.DataTypesAndVariablesLab;

import java.util.Scanner;

public class CenturiesToMinutes {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1 centuries = 100 years = 36524 days = 876576 hours = 52594560 minutes

        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        double days =  (years * 365.2422);
        double hours = days * 24;
        double minutes =  (hours * 60);

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
    }
}
