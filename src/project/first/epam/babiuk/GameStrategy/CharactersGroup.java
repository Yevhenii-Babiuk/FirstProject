package project.first.epam.babiuk.GameStrategy;

import java.util.ArrayList;

public class CharactersGroup extends Characters {
    private Motion flying = null;
    private Motion walking = null;
    private ArrayList<Characters> characters = new ArrayList<>();

    public CharactersGroup(Motion action) {
        super(action);
        if (action instanceof Walking)
            this.walking = action;
        else this.flying = action;
    }

    public CharactersGroup(Motion action1, Motion action2) {
        super(action1, action2);
        this.flying = action1;
        this.walking = action2;
    }

    public void add(Characters newGroupCharacter){
        characters.add(newGroupCharacter);
    }
    public void remowe(Characters removeSomeCharacters){
        characters.remove(removeSomeCharacters);
    }

    @Override
    public void move() {
        if (walking != null)
            walking.motion();
        if (flying != null)
            flying.motion();
    }
}
