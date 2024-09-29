//Ejemplo de Builder Evelyn Morales
// Clase Product
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    // Constructor privado
    private Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    // Clase Builder
    public static class CarBuilder {
        private String make;
        private String model;
        private int year;
        private String color;

        public CarBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // Método para construir el objeto Car
        public Car build() {
            return new Car(this);
        }
    }
}

// Uso del Builder
public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setMake("Toyota")
                .setModel("Corolla")
                .setYear(2021)
                .setColor("Rojo")
                .build();

        System.out.println(car);  // Salida: Car{make='Toyota', model='Corolla', year=2021, color='Rojo'}
    }
}
