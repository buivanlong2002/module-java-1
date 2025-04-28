package controller;

import model.Order;

public class CustomerNameComparator implements java.util.Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1 == null || o1.getCustomerName() == null) {
            return (o2 == null || o2.getCustomerName() == null) ? 0 : -1;
        }
        if (o2 == null || o2.getCustomerName() == null) {
            return 1;
        }
        return o1.getCustomerName().compareToIgnoreCase(o2.getCustomerName());
    }
}
