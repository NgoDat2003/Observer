package composite.entity;

import java.util.ArrayList;
import java.util.List;

public class Cafe implements Component {
    private String name;
    private List<Component> tables;

    public Cafe(String name) {
        this.name = name;
        this.tables = new ArrayList<>();
    }

    public void addTable(Component table) {
        tables.add(table); 
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Component table : tables) {
            total += table.getPrice(); 
        }
        return total;
    }

    public String getName() {
        return name;
    }
}
