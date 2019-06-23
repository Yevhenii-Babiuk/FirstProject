package project.first.epam.babiuk.PostObserver;

import java.util.LinkedList;
import java.util.List;

public class Publisher {
    private List<Observer> observers;
    private String name;
    private int number;
    Publisher(){
        observers = new LinkedList<>();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers)
            observer.newEntrance(name, number);
    }

    public void setNewEntrance(String name, int number) {
        this.name = name;
        this.number = number;
        notifyObservers();
    }
}
