package org.example;

import Exceptions.businessException;
import entities.Account;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");

        System.out.print("Número:");
        int number = sc.nextInt();

        System.out.print("Nome: ");
        String holder = sc.next();

        System.out.print("Saldo: ");
        double balance = sc.nextDouble();

        System.out.print("Limite para o saque: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Quanto deseja sacar? ");
        double amount = sc.nextDouble();

        try{
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f, foi retirado %.2f", acc.getBalance(), amount);

        } catch(businessException e){
            System.out.println(e.getMessage());

        }
        sc.close();


    }
}