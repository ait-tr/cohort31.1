package practice.budget_tracker.src.dao;

import practice.budget_tracker.src.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget{

    // размер бюджета
    double budget;

    // список покупок

    @Override
    public double addMoney(double money) {
        return 0;
    }

    @Override
    public boolean checkBudget() {
        return false;
    }

    @Override
    public boolean addPurchase(Purchase purchase) {
        return false;
    }

    @Override
    public double calcBudget() {
        return 0;
    }

    @Override
    public double getBudgetByPerson(String person) {
        return 0;
    }

    @Override
    public double getBudgetByStore(String person) {
        return 0;
    }

    @Override
    public double getBudgetByDate(LocalDate from, LocalDate to) {
        return 0;
    }

    @Override
    public double checkMoney() {
        return 0;
    }

}
