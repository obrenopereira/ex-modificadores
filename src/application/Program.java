package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = read.nextInt();

        System.out.print("Enter account holder: ");
        read.nextLine();
        String holder = read.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = read.next().charAt(0);
        if(response == 'y'){
            System.out.println("Enter initial value: ");
            double initialDeposit = read.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else{
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = read.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = read.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);


    }

}
