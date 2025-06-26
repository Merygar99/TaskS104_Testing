package level2.exercise4.model;

public abstract class Polygon {
    private String name;

    public Polygon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "name='" + name + '\'' +
                '}';
    }
}
