package project.first.epam.babiuk.CinemaAbstractFactory;

public abstract class CinemaFactory {

    private static CinemaFactory EnglishFilm = null;
    private static CinemaFactory UkrainianFilm = null;

    public abstract Soundtrack getSoundrack();

    public abstract Subtitles getSubtitles();

    public static CinemaFactory getCinema(String filmLanguage)
            throws UnknownCinemaExeption {
        if (filmLanguage == null) {
            return null;
        }

        CinemaFactory cinema = null;
        switch (filmLanguage) {
            case "english":
                if (EnglishFilm == null)
                    EnglishFilm = new EnglishFilm();
                cinema = EnglishFilm;
                break;
            case "ukrainian":
                if (UkrainianFilm == null)
                    cinema = new UkrainianFilm();
                cinema = UkrainianFilm;
                break;
            default:
                throw new UnknownCinemaExeption();
        }
        return cinema;
    }

}