public class Fish implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("This fish is swimming away");
    }

    @Override
    public void flee() {
        System.out.println("The fish is hunting");
    }
}
