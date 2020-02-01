package OOP;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String voice(){
        return getName()+" Says: Meow";
    }
}
