package practice.budget_tracker.src.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.budget_tracker.src.dao.Budget;
import practice.budget_tracker.src.dao.BudgetImpl;
import practice.budget_tracker.src.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetImplTest {

    double b = 1000;
    List<Purchase> purchaseList = new ArrayList<>();

    Budget monthBudget = new BudgetImpl(b, purchaseList); // создали объект, в нем величина бюджета и список покупок

    @BeforeEach
    void setUp() {
        // создаем список покупок
        purchaseList = List.of(
          new Purchase(1, "Lidl", "Mom", 120, LocalDate.of(2023, 12, 01)),
          new Purchase(2, "Aldi", "Dad", 180, LocalDate.of(2023, 12, 03)),
          new Purchase(3, "Kaufland", "Mom", 200, LocalDate.of(2023, 12, 31))
        );

        // добавили покупки в бюджет
        for (Purchase p : purchaseList) {
            monthBudget.addPurchase(p);
        }
    }

    @Test
    void addMoney() {
        assertEquals(1100, monthBudget.addMoney(100));
        assertEquals(1300, monthBudget.addMoney(200));
    }

    @Test
    void checkBudget() {
        assertTrue(monthBudget.checkBudget());
    }

    @Test
    void addPurchase() {
        Purchase p = new Purchase(4, "Lidl", "Mom", 100, LocalDate.of(2023, 12, 20));
        assertTrue(monthBudget.addPurchase(p));
        assertFalse(monthBudget.addPurchase(p)); // нельзя добавить уже имеющуюся покупку
    }

    @Test
    void calcBudget() {
        System.out.println(monthBudget.calcBudget());
        assertEquals(500, monthBudget.calcBudget());
    }

    @Test
    void getBudgetByPerson() {
        assertEquals(320, monthBudget.getBudgetByPerson("Mom"));
        assertEquals(180, monthBudget.getBudgetByPerson("Dad"));
    }

    @Test
    void getBudgetByStore() {
        assertEquals(200, monthBudget.getBudgetByStore("Kaufland"));
    }

    @Test
    void getBudgetByDate() {
        LocalDate from = LocalDate.of(2023, 12, 01).minusDays(1);
        LocalDate to = LocalDate.of(2023, 12, 31).plusDays(1);
        assertEquals(500, monthBudget.getBudgetByDate(from, to));
    }

    @Test
    void checkMoney() {
        assertEquals(500, monthBudget.checkMoney());
    }
}