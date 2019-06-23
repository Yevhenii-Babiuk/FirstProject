package project.first.epam.babiuk.GrantState;

import java.util.Random;

public class Pending implements GrantState {

    GrantOrder grantOrder;

    public Pending(GrantOrder grantOrder) {
        this.grantOrder = grantOrder;
        System.out.println("Grant is pending");
        getCurrentState();
    }

    @Override
    public void getCurrentState() {
        switch (new Random().nextInt(3)) {
            case 0:
                grantOrder.setCurrentState(new Delayed(grantOrder));
                break;
            case 1:
                grantOrder.setCurrentState(new Rejected(grantOrder));
                break;
            case 2:
                grantOrder.setCurrentState(new Approved(grantOrder));
                break;
        }
    }
}
