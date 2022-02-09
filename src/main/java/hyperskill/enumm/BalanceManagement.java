/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.enumm;

/**
 *
 * @author Rizky
 */
import java.util.Scanner;

public class BalanceManagement {

    /**
     * The method change the balance of the given account according to an operation.
     * @param account
     * @param operation
     * @return true if the balance has changed, otherwise - false.
     */
    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        // write your implementation here
        boolean flag = true;
        
        switch (operation) {
            case DEPOSIT:
                account.balance = account.balance + sum;
                flag = true;
                break;
            case WITHDRAW:
                if (account.balance < sum) {
                    System.out.println("Not enough money to withdraw.");
                    flag = false;
                } else {
                    account.balance = account.balance - sum;
                    flag = true;
                }
                break;
            default:
                System.out.println("wrong operation");
                flag = false;
                break;
                
        }
        return flag;
        
//        if (operation == operation.DEPOSIT) {
//            account.balance = account.balance + sum;
//        } else if (operation == Operation.WITHDRAW) {
//            if (account.balance < sum) {
//                System.out.println("Not enough money to withdraw.");
//                flag = false;
//            } else {
//                account.balance = account.balance - sum;
//                flag = false;
//            }
//        } else {
//            flag = false;
//        }
    }

    /* Do not change code below */
    enum Operation {
        /**
         * deposit (add) an amount into an Account
         */
        DEPOSIT,
        /**
         * withdraw (subtract) an amount from an Account
         */
        WITHDRAW
    }

    static class Account {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }
}

