package project.first.epam.babiuk.PersonalTask;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;


public class Library implements Observer {
    private List<LibraryOrder> orderBase = new ArrayList<>();
    private LibraryOrder order;

    public Library(LibraryOrder order) {
        this.order = order;
        order.registerObserver(this);
    }

    @Override
    public void newOrder(LibraryOrder orders) {
        try {
            LibraryOrder newLibraryOrder = orders.clone();
            orderBase.add(newLibraryOrder);
            orders.getBook().setAvailableNumber(-1);
            display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void serchBooksByStartDate(LocalDate min, LocalDate max) {
        for (LibraryOrder orders : orderBase) {
            if (orders.getStart().isAfter(min) && orders.getStart().isBefore(max)) {
                System.out.println(orders);
            }
        }
    }

    public void serchBooksByEndDate(LocalDate min, LocalDate max) {
        for (LibraryOrder orders : orderBase) {
            if (orders.getEnd().isAfter(min) && orders.getEnd().isBefore(max) && orders.getBack()) {
                System.out.println(orders);
            }
        }
    }

    public void setStatusBack(int orderId) {
        for (LibraryOrder orders : orderBase) {
            if (orders.getOderId() == orderId) {
                orders.getBook().setAvailableNumber(1);
                orders.setBack();
                System.out.println("Your book is back");
            }
        }
    }

    public void searchBooksByClient(String surname) {
        for (LibraryOrder orders : orderBase) {
            if (orders.getClient().getSurname().equals(surname)&&!orders.getBack()) {
                System.out.println(surname+" is reading "+orders.getBook().getName());
            }
        }
    }


    public void display() {
        System.out.println("New order is registered");
    }

    public void printAllOrders() {
        for (LibraryOrder orders : orderBase) {
            System.out.println(orders);
        }
    }
}
