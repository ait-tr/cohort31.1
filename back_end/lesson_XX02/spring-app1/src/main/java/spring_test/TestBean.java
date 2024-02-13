package spring_test;

public class TestBean {

    // объект типа TestBean
    private String name; // имеет одно поле типа String

    // конструктор объекта
    public TestBean(String name) {
        this.name = name;
    }

    // геттер и сеттер объекта
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
