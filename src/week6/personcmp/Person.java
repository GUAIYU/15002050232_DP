package work6.personcmp;

public class Person {
    private String name;
    private int height;
    private int weight;

    public Person(String name,int height, int weight){
        this.name=name;
        this.weight=weight;
        this.height=height;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}