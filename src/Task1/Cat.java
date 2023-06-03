package Task1;

public class Cat {
    private String name;
    private int age;

    private Owner owner;

    public void greet(){
        String ownerName = owner.getName();
        System.out.printf("Мяу! Меня зовут %s. Мне %2s года(лет). Мой владелец %3s%n", name, age, ownerName);
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
