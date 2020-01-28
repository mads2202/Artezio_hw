package OOP;

public class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super(name);
    }

    @Override
    public String voice(){
        return "roar";
    }
}
