// Clase base Dispositivo
class Dispositivo {
    protected String marca;
    protected String modelo;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println("El dispositivo " + marca + " " + modelo + " se está encendiendo.");
    }
}

// Subclase Telefono
class Telefono extends Dispositivo {
    public Telefono(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void encender() {
        System.out.println("El teléfono " + marca + " " + modelo + " se está encendiendo. Bienvenido.");
    }
}

// Subclase Laptop
class Laptop extends Dispositivo {
    public Laptop(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void encender() {
        System.out.println("La laptop " + marca + " " + modelo + " está iniciando el sistema.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dispositivo miTelefono = new Telefono("Samsung", "Galaxy S21");
        Dispositivo miLaptop = new Laptop("Dell", "XPS 15");

        miTelefono.encender();
        miLaptop.encender();
    }
}
