public class Main {
    public static void main(String[] args) {
        Persona deko = new Persona();
        Gasto nuevoGasto = new Gasto();

        nuevoGasto.setCategoria(CategoriaGasto.COMIDA);
        nuevoGasto.setDescripcion("Papas fritas");
        nuevoGasto.setMonto(12000);

        deko.setNombre("Diego");
        deko.setSueldo(780000);
        deko.agregarGasto(nuevoGasto);

        deko.mostrarInfo();
        deko.mostrarGasto();
    }

}