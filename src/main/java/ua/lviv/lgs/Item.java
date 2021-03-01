package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {
    private Integer id;
    private String total;
    private Set<Cart> cartSet = new HashSet<>();

    public Item(String total) {
        this.total = total;
    }

    public Item() {
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

    public Set<Cart> getCartSet() {
        return cartSet;
    }

    public void setCartSet(Set<Cart> cartSet) {
        this.cartSet = cartSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) && Objects.equals(total, item.total) && Objects.equals(cartSet, item.cartSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, cartSet);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", total='" + total + '\'' +
                '}';
    }
}
