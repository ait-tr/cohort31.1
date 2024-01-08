package practice.budget_tracker.test;

import practice.budget_tracker.dao.Budget;
import practice.budget_tracker.dao.BudgetImpl;
import practice.budget_tracker.model.Purchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetImplTest {

    double b = 1000;
    List<Purchase> purchaseList = new ArrayList<>();

    Budget monthBudget = new BudgetImpl(b, purchaseList);

    @BeforeEach
    void setUp() {

        purchaseList = List.of(
           new Purchase(1, "Lidl", LocalDate.of(2023, 12, 01), "Mom", 120.0),
           new Purchase(2, "Aldi", LocalDate.of(2023, 12, 03), "Mom", 180.0),
           new Purchase(3, "Kaufland", LocalDate.of(2023, 12, 31), "Dad", 200.0)
        );

        for (Purchase p : purchaseList) {
            monthBudget.addPurchase(p);
        }
    }

    @Test
    void addMoney() {
        assertEquals(1100, monthBudget.addMoney(100.0));
        assertEquals(1300, monthBudget.addMoney(200));
    }

    @Test
    void addPurchase() {
        Purchase p = new Purchase(4, "Lidl", LocalDate.of(2023, 12, 10), "Dad", 300.0);
        assertTrue(monthBudget.addPurchase(p));
        assertFalse(monthBudget.addPurchase(p));
        p = new Purchase(5, "Lidl", LocalDate.of(2023, 12, 12), "Dad", 200.0);
        assertTrue(monthBudget.addPurchase(p));
        System.out.println(monthBudget.calcBudget());
    }

    @Test
    void calcBudget() {
        double b = monthBudget.calcBudget();
        assertEquals(500.0, b );
    }

    @Test
    void checkBudget() {
        assertTrue(monthBudget.checkBudget());
    }

    @Test
    void checkMoney() {
        assertEquals(500, monthBudget.checkMoney());
    }

    @Test
    void getBudgetByStore() {
        assertEquals(120, monthBudget.getBudgetByStore("Lidl"));
    }

    @Test
    void getBudgetByPerson() {
        assertEquals(300, monthBudget.getBudgetByPerson("Mom"));
    }

    @Test
    void getBudgetByDate() {
        LocalDate from = LocalDate.of(2023, 12,01).minusDays(1);
        LocalDate to = LocalDate.of(2023, 12,31).plusDays(1);
        assertEquals(500, monthBudget.getBudgetByDate(from, to));
    }
}