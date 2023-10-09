import java.util.List;

public class Main {
  public static void main(String[] args) {

//    Дан список  BankAccount { Person person, String IBAN, double balance).
//    Используя знания о stream необходимо сформировать лист
//      из  BankAccount, баланс которых составляет менее 100.
//      из Person  баланс которых составляет больше заданного N.
    List<BankAccount> accounts = List.of(
        new BankAccount(
            new Person("John Smith", 20),
            "DE133123218",
            20_000
        ),
        new BankAccount(
            new Person("Fred Goodman", 40),
            "DE13312321123",
            40
        ),
        new BankAccount(
            new Person("Anna Freud", 40),
            "DE133123211232",
            15_000
        ),
        new BankAccount(
            new Person("George Harrison", 40),
            "DE133123211231",
            95
        )
    );
    List<BankAccount> poorAccounts = accounts
        .stream()
        .filter(account -> account.getBalance() < 100)
        .toList();
    System.out.println(poorAccounts);

    double n = 120;
    List<Person> filteredPersons = accounts
        .stream()
        .filter(account -> account.getBalance() > n)
        .map(BankAccount::getPerson)
        .toList();
    System.out.println(filteredPersons);

    List<Fruit> fruits = List.of(
        new Fruit("Mango", 200),
        new Fruit("Apple", 100),
        new Fruit("Banana", 50),
        new Fruit("Kiwi", 40)
    );
    List<Fruit> newFruits = fruits
        .stream()
        .map(fruit -> new Fruit(fruit.title, fruit.weight + 100)
        )
        .toList();
    System.out.println(fruits);
  }
}