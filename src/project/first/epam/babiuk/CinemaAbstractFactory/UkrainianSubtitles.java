package project.first.epam.babiuk.CinemaAbstractFactory;

public class UkrainianSubtitles implements Subtitles {
    @Override
    public void text() {
        System.out.println("Now you use ukrainian subtitles");
    }
}
