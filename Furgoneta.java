public class Furgoneta {
    private String matricula;
    private int kilometraje;
    
    public String getMatricula(){
        return matricula;
    }
    
    public int getKilometraje(){
        return kilometraje;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setKilometraje(int kilometraje){
        this.kilometraje = kilometraje;
    }

    public String getDetalles() {
        return "Matrícula: " + matricula + "\n" +
                "Kilometraje: " + kilometraje + "\n";
    }

    public void imprimirDetalles() {
        System.out.println(getDetalles());
    }
}
