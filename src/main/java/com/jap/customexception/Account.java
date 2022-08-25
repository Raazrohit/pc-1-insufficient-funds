package com.jap.customexception;

public class Account {

    private int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    //create getter and setter


    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * This method returns the new balance deducting the withdraw amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     *
     * @param amount
     * @return
     * @throws InsufficientFundException
     *
     */
    public int  withdraw(int  amount) throws InsufficientFundException{
        try {
            if (accountBalance < amount)
            {
                throw new InsufficientFundException("you have not sufficient balance in your account");
            }
            else {
                accountBalance = accountBalance - amount;
            }

        }catch (Exception e){
            System.out.println("e = " + e);
        }
        return accountBalance;
    }


}
