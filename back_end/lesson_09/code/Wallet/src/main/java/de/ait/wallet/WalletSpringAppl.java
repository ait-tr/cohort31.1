package de.ait.wallet;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WalletSpringAppl {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Wallet wallet = context.getBean("wallet", Wallet.class);

        wallet.makePayment();

    }
}
