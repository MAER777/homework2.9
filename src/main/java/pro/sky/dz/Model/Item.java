package pro.sky.dz.Model;

import java.util.Objects;

public class Item {
    private int id;

    private String product;
    public Item(int id, String product) {
        this.id = id;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", product='" + product + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(product, item.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product);
    }

}
