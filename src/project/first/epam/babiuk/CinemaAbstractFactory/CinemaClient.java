package project.first.epam.babiuk.CinemaAbstractFactory;

import java.util.Scanner;

public class CinemaClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String filmLanguage = in.nextLine().toLowerCase();

        CinemaFactory filmName;

        try {
            filmName = CinemaFactory.getCinema(filmLanguage);
            Soundtrack voice = filmName.getSoundrack();
            voice.Sound();
            Subtitles sub = filmName.getSubtitles();
            sub.text();

        } catch (UnknownCinemaExeption exeption) {
            System.out.println("Unavailable language");
        }
    }
}
