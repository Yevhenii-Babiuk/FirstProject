package project.first.epam.babiuk.BacteriumFlyweight;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        BacteriumFactory factory = new BacteriumFactory();
        for (int i = 0; i < 20; i++) {
            Bacterium bacterium = factory.getBacterium();
            if (bacterium != null) {
                System.out.println("Bacterium " + (i + 1));
                bacterium.addToColony();
            } else {
                i--;
                Thread.sleep(1000);
            }
        }
    }
}
