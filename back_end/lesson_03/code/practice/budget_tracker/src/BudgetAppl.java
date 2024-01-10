package practice.budget_tracker.src;

import practice.budget_tracker.src.dao.Budget;
import practice.budget_tracker.src.dao.BudgetImpl;
import practice.budget_tracker.src.model.Menu;
import practice.budget_tracker.src.model.Purchase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class BudgetAppl {

    private static final String FILE_NAME = "back_end/lesson_03/code/practice/budget_tracker/src/budget.csv";

    public static void main(String[] args) {

        double budget = 0;
        List<Purchase> purchaseList = new ArrayList<>();

        Budget monthBudget = new BudgetImpl(budget, purchaseList); // создаем объект для работы с бюджетом

        Scanner scanner = new Scanner(System.in);

        // организуем бесконечный цикл для работы с меню

        while (true) {
            Menu.printMenu(); // появилось меню и приглашение для пользователя

            try {

                int choice = scanner.nextInt(); // получаем с клавиатуры выбор пользователя

                switch (choice) {
                 case 1 -> {
                     System.out.println("Input amount of money: ");
                     double money = scanner.nextDouble();
                     budget = monthBudget.addMoney(money);
                     System.out.println("Month budget is: " + budget);
                 }
                 case 2 -> {
                     // спрашиваем у пользователя все (id, store, personName, amount, date) про покупку
                     System.out.println("Input ID: ");
                     int id = scanner.nextInt();
                     scanner.nextLine();
                     System.out.println("Input store: ");
                     String store = scanner.nextLine();
                     System.out.println("Input name: ");
                     String person = scanner.nextLine();
                     System.out.println("Input amount: ");
                     double amount = scanner.nextDouble();
                     scanner.nextLine();
                     System.out.println("Input date YYYY-MM-DD: ");
                     String dateStr = scanner.nextLine();
                     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                     LocalDate date = LocalDate.parse(dateStr, formatter);
                     // создадим новую покупку и добавим ее в список покупок
                     purchaseList.add(new Purchase(id, store, person, amount, date));
                 }
                 case 3 -> {
                     System.out.println("Checking...");
                     // распечатать покупки
                     purchaseList.forEach(System.out::println); // печатаем на основе toString
                     // сколько осталось
                     double spends = monthBudget.calcBudget();
                     System.out.println("Current amount of spends is: " + spends);
                     boolean check = monthBudget.checkBudget();
                     System.out.println("Is budget positive? "  + check);
                     double checkMoney = monthBudget.checkMoney();
                     System.out.println("Rest of the budget is: " + checkMoney);
                 }
                 case 8 -> {
                     System.out.println("Loading...");
                     try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
                         String str = br.readLine();
                         String[] cells = str.split(",");
                         printCells(cells);
                         str = br.readLine();
                         while(str != null){
                             cells = str.split(",");
                             int id = Integer.parseInt(cells[0]);
                             String store = cells[1];
                             String person = cells[2];
                             double amount = Double.parseDouble(cells[3]);
                             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                             LocalDate date = LocalDate.parse(cells[4], formatter);
                             printCells(cells);
                             purchaseList.add(new Purchase(id, store, person, amount, date));
                             str = br.readLine();
                         }

                     } catch (IOException e) {
                      throw new RuntimeException();
                     }

                 }

                 case 9 -> {
                     return;
                 }
                    default -> System.out.println("Wrong input.");

                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please, try again.");
                scanner.nextLine();
            }

        } // end of while


    } // end of main

    private static void printCells(String[] cells) {
        for (String s : cells) {
            System.out.print(s + "\t"); // \t - это табуляция
        }
        System.out.println();
    }

} // end of class
