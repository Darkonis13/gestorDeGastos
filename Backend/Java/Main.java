import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona deko = new Persona("Deko", 780000);
        Gasto nuevoGasto = new Gasto("Papas fritas", 12000, CategoriaGasto.COMIDA, LocalDate.now());

        deko.agregarTransaccion(nuevoGasto);

        deko.mostrarInfo();
        deko.mostrarTransacciones();
    }

}