// Ejemplo Factory method Evelyn Morales
// Interfaz de producto
interface Animal {
    void speak();
}

// Clases concretas de productos
class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

// Clase creadora abstracta
abstract class AnimalFactory {
    public abstract Animal createAnimal();
}

// Clases concretas de creador
class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

// Uso del Factory Method
public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();  // Salida: Woof!

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.speak();  // Salida: Meow!
    }
}
