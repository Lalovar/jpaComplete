package appJPA;

import dao.DaoProduct;

public class App {
    public static boolean getGreeting() {
        DaoProduct x = new DaoProduct();
        x.run();
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getGreeting());
    }
}