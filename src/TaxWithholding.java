import java.util.Scanner;

public class TaxWithholding {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

// Getting user's weekly income

        System.out.println("Please enter your weekly income: ");
        float income = input.nextInt();

// Printing corresponding tax withholding for the given income

        if(income < 500){
            System.out.println("Tax withheld: $" + ((10.0/100.0)*income));
        }
        else if(income >= 500 && income < 1500){
            System.out.println("Tax withheld: $" + ((15.0/100.0)*income));
        }
        else if(income >= 1500 && income < 2500){
            System.out.println("Tax withheld: $" + ((20.0/100.0)*income));
        }
        else if(income >= 2500){
            System.out.println("Tax withheld: $" + ((30.0/100.0)*income));
        }
        input.close();
    }
}
