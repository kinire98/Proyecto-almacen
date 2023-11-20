public class Almacen {
    private String direccion;
    private int superficie;
    private Repartidor repartidor;





    public String getDetalles() {
        return "\nDireccion: " + direccion + "\nSuperficie: " + superficie + "\nRepartidor: " + repartidor.getDetalles();
    }
    public void imprimirDetalles() {
        System.out.println(getDetalles());
    }
}
