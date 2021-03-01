package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cart {
    private Integer id;
    private String total;
    private String name;
    private Set<Item> itemSet = new HashSet<>();

    public Cart() {
    }

    public Cart(String total, String name) {
        this.total = total;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItemSet() {
        return itemSet;
    }

    public void setItemSet(Set<Item> itemSet) {
        this.itemSet = itemSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(id, cart.id) && Objects.equals(total, cart.total) && Objects.equals(name, cart.name) && Objects.equals(itemSet, cart.itemSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, name, itemSet);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", total='" + total + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
