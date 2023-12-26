import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Atm_Machine bank = new Atm_Machine();
        bank.Check_pincode();
    }
}

class Atm_Machine {
    int Pincode = 7266;
    double Balance;

    public void Check_pincode() {
        System.out.println("Entre the Pin Code");
        Scanner sc = new Scanner(System.in);
        int newpin = sc.nextInt();
        if (newpin == Pincode) {
            option();
        } else {
            System.out.println("Enter a valid pin");
            Check_pincode();
        }
    }

    public void option() {
        System.out.println("Welcome! What would you like to do?");
        System.out.println("1. Make a Deposit");
        System.out.println("2. Check My Balance");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Cancel");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            makeDeposit();
        }

        else if (choice == 2) {
            checkMyBalance();

        }

        else if (choice == 3) {
            WithdrawMoney();
        }

        else if (choice == 4) {
            return;
        }

        else {
            System.out.println("Enter the valid option");
            System.out.println("Thank You😊");
        }
    }

    public void makeDeposit() {
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        Balance += Amount;
        System.out.println("Money Deposited successfully");
        option();
    }

    public void checkMyBalance() {
        System.out.println("Balance: " + Balance);
        option();
    }

    public void WithdrawMoney() {
        System.out.println("Enter the Amount to withdraw");
        Scanner sc = new Scanner(System.in);
        double Amount = sc.nextDouble();

        if (Amount == Balance) {
            System.out.println("Sorry! you have an insufficient Balance");
        }

        else {
            Balance -= Amount;
            System.out.println("Withdraw Successfully");
            option();
        }
    }

}
