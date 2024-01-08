package practice.budget_tracker.model;

public enum Menu {
    SET_BUDGET(1, "Month budget"),
    ADD_PURCHASE(2, "Add purchase"),
    BUDGET_BY_STORE(3, "Budget by store"),
    BUDGET_BY_PERSON(4, "Budget by person"),
    CHECK_BUDGET(5, "Check budget"),
    SAVE(6, "Save"),
    LOAD(7, "Load"),
    EXIT(8, "Exit")
    ;

    private int id;
    private String item;

    Menu(int id, String item) {
        this.id = id;
        this.item = item;
    }

    public static void printMenu(){
        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i].id + ": " + menu[i].item + " | ");
        }
        System.out.println();
    }
}
