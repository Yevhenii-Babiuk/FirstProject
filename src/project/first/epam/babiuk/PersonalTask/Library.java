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
        orderBase.add(orders);
        orders.book.availableNumber -= 1;
        display();
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
            if (orders.getEnd().isAfter(min) && orders.getEnd().isBefore(max)) {
                System.out.println(orders);
            }
        }
    }

    public void setStatusBack(int orderId) {
        for (LibraryOrder orders : orderBase) {
            if (orders.getOderId() == orderId) {
                orders.book.availableNumber += 1;
                orders.isBack = true;
                System.out.println("Your book is back");
            }
        }
    }

    public void searchBooksByClient(String surname){
        for (LibraryOrder orders : orderBase) {
            if(orders.client.getSurname().equals(surname)){
                System.out.println(orders.book.getName());
            }
        }
    }


    public void display() {
        System.out.println("New order is registered");
    }
}
