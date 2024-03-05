package MyAccountsPackage;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Accounts implements Serializable{

    int accountNumber, balance;
    String name;

    Accounts(){}

    Accounts(int accountNumber, int balance, String name){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account Number: "+accountNumber+"\nName: "+name+"\nBalance: "+balance;
    }
}

public class SimpleAccounts {
    Accounts acc = null;
    static HashMap<Integer, Accounts> hm = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    //select menu method
    public static void selectMenu(){

        System.out.println("Select the below options for transaction: ");
        System.out.println("-------------------------------------------");
        System.out.println("1. Create an account");
        System.out.println("2. Delete an account");
        System.out.println("3. View an account");
        System.out.println("4. View all accounts");
        System.out.println("5. Save account");
        System.out.println("6. Exit");
        System.out.println("");
        System.out.print(">>> ");

        String choice = scanner.next();
        switch (choice){
            case "1":
                createAccount();
                break;
            case "2":
                deleteAccount();
                break;
            case "3":
                viewAccount();
                break;
            case "4":
                viewAllAccounts();
                break;
            case "5":
                saveAccount();
                break;
            case "6":
                exitFromSystem();
                break;
            default:
                selectMenu();
        }
    }

    //exit
    public static void exitFromSystem() {
        System.out.println("Thank you for using this system. Exiting...");
        System.exit(0);
    }

    //Create account
    public static void createAccount(){

        System.out.println("Account creation module");
        System.out.println("------------------------");
        System.out.print("Enter username: ");
        String name = scanner.next();
        System.out.print("\nEnter starting balance: ");
        int balance = scanner.nextInt();
        if(!(name.equals(null)) && balance >= 0){
            int accountNumber = (int)Math.floor(Math.random()*1000) + 1;
            Accounts acc = new Accounts(accountNumber, balance, name);
            hm.put(accountNumber, acc);
            if(hm.get(accountNumber) != null){
                System.out.println("Account created successfully!\n Account Number: " + accountNumber);
            }else {
                System.out.println("There was some error in account creation!");
            }

            saveAccount();
            selectMenu();
        }
    }

    //Delete account
    public static void deleteAccount(){
        System.out.print("\nEnter the account number to be deleted: ");
        int accountNumber = scanner.nextInt();
        if(hm.get(accountNumber)!=null){
            hm.remove(accountNumber);
            System.out.printf("The account number %d has been deleted.\n", accountNumber);
        }else {
            System.out.printf("The account number %d is invalid.\n", accountNumber);
        }
        saveAccount();
        selectMenu();
    }

    //Save account
    public static void saveAccount(){

        try(
                FileOutputStream fos = new FileOutputStream("C:\\Users\\allwyn.oommen\\Shops_Tests\\JavaPract\\Accounts.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ){
            oos.writeInt(hm.size());
            for(Accounts a: hm.values()){
                oos.writeObject(a);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

    //View account
    public static void viewAccount(){
        System.out.print("\nEnter account number: ");
        int accountNumber = scanner.nextInt();
        if(hm.get(accountNumber) != null){
            System.out.println(hm.get(accountNumber));
        }else {
            System.out.println("Invalid account number!");
        }

        selectMenu();
    }

    //View all accounts
    public static void viewAllAccounts(){
        System.out.println("Account details");
        System.out.println("----------------");
        for(Accounts a : hm.values()){
            System.out.println(a);
            System.out.println("------------------------");
        }

        selectMenu();
    }

    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("C:\\Users\\allwyn.oommen\\Shops_Tests\\JavaPract\\Accounts.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Accounts a;
            int size = ois.readInt();
            for(int i=0;i<size;i++){
                a = (Accounts) ois.readObject();
                hm.put(a.getAccountNumber(), a);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        selectMenu();
    }
}