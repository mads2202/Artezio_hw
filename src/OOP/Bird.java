package OOP;

public class Bird extends Animal implements Flyable {
    @Override
    public String fly(){
        return"I believe i can fly, i believe i can touch the sky";
    };

    public Bird(String name) {
        super(name);
    }

    @Override
    public String voice(){
        return "tweet";
    }
}
