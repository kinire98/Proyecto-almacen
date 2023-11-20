public class Repartidor {
    private String nombreCompleto;
    private int antiguedad;
    private Furgoneta furgoneta;

    public String getNombreCompleto(){
        return nombreCompleto;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public Furgoneta getFurgoneta(){
        return furgoneta;
    }
    
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    
    public void setFurgoneta(Furgoneta furgoneta){
        this.furgoneta = furgoneta;
    }



    public String getDetalles () {
        return "\nNombre completo: " + nombreCompleto + "\n" +
                "Antigüedad: " + antiguedad + "\n" +
                "Furgoneta" + furgoneta.getDetalles() + "\n";
    }
    public void imprimirDetalles() {
        System.out.println(getDetalles());
    }
}
