package collection;

import java.util.Objects;

public class Order {
    public String order;
    public String number;

    public Order(String order, String number) {
        this.order = order;
        this.number = number;
    }

    public String getOrder() {
        return order;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order1 = (Order) o;
        return Objects.equals(order, order1.order) &&
                Objects.equals(number, order1.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, number);
    }

    @Override
    public String toString() {
        return  "order='" + order + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
