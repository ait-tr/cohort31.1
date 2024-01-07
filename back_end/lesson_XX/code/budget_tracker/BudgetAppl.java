package budget_tracker;

import budget_tracker.dao.BudgetImpl;
import budget_tracker.model.Menu;
import budget_tracker.model.Purchase;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetAppl {
    public static void main(String[] args) {
        List<Purchase> purchaseList = new ArrayList<>();
        double budget = 0;
        Scanner scanner = new Scanner(System.in);

        BudgetImpl monthBudget = new BudgetImpl( budget, purchaseList);

        while (true) {
            Menu.printMenu();
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Input amount of money: ");
                    double money = scanner.nextDouble();
                    budget = monthBudget.addMoney(money);
                    System.out.println("Month budget is: " + budget);
                }
                case 2 -> {
                    System.out.println("Input ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Input store: " );
                    String store = scanner.nextLine();
                    System.out.println("Input date YYYY-MM-DD: ");
                    String dateStr = scanner.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate date = LocalDate.parse(dateStr, formatter);
                    System.out.println("Input person: " );
                    String person = scanner.nextLine();
                    System.out.println("Input amount of money: " );
                    double amount = scanner.nextDouble();
                    purchaseList.add(new Purchase(id, store, date, person, amount));
                }
                case 3 -> {
                    scanner.nextLine();
                    System.out.println("Input store: ");
                    String store = scanner.nextLine();
                    System.out.println("In store " + store + " spent: " + monthBudget.getBudgetByStore(store));
                }
                case 4 -> {
                    scanner.nextLine();
                    System.out.println("Input person: ");
                    String person = scanner.nextLine();
                    System.out.println("Person " + person + " spent: " + monthBudget.getBudgetByPerson(person));
                }
                case 5 -> {
                    purchaseList.forEach(System.out::println);
                    System.out.println("Month budget is: " + budget);
                    double spends = monthBudget.calcBudget();
                    System.out.println("Spends : " + spends);
                    boolean check = monthBudget.checkBudget();
                    System.out.println("Budget positive: " + check);
                    // System.out.println("Amount of money in budget is: " + (budget - spends));
                    double checkMoney = monthBudget.checkMoney();
                    System.out.println("Rest of budget is: " + checkMoney);
                }
                case 6 -> {
                    System.out.println("Saving budget...");
                    try {
                        PrintWriter pw = new PrintWriter(new FileWriter("back_end/lesson_XX/code/budget_tracker/budget-01.csv"));  // создаем поток в файл, true - дописывать
                        pw.println("id,store,date,person,amount");
                        for (Purchase p : purchaseList ) {
                            pw.println(p);
                        }
                        pw.println(budget);
                        pw.flush(); // отправление из буфера в поток => в файл
                        pw.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
                case 7 -> {
                    if(budget != 0.0) {
                        System.out.println("You already load the budget.");
                        break;
                    }
                    System.out.println("Loading... ");
                    try (BufferedReader br = new BufferedReader(new FileReader("back_end/lesson_XX/code/budget_tracker/budget-01.csv"))) {
                        String str = br.readLine(); // считали 1-ю строку
                        //System.out.println(str);
                         String[] cells = str.split(",");
                          printCells(cells);
                          str = br.readLine();
                       while(str != null){
                           cells = str.split(",");
                           if (cells.length == 1){
                               double money = Double.parseDouble(cells[0]);
                               budget = monthBudget.addMoney(money);
                               break;
                           }
                           int id = Integer.parseInt(cells[0]);
                           String store = cells[1];
                           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                           LocalDate date = LocalDate.parse(cells[2], formatter);
                           String person = cells[3];
                           double amount = Double.parseDouble(cells[4]);
                            printCells(cells);
                            purchaseList.add(new Purchase(id, store, date, person, amount));
                            str = br.readLine();
                        }

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 8 -> {
                    return;
                }
                default -> System.out.println("Wrong input.");
            }

        }
    }

    private static void printCells(String[] cells) {
        for (String s : cells ) {
            System.out.print(s + "\t"); // \t - это табуляция
        }
        System.out.println();
    }
}
