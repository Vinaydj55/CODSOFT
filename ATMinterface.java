import java.util.Scanner;

class User 
{
    private double accountBalance = 2000.00;
    private int atmPin = 1234;

    public double getAccountBalance() 
    {
        return accountBalance;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            accountBalance+= amount;
            System.out.println("$" + amount + " has been deposited into your account.");
        } 
        else 
        {
            System.out.println("Invalid amount. Please enter a positive amount.");
        }
    }
    public boolean withdraw(double amount, int enteredPin) 
    {
        if (amount>0 && amount<=accountBalance) 
        {
            if (enteredPin==atmPin) 
            {
                accountBalance-=amount;
                System.out.println("$" + amount + " has been withdrawn from your account.");
                System.out.println("Please collect your Money!");
                return true;
            } 
            else 
            {
                System.out.println("Incorrect PIN.");
                return false;
            }
        } 
        else 
        {
            System.out.println("Insufficient funds or an invalid amount. Please try again.");
            return false;
        }
    }
}
public class ATMinterface 
{
    public static void main(String[] args) 
    {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do 
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    checkBalance(user);
                    break;
                case 2:
                    depositMoney(user, scanner);
                    break;
                case 3:
                    withdrawMoney(user, scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.out.println("Visit again");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice!=4);

        scanner.close();
    }
    public static void displayMenu() 
    {
        System.out.println();
        System.out.println("Welcome to ATM!");
        System.out.println("1. Balance enquiry");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public static void checkBalance(User user) 
    {
        System.out.println("Your account balance is: $" + user.getAccountBalance());
    }
    public static void depositMoney(User user, Scanner scanner) 
    {
        System.out.print("Enter the deposit amount: $");
        double depositAmount = scanner.nextDouble();
        user.deposit(depositAmount);
    }
    public static void withdrawMoney(User user, Scanner scanner) 
    {
        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();
        System.out.print("Enter the withdrawal amount: $");
        double withdrawalAmount = scanner.nextDouble();
        if (user.withdraw(withdrawalAmount, enteredPin)) 
        {
            System.out.println("Transaction completed successfully.");
        }
    }
}
