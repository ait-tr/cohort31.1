package practice.budget_tracker.model;

import java.time.LocalDate;
import java.util.Objects;

public class Purchase {
    private int id;
    private String store;
    private LocalDate date;
    private String person;
    private double amount;

    public Purchase(int id, String store, LocalDate date, String person, double amount) {
        this.id = id;
        this.store = store;
        this.date = date;
        this.person = person;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return id == purchase.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + "," + store +"," + date + "," + person + "," + amount;
    }
}
