package project.first.epam.babiuk.PersonalTask;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private List<String> author = new ArrayList<>();
    private long id;
    private int year;
    private String city;
    private String publishingName;
    private int totalNumber;
    private int availableNumber;

    public Book(String name, List author, long id, int year, String city, String publishingName, int totalNumber, int availableNumber){
        this.name=name;
        this.author=author;
        this.id=id;
        this.year=year;
        this.city=city;
        this.publishingName=publishingName;
        this.totalNumber=totalNumber;
        this.availableNumber=availableNumber;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getAuthor() {
        return this.author;
    }

    public long getId() {
        return this.id;
    }

    public int getYear() {
        return this.year;
    }

    public String getCity() {
        return this.city;
    }

    public String getPublishingName() {
        return this.publishingName;
    }

    public int getTotalNumber() {
        return this.totalNumber;
    }

    public int getAvailableNumber() {
        return this.availableNumber;
    }

    public void setAvailableNumber(int change){this.availableNumber+=change;}
}
