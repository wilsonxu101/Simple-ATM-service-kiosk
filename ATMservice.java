import java.util.Scanner;

public class ATMservice {
    public static void main(String[] args) {
        double accountBalance = 0.00; // start with 0
        Scanner input = new Scanner(System.in);
        int choice;
        
        // Use do-while loop to keep prompting the user until they choose exit
        do {
            System.out.println("1. View your Balance");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Exit");
            System.out.print("\nEnter your selection: ");
            
            choice = input.nextInt();
            // use switch statement easier to organize
            switch (choice) {
                case 1:
                    // 1: View Account Balance
                    System.out.printf("\nYour current balance is %.2f\n", accountBalance);
                    break;
                    
                case 2:
                    // 2: Deposit Cash
                    System.out.print("Enter the amount you want to deposit: ");
                    double depositAmount = input.nextDouble();
                    // use if else so user can try again if enter wrong input
                    if (depositAmount >= 0) {
                        accountBalance += depositAmount;
                        System.out.printf("\nDeposit of $%.2f successful.\n", depositAmount);
                    } else {
                        System.out.println("\nInvalid deposit amount. Please try again.");
                    }
                    break;
                    
                case 3:
                    // 3: Withdraw Cash
                    System.out.print("Enter the amount you want to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    
                    if (withdrawAmount <= accountBalance) {
                        accountBalance -= withdrawAmount;
                        System.out.printf("\nWithdrawal of $%.2f successful.\n", withdrawAmount);
                    } else {
                        System.out.println("\nSorry, you don't have enough balance!");
                    }
                    break;
                    
                case 4:
                    // 4: Exit
                    System.out.println("\nGoodbye!");
                    break;
                    
                default:
                    // wrong option, ask to try again
                    System.out.println("\nInvalid selection. Please try again.");
                    break;
            }
        } while (choice != 4);
        // I can close the program
        input.close();
    }
}