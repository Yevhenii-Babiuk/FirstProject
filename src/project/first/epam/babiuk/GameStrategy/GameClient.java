package project.first.epam.babiuk.GameStrategy;

public class GameClient {
    public static void main(String[] args) {
        Characters ork = new Characters(new Walking());
        ork.move();

        Characters magician = new Characters(new Walking(), new Flying());
        magician.move();

        CharactersGroup magicGroup = new CharactersGroup(new Flying());
        magicGroup.add(ork);

        magicGroup.move();
    }
}
