package project.first.epam.babiuk.GrantState;

public class Delayed implements GrantState {

    GrantOrder grantOrder;
    public Delayed(GrantOrder grantOrder) {
        this.grantOrder = grantOrder;
        System.out.println("Grant is delayed");
        getCurrentState();
    }

    @Override
    public void getCurrentState() {
        grantOrder.setCurrentState(new Pending(grantOrder));
    }
}

