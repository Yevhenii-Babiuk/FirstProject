package project.first.epam.babiuk.GrantState;

public class Rejected implements GrantState {
    GrantOrder grantOrder;
    public Rejected(GrantOrder grantOrder){
        this.grantOrder=grantOrder;
        getCurrentState();
    }
    @Override
    public void getCurrentState() {
        System.out.println("Grant is rejected\nSorry");
    }
}
