package OOP;

public abstract class Animal  {
    private String name;
    public abstract String voice();
    public Animal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
