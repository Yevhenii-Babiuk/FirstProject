package project.first.epam.babiuk.PersonalTask;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class LibraryOrder{
    private List<Observer> observers;
    private int orderId;
    public Book book;
    public Client client;
    private LocalDate start;
    private LocalDate end;
    protected boolean isBack;

    public LibraryOrder() {
        observers = new LinkedList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    private void notifyObserver() {
        for (Observer observer : observers)
            observer.newOrder(this);
    }

    public int getOderId(){return orderId;}
    public LocalDate getStart(){return  start;}
    public LocalDate getEnd(){return end;}
    public  Book getBook(){return book;}

    public void setOrder(int orderId, Book book, Client client, LocalDate start, LocalDate end, boolean isBack) {
        this.orderId=orderId;
        this.book = book;
        this.client = client;
        this.start=start;
        this.end=end;
        this.isBack=isBack;
        notifyObserver();
    }

    @Override
    public String toString() {
        return ("Id: "+orderId+" book: "+book.getName()+" client: "+client.getSurname()+" start date: "+start+" end date: "+end);
    }
}