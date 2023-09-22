/*
Представте, вы пишете банковскую программу.
Создайте два checked exception:   AccountFormatException и WrongAccountCountryCodeException.
Напишите метод, который получает строеку с номером вида: DE171271782891.
Если строка короче 14 символов или длиннее 16  - >  AccountFormatException.
Если строка не начинается с символов "DE" - WrongAccountCountryCodeException,
если что-то другое (например передан null) ->  IllegalArgumentException.
При нормалтном потоке выполнения, метод создает новый объект Accaunt и возвращает его.
Напишите вызов вашего метода с обработкой возможных исключений.

 */

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list= List.of("DE1234567890123","DE1234567890124","DR1234567890123","DD1234567");
        List<Account> accounts = new ArrayList<>();

        for (String str: list) {

            try {
                accounts.add(createAccount(str));

            } catch (AccountCreateException e) {
                System.out.println("---  " +str);
                System.out.println(e.getErrorsList());
            }
        }

        System.out.println(accounts);
    }

    public static Account createAccount(String iban) throws AccountCreateException{
        List<String> errors = new ArrayList<>();
        AccountCreateException exception = new AccountCreateException(errors);

        if(iban==null || !isNumbersOnly(iban.substring(2))) errors.add("Error 1");
        if(iban.length()<14 || iban.length()>16) errors.add("Error 2");
        if(!iban.startsWith("DE")) errors.add("Error 3");

        if(!errors.isEmpty()) throw exception;

        return new Account(iban);
    }

    private  static boolean isNumbersOnly(String str){
        for (char ch:str.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }

}