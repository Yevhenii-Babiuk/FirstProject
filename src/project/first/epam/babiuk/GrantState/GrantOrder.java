package project.first.epam.babiuk.GrantState;

public class GrantOrder {

private GrantState currentState;

public  GrantOrder(){
    this.currentState= new Created(this);}

    public GrantState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GrantState currentState) {
        this.currentState = currentState;
    }

}
