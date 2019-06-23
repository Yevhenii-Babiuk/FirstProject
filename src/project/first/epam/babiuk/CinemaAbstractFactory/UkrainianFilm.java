package project.first.epam.babiuk.CinemaAbstractFactory;

public class UkrainianFilm extends CinemaFactory {
    @Override
    public Soundtrack getSoundrack() {
        return new UkrainianSoundtrack();
    }

    @Override
    public Subtitles getSubtitles() {
        return new UkrainianSubtitles();
    }
}
