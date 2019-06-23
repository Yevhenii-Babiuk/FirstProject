package project.first.epam.babiuk.PostObserver;

public class CurrentEntrance implements Observer{
    private String name;
    private int number;
    private Publisher publisher;

    public  CurrentEntrance(Publisher publisher){
        this.publisher=publisher;
        publisher.registerObserver(this);
    }
    @Override
    public void newEntrance(String name, int number) {
        this.name=name;
        this.number =number;
        sendPost();
    }
    public void sendPost(){
        System.out.printf("%d of %s has sent to subscriber\n", number, name);
    }
}
