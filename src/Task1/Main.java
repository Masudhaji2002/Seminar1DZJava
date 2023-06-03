package Task1;

// я сделал больше чем нужно, так как хотел чтобы выводились имена и возраст, когда я делал прям по тз,
// у меня в принте выводилось имя null, возраст 0, владелец null
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 6);
        Owner owner = new Owner("Masud");
        cat.setOwner(owner);
        cat.greet();
    }
}