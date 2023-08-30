package ait.generic.utils;

public class JsonWrapper2 <T extends CharSequence> {
    private T value;

    public JsonWrapper2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value + "}";
    }
}
