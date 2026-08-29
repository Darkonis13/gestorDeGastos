import java.util.ArrayList;

class Persona {
    String nombre = "Deko";
    double sueldo = 760000;
    ArrayList<Gasto> gastosPersonales = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Gasto> getGastosPersonales() {
        return gastosPersonales;
    }

    public void agregarGasto(Gasto unGasto) {
        this.gastosPersonales.add(unGasto);
    }

    public void mostrarGasto() {
        System.out.println("\nGastos totales: ");
        this.getGastosPersonales().forEach(gasto -> gasto.mostrarGasto());
    }

    public void mostrarInfo() {
        System.out.println("\nNombre: " + this.getNombre());
        System.out.println("Sueldo: $" + this.getSueldo());

    }

}
