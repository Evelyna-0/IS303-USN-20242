//Ejemplo de Syngleton Evelyn Morales
public class Singleton {
    // La única instancia de la clase
    private static Singleton instance;

    // Constructor privado para evitar la instanciación externa
    private Singleton() {
    }

    // Método público para obtener la instancia
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Un método de ejemplo
    public void showMessage() {
        System.out.println("Hola desde el Singleton!");
    }
}

// Uso del Singleton
public class Main {
    public static void main(String[] args) {
        // Obtener la única instancia del Singleton
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();  // Salida: Hola desde el Singleton!

        // Obtener otra referencia a la misma instancia
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);  // Salida: true
    }
}
