package storage;

public class Food implements Store {
    @Override
    public String storeSomething() {
        return "Food and beverages";
    }
}
