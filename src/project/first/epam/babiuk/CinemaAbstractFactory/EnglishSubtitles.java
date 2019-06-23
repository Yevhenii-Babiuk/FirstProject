package project.first.epam.babiuk.CinemaAbstractFactory;

public class EnglishSubtitles implements Subtitles {
    @Override
    public void text() {
        System.out.println("Now you use english subtitles");
    }
}
