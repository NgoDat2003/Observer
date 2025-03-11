package composite.entity;

import java.util.ArrayList;
import java.util.List;

public class Table implements Component {
    private String name;
    private List<Component> products;

    public Table(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Component product) {
        products.add(product);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Component product : products) {
            total += product.getPrice(); 
        }
        return total;
    }

    public String getName() {
        return name;
    }
}
