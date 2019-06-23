package project.first.epam.babiuk.GrantState;

public class Approved implements GrantState {

    GrantOrder grantOrder;

    public Approved(GrantOrder grantOrder) {
        this.grantOrder = grantOrder;
        getCurrentState();
    }

    @Override
    public void getCurrentState() {
            System.out.println("Your order approved\nCongratulate you!");
        }
}
