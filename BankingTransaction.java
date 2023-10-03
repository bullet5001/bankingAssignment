package bankingAssienment;

import java.util.Scanner;

public class BankingTransaction {
    public static int accountBalance =1000;
    public static int depositCount=0;
    public static int amountDepositCount=0;
    public static int withdrawCount=0;
    public static int amountWithdrawCount=0;

   
    public static char display(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Press A to check Account Balance");
        System.out.println("Press B to  Deposit Amount");
        System.out.println("Press C to  Withdraw Amount");
        System.out.println("Press D to check Account Summary");
        System.out.println("Press E to Exit");
        return (scn.next().charAt(0));
    }
    public static void checkBalance(){
        System.out.println("Your Account Balance is $ "+ accountBalance );
    }
    public static void Deposit(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the amount you want to Deposit");
        int amount=scn.nextInt();
        if(amount>0)
        {accountBalance+=amount;
        amountDepositCount+=amount;
        depositCount++;
        System.out.println("Your current Account Balance is $ "+ accountBalance);}
        else {
            System.out.println("Please enter a valid amount for Deposit");
            System.out.println();
            System.out.println();
            Deposit();
        }
    }
    public static void withdraw(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the amount you want to Withdraw");
        int amount=scn.nextInt();
        if(amount>0)
        {accountBalance-=amount;
            amountWithdrawCount +=amount;
            withdrawCount++;
            System.out.println("Your current Account Balance is $ "+ accountBalance);}
        else {
            System.out.println("Please enter a valid amount for Deposit");
            System.out.println();
            System.out.println();
            withdraw();
        }
        
    }
    public static void accountSummary(){
        System.out.println("Your Account Balance is $ "+ accountBalance);
        System.out.println(" Your total Number of Deposit is  " + depositCount);
        System.out.println("Total Amount Deposited in "+depositCount+ " Transactions is $ "+ amountDepositCount);
        System.out.println(" Your total Number of Withdraw is  " + withdrawCount);
        System.out.println("Total Amount Withdraw in "+withdrawCount+ " Transactions is $ "+ amountWithdrawCount);
    }
    public static char exit(){

        System.out.println("THANK YOU FOR USING THIS BANKING APP");
        System.out.println("HAVE A NICE DAY");
        return 'n';
    }
    public static char option(){
        Scanner scn =new Scanner(System.in);
        System.out.println("PLEASE PRESS Y TO CONTINUE ");
        System.out.println("PLEASE PRESS E TO EXIT ");
        return (scn.next().charAt(0));
    }
}
