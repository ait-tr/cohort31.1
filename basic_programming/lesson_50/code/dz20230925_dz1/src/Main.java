import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = List.of("DE1613321892788;Jack Johnson", "DR16133247;Ivan Ivanov",
                "DE16123227565;");
        List<Account> bankAccounts;
        try {
            bankAccounts = getAccounts(data);
            System.out.println(bankAccounts);
        } catch (Exception e) {
            System.out.println("list not created");
        }

        //mapAccOwners.put(str.split(";")[0], str.split(";")[1]);

        // String[] arr = str.split(";");
        // mapAccOwners.put(arr[0], arr[1]);

    }

    private static List<Account> getAccounts(List<String> data) throws Exception{
        boolean errorFlag = false;
        List<Account> bankAccounts = new ArrayList<>();
        for (String str : data) {
            try {
                bankAccounts.add(createAccountIfDataCorrect(str));
            } catch (AccountCreationException e) {
                errorFlag=true;
                System.out.println(" ----------- " + str + " ------------");
                System.out.println(e.getExceptionMessages());
            }
        }
        if(errorFlag) throw new Exception();
        return bankAccounts;
    }

    /*
    Дан список строк вида:
    DE1613321892788;Jack Johnson
    DE1613324427567;Ivan Ivanov
    DE1612324427565;Ann Smith
    т.е. список банковских счетов с именем владельца. К сожалению, список пришел некорректный: у некоторых счетов
    отсутствуют имена владельцев, некоторые счета не начинаются на DE или короче 15 символов.
    Ваш метод должен сформировать список объектов типа Account (String iban, Person owner), ЕСЛИ ВСЕ ЗАПИСИ корректны,
    либо выкинуть exception. Причем в последнем случае, должна быть сохранена информация о том,
    какие строки и какие проблемы содержали.
     */
    public static Account createAccountIfDataCorrect(String data) throws AccountCreationException {
        List<String> exceptionMessages = new ArrayList<>();
        AccountCreationException exception = new AccountCreationException(exceptionMessages);
        if (data == null || data.isEmpty())  {
            exceptionMessages.add("Data is null or empty");
            throw exception;
        }

        String[] ibanAndOwner = data.split(";");
        String iban = ibanAndOwner[0];

        if (iban.length() < 15) {
            exceptionMessages.add("Iban length is less than 15 symbols");
        }
        if (!iban.startsWith("DE")) {
            exceptionMessages.add("Iban must start with 'DE'");
        }

        Person person=null;
        if (ibanAndOwner.length < 2) {
            exceptionMessages.add("Missing owner data");
        } else {
            String[] nameSurname = ibanAndOwner[1].split(" ");
            if (nameSurname.length>1) {
                person = new Person(nameSurname[0], nameSurname[1]);
                exceptionMessages.add("No name or surname");
            }
        }
        if (person==null) {
            exceptionMessages.add("create owner error");
        }


        if (!exceptionMessages.isEmpty()) throw exception;
        return new Account(iban, person);

    }
}