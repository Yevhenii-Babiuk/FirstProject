package project.first.epam.babiuk.GameStrategy;

public class Characters {
    private Motion flying = null;
    private Motion walking = null;

    public Characters(Motion action) {
        if (action instanceof Walking)
            this.walking = action;
        else this.flying = action;
    }

    public Characters(Motion action1, Motion action2) {
        this.flying = action1;
        this.walking = action2;
    }

    public void move() {
        if (walking != null)
            walking.motion();
        if (flying != null)
            flying.motion();
    }
}
