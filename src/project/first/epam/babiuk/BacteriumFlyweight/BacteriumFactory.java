package project.first.epam.babiuk.BacteriumFlyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BacteriumFactory {
    List<Bacterium> bacteria = new ArrayList<>();
    private static Random random = new Random();
    private static String[] types = {"bad", "good"};
    private static String[] tasks = {"production", "cleaning", "killing"};

    public static String getType() {
        return types[random.nextInt(types.length)];
    }

    public static String getTask() {
        return tasks[random.nextInt(tasks.length)];
    }
    public BacteriumFactory() {
        for (int i = 0; i < 3; i++) {
            bacteria.add(new Bacterium("Bacterium " + (i + 1)));
        }
    }

    public Bacterium getBacterium() {
        for (Bacterium bacterium : bacteria) {
            if (!bacterium.isActive()) {
                bacterium.setProperties(getTask(), getType());
                return bacterium;
            }
        }
        return null;
    }
}
