package project.first.epam.babiuk.RecipeProxy;

import java.time.LocalDate;

public interface Recipe {
    void display();
    String getText();
    LocalDate getExpiration();
}
