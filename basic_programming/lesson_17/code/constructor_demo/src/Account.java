public class Account {
    String iban;
    double balance;
    Person owner;


    public String toString(){
        return iban + " Owner: "+owner.toString()+" balance:" + balance;
    }

    public Account(String iban, double balance, Person owner ){
        this.iban=iban;
        this.balance=balance;
        this.owner=owner;
    }

}
