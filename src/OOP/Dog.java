package OOP;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String voice(){
        return getName()+"Says: woof";
    }
}
