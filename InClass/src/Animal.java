public class Animal implements Comparable<Animal> {
    private String name;

    public Animal(String name ) {
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareTo(o.name);
    }
}
