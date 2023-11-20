public class Repartidor {
    private String nombreCompleto;
    private int antiguedad;
    private Furgoneta furgoneta;





    public String getDetalles () {
        return "\nNombre completo: " + nombreCompleto + "\n" +
                "Antigüedad: " + antiguedad + "\n" +
                "Furgoneta" + furgoneta.getDetalles() + "\n";
    }
    public void imprimirDetalles() {
        System.out.println(getDetalles());
    }
}
