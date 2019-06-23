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
    public void newOrder(LibraryOrder order) {
        orderBase.add(order);
        order.book.availableNumber -= 1;
        display();
    }

    public void serchBooksByStartDate(LocalDate min, LocalDate max) {
        for (LibraryOrder order : orderBase) {
            if (order.getStart().isAfter(min) && order.getStart().isBefore(max)) {
                System.out.println(order);
            }
        }
    }

    public void serchBooksByEndDate(LocalDate min, LocalDate max) {
        for (LibraryOrder order : orderBase) {
            if (order.getEnd().isAfter(min) && order.getStart().isBefore(max)) {
                System.out.println(order);
            }
        }
    }

    public void setStatusBack(int orderId) {
        for (LibraryOrder order : orderBase) {
            if (order.getOderId() == orderId) {
                order.book.availableNumber += 1;
                order.isBack = true;
                System.out.println("Your book is back");
            }
        }
    }

    public void searchBooksByClient(String surname){
        for (LibraryOrder order : orderBase) {
            if(surname.equals(order.client.getSurname())){
                System.out.println(order.getBook().getName());
            }
        }
    }


    public void display() {
        System.out.println("New order is registered");
    }
}
