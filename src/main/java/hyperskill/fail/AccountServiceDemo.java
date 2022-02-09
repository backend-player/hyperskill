/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.fail;

/**
 *
 * @author Rizky
 */

public class AccountServiceDemo {
    public static void main(String[] args) {
        //creating all needed instances to show the program's workability
        User u1 = new User(1, "A", "B");
        User u2 = new User(2, "C", "D");
        User u3 = new User(3, "E", "F");
        User u4 = new User(4, "G", "H");
        Account a1 = new Account(1, 300, u1);
        Account a2 = new Account(2, 100, u2);
        Account a3 = new Account(3, 250, u3);
        Account[] accounts = {a1, a2, a3};
        AccountService service = new AccountServiceImpl(accounts);

        System.out.println(service.countAccountsWithBalanceGreaterThan(110)); //outputs 2
        System.out.println(service.findAccountByOwnerId(3)); //outputs Account@74a14482 since there is no objective to override toString() method in Account class

        //everything works fine, but HyperSkill writes me “Failed. Wrong answer” with no clue what exactly is wrong

    }
}

interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

// Declare and implement your AccountServiceImpl here


class AccountServiceImpl implements AccountService {
    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts.clone();
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account a: accounts) {
            if (a.getOwner().getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long counter = 0;
        for (int i=0; i<accounts.length; i++) {
            if (accounts[i].getBalance() > value) {
                counter++;
            }
        }
        return counter;
    }

}



class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() { 
        return id; 
    }

    public long getBalance() { 
        return balance; 
    }

    public User getOwner() { 
        return owner; 
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() { 
        return id; 
    }

    public String getFirstName() { 
        return firstName; 
    }

    public String getLastName() { 
        return lastName; 
    }
}