package budget_tracker.dao;

import budget_tracker.model.Purchase;

import java.time.LocalDate;

public interface Budget {
    double addMoney(double money);
    boolean addPurchase(Purchase purchase);
    double calcBudget();
    boolean checkBudget();
    double checkMoney();
    double getBudgetByStore(String store);
    double getBudgetByPerson(String person);
    double getBudgetByDate(LocalDate from, LocalDate to);

}
