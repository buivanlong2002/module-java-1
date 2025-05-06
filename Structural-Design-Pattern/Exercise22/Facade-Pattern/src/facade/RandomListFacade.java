package facade;

import java.util.List;

import service.ListFilter;
import service.ListPrinter;
import service.RandomList;

public class RandomListFacade {
    private final RandomList randomList;
    private final ListFilter listFilter;
    private final ListPrinter listPrinter;

    public RandomListFacade() {
        this.randomList = new RandomList();
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
    }

    public void printRandomEvenList() {
        List<Integer> list = randomList.generateList(10, 1, 10);

        List<Integer> evenList = listFilter.filterOdd(list);

        listPrinter.printList(evenList);
    }
}
