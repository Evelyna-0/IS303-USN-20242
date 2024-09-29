//Ejemplo de abstract factory Evelyn Morales
// Interfaz de productos
interface Chair {
    void sitOn();
}

interface Sofa {
    void lieOn();
}

// Clases concretas de productos
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }
}

class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa.");
    }
}

class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern chair.");
    }
}

class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Modern sofa.");
    }
}

// Interfaz de la fábrica abstracta
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// Clases concretas de fábricas
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

// Uso del Abstract Factory
public class Main {
    public static void main(String[] args) {
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        
        victorianChair.sitOn();  // Salida: Sitting on a Victorian chair.
        victorianSofa.lieOn();   // Salida: Lying on a Victorian sofa.

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        
        modernChair.sitOn();      // Salida: Sitting on a Modern chair.
        modernSofa.lieOn();       // Salida: Lying on a Modern sofa.
    }
}
