package practice.budget_tracker.src.dao;

import practice.budget_tracker.src.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget{

    // размер бюджета
    double budget;
    // список покупок
    // модификатор,тип, название
    List<Purchase> purchases = new ArrayList<>(); // обращаемся к пустому конструктору

    // constructor
    public BudgetImpl(double budget, List<Purchase> purchases) {
        this.budget = budget;
        this.purchases = purchases;
    }

    @Override
    public double addMoney(double money) {
        return budget += money;
    }

    @Override
    public boolean checkBudget() {
        double res = calcBudget();
        return res < budget;
    }

    @Override
    public boolean addPurchase(Purchase purchase) {
        if(purchase == null || purchases.contains(purchase)){
           return false;
        }
        return purchases.add(purchase); // используем метод add от ArrayList
    }

    @Override
    public double calcBudget() {
        return purchases.stream()
                .mapToDouble(Purchase::getAmount)
                .sum();
    }

    @Override
    public double getBudgetByPerson(String person) {
        return purchases.stream()
                .filter(purchase -> purchase.getPersonName().equalsIgnoreCase(person))
                .mapToDouble(Purchase::getAmount)
                .sum();
    }

    @Override
    public double getBudgetByStore(String store) {
        return purchases.stream()
                .filter(purchase -> purchase.getStore().equalsIgnoreCase(store))
                .mapToDouble(Purchase::getAmount)
                .sum();
    }

    @Override
    public double getBudgetByDate(LocalDate from, LocalDate to) {
        return purchases.stream()
                .filter(purchase -> purchase.getDate().isAfter(from)&&purchase.getDate().isBefore(to))
                .mapToDouble(Purchase::getAmount)
                .sum();
    }

    @Override
    public double checkMoney() {
        double spends = calcBudget();
        double res = budget - spends;
        return res;
    }

}
