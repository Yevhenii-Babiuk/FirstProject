package project.first.epam.babiuk.PersonalTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {
        Client client = new Client("Yevhenii", "Babiuk", "Mycholayovich", 1, LocalDate.of(2018,6,2));
        ClientBase clientBase=new ClientBase();
        clientBase.addClient(client);

        List<String>alphabetAuthors=new ArrayList<>();
        alphabetAuthors.add("Petrov");
        alphabetAuthors.add("Shevchenko");
        Book alphabet=new Book("Alphabet",alphabetAuthors,1234, 2016,"Kiyv", "Ababagalamaga", 153, 100);

        LibraryOrder order = new LibraryOrder();
        Library control = new Library(order);

        order.setOrder(1111,alphabet, client, LocalDate.of(2019,3,5),LocalDate.of(2019,4,5), false);

        control.searchBooksByClient("Babiuk");

        control.serchBooksByStartDate(LocalDate.of(2019,2,25), LocalDate.of(2019,3,10));
        control.serchBooksByEndDate(LocalDate.of(2019,3,25), LocalDate.of(2019,5,5));
        System.out.println(alphabet.getAvailableNumber());
        control.setStatusBack(1111);
        System.out.println(alphabet.getAvailableNumber());
    }
}
