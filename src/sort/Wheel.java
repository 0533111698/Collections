package sort;

public class Wheel implements Comparable<Wheel> {
    private double diameter;

    public Wheel(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public int compareTo(Wheel o) {
        if (this.getDiameter()<o.getDiameter())
            return -1;
        if (this.getDiameter()>o.getDiameter())
            return 1;
        else
        return 0;
    }
}
