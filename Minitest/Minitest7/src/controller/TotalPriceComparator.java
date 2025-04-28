package controller;

import model.Order;

public class TotalPriceComparator implements java.util.Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1 == null) {
            return (o2 == null) ? 0 : -1;
        }
        if (o2 == null) {
            return 1;
        }
        return Double.compare(o1.calculateTotalPrice(), o2.calculateTotalPrice());
    }
}