package sort;

public class Pizza implements Comparable<Pizza> {
    private int slices;
    private double price;

    public Pizza(int slices, double price) {
        this.slices = slices;
        this.price = price;
    }

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "slices=" + slices +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Pizza o) {
        if (this.getPrice()<o.getPrice())
            return 1;
        if (this.getPrice()>o.getPrice())
            return -1;
        else
        return 0;
    }
}
