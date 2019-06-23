package project.first.epam.babiuk.GrantState;

public class Created implements GrantState {

    GrantOrder grantOrder;

    public Created(GrantOrder grantOrder) {
        this.grantOrder = grantOrder;
        System.out.println("Grant is creating");
        getCurrentState();
    }

    @Override
    public void getCurrentState() {
            grantOrder.setCurrentState(new Pending(grantOrder));

    }
}
