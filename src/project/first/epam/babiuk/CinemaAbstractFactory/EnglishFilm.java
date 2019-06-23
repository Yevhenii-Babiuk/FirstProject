package project.first.epam.babiuk.CinemaAbstractFactory;

public class EnglishFilm extends CinemaFactory {
    @Override
    public Soundtrack getSoundrack() {
        return new EnglishSoundtrack();
    }

    @Override
    public Subtitles getSubtitles() {
        return new EnglishSubtitles();
    }
}
