// IS A
public class Main {
    public static void main(String[] args) {
        //User user = new VipUser("Jack", "em@mail.my");
        User user = new User("Jack", "em@mail.my");
        System.out.println(user.checkDiscount());

        System.out.println("------------------------");
        User user2 = new SuperVipUser("Lena","lena@gmail.com");
        System.out.println(user2.checkDiscount());
    }
}