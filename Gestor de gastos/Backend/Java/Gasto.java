public class Gasto {
    private String descripcion = "";
    private double monto = 0;
    private CategoriaGasto categoria = CategoriaGasto.OTROS;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setMonto(double monto) {
        if (monto > 0) {
            this.monto = monto;
        } else {
            throw new IllegalArgumentException("\nEl monto a ingresar debe ser mayor que cero.");
        }

    }

    public double getMonto() {
        return this.monto;
    }

    public void setCategoria(CategoriaGasto categoria) {
        this.categoria = categoria;
    }

    public CategoriaGasto getCategoria() {
        return this.categoria;
    }

    public void mostrarGasto() {
        System.out.println("\nDescripción: " + this.getDescripcion());
        System.out.println("Categoría: " + this.getCategoria());
        System.out.println("Monto: $" + this.getMonto() + "\n");
    }
}