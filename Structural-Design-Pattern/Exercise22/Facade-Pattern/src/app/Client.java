package app;

import facade.RandomListFacade;

public class Client {
    public static void main(String[] args) {
        RandomListFacade facade = new RandomListFacade();
        facade.printRandomEvenList();
    }
}
