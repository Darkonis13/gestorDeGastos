import java.time.LocalDate;

public class Ingreso extends Transaccion {
    public Ingreso(LocalDate fecha, double monto, String descripcion) {
        super(fecha, monto, descripcion);
    }
}
