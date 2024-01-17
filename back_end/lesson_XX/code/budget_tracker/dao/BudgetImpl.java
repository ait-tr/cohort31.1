package budget_tracker.dao;

import budget_tracker.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget{

    // поля
    private double budget;
    List<Purchase> purchases = new ArrayList<>();

    // конструктор
    public BudgetImpl(double budget, List<Purchase> purchases) {
        this.budget = budget;
        this.purchases = purchases;
    }

    @Override
    public double addMoney(double money) {
        budget += money;
        return budget;
    }

    @Override
    public boolean addPurchase(Purchase purchase) {
        if(purchase == null || purchases.contains(purchase)) {
            return false;
        }
        return purchases.add(purchase);
    }

    @Override
    public double calcBudget() {
        return purchases.stream()
                .mapToDouble(Purchase::getAmount)
                .sum();
    }

    @Override
    public boolean checkBudget() {
        double spends = calcBudget();
        return spends < budget;
    }

    @Override
    public double checkMoney() {
        double spends = calcBudget();
        double res = budget - spends;
        return res;
    }

    @Override
    public double getBudgetByStore(String store) {
        return purchases.stream()
                .filter(purchase -> purchase.getStore().equalsIgnoreCase(store))
                .mapToDouble(Purchase::getAmount)
                .sum();
    }

    @Override
    public double getBudgetByPerson(String person) {
        return purchases.stream()
                .filter(purchase -> purchase.getPerson().equalsIgnoreCase(person))
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
}
