package storage;

public class Base {
    Store store;

    public Base(Store store) {
        this.store = store;
    }

    public void keep(){
        System.out.println("Keeping: " + store.storeSomething());
    }
}
