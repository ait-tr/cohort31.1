package ait.generic;

import ait.generic.utils.JsonWrapper1;

public class JsonWrapper1Appl {
    public static void main(String[] args) {
//        double a = 3.5;
//        Double b = 3.5;
//        a = b;
        JsonWrapper1 wrapper1 = new JsonWrapper1("10");
        System.out.println(wrapper1);
        Integer a = (Integer) wrapper1.getValue();
        System.out.println(a);
    }
}
