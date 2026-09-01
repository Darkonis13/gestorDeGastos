import java.time.LocalDate;

public class Gasto extends Transaccion {
    private CategoriaGasto categoria;

    public Gasto(String descripcion, double monto, CategoriaGasto categoria, LocalDate fecha) {
        super(fecha, monto, descripcion);
        this.categoria = categoria;
    }

    public void setCategoria(CategoriaGasto categoria) {
        this.categoria = categoria;
    }

    public CategoriaGasto getCategoria() {
        return this.categoria;
    }

    @Override
    public void mostrarTransaccion() {
        super.mostrarTransaccion();
        System.out.println("Categoría: " + this.getCategoria() + "\n");
    }
}