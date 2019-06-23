package project.first.epam.babiuk.PostObserver;

public class PostStation {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        CurrentEntrance currentEntrance =new CurrentEntrance(publisher);
        publisher.setNewEntrance("Murzilka", 120);
        publisher.setNewEntrance("Chip", 60);
    }
}
