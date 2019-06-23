package project.first.epam.babiuk.PersonalTask;

import java.time.LocalDate;

public class Client {
    private String name;
    private String surname;
    private String middleName;
    private int id;
    private LocalDate startDate;

    public Client(String name, String surname,String middleName, int id, LocalDate startDate){
        this.name=name;
        this.surname=surname;
        this.middleName=middleName;
        this.id=id;
        this.startDate=startDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
