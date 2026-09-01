import java.time.LocalDate;

class Transaccion {
    private String descripcion;
    private double monto;
    private LocalDate fecha;

    public Transaccion(LocalDate fecha, double monto, String descripcion) {
        this.fecha = fecha;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        if (monto > 0) {
            this.monto = monto;
        } else {
            throw new IllegalArgumentException("\nEl monto a ingresar debe ser mayor que cero.");
        }

    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void mostrarTransaccion() {
        System.out.println("\nDescripción: " + this.getDescripcion());
        System.out.println("Monto: $" + this.getMonto());
        System.out.println("Fecha: " + this.getFecha());
    }
}