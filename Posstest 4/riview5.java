public @interface riview5 {

abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public final String getName() { 
        return name;
    }

    public abstract void makeSound(); 
}

final class Dog extends Animal { 
    private final String jenis;
    public Dog(String name, String jenis) {
        super(name);
        this.jenis = jenis;
    }

    public final String getJenis() { // Tidak bisa dioverride
        return jenis;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        final Animal animal = new Dog("Fido", "Bulldog"); // Referensi final (tidak bisa diubah ke objek lain)
        animal.makeSound();

        System.out.println("Nama: " + animal.getName());
        System.out.println("Jenis: " + ((Dog)animal).getJenis()); // Casting ke Dog
    }
}
    }
