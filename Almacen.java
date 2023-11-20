public class Almacen {
    private String direccion;
    private int superficie;
    private Repartidor repartidor;
 
    public String getDireccion(){
        return direccion;
    }
    
    public int getSuperficie(){
        return superficie;
    }
    
    public Repartidor getRepartidor(){
        return repartidor;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setSuperficie(int superficie){
        this.superficie = superficie;
    }
    
    public void setRepartidor(Repartidor repartidor){
        this.repartidor = repartidor;
    }



    public String getDetalles() {
        return "\nDireccion: " + direccion + "\nSuperficie: " + superficie + "\nRepartidor: " + repartidor.getDetalles();
    }
    public void imprimirDetalles() {
        System.out.println(getDetalles());
    }
}
