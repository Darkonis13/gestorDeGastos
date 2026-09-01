import java.util.ArrayList;

class Persona {
    String nombre;
    double sueldo;
    ArrayList<Transaccion> transaccionesPersonales = new ArrayList<>();

    public Persona(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

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

    public ArrayList<Transaccion> getTransaccionesPersonales() {
        return this.transaccionesPersonales;
    }

    public void agregarTransaccion(Transaccion unaTransaccion) {
        this.transaccionesPersonales.add(unaTransaccion);
    }

    public void mostrarTransacciones() {
        System.out.println("\nMovimientos: ");
        this.getTransaccionesPersonales().forEach(transaccion -> transaccion.mostrarTransaccion());
    }

    public void mostrarInfo() {
        System.out.println("\nNombre: " + this.getNombre());
        System.out.println("Sueldo: $" + this.getSueldo());

    }

}
