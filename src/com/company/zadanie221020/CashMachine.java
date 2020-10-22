package com.company.zadanie221020;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {
    private static List<Transaction> transactions = new ArrayList<>();

    private static void addTransaction(int wartosc){
        transactions.add(new Transaction(wartosc));
    }

    private static int getBalance(){
        int balance = 0;
        for(Transaction transakcja:transactions){
            balance+=transakcja.transactionValue;
        }
        return balance;
    }

    private static double getAverageDeposits(){
        int average = 0;
        int numberOfDeposits = 0;
        for(Transaction tranakcja:transactions){
            if(tranakcja.transactionValue>0){
                average+=tranakcja.transactionValue;
                numberOfDeposits++;
            }
        }
        average/=numberOfDeposits;
        return average;
    }

    private static double getAveragePayouts(){
        int average = 0;
        int numberOfPayouts = 0;
        for(Transaction tranakcja:transactions){
            if(tranakcja.transactionValue<0){
                average+=tranakcja.transactionValue;
                numberOfPayouts++;
            }
        }
        average/=numberOfPayouts;
        return average;
    }

    public static void main(String[] args) {
        CashMachine.addTransaction(300);
        CashMachine.addTransaction(-100);
        CashMachine.addTransaction(400);
        System.out.println(CashMachine.getBalance());
        System.out.println(CashMachine.getAverageDeposits());
        System.out.println(CashMachine.getAveragePayouts());
    }
}
