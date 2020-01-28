package OOP;

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public String voice(){
        return "whinny";
    }

}
