public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name +" "+  email;
    }

    public int  checkDiscount(){
        System.out.println("this user have not any discount");
        return 0;
    }


}
