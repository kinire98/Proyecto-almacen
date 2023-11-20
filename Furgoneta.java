public class Furgoneta {
    private String matricula;
    private int kilometraje;
    
    public String getMatricula(){
        return matricula;
    }
    
    public int getKilometraje(){
        return kilometraje;
    }
    
    public void setMatricula(String nuevaMatricula){
        matricula = nuevaMatricula;
    }
    
    public void setKilometraje(int nuevoKilometraje){
        kilometraje = nuevoKilometraje;
    }

    public String getDetalles() {
        return "Matrícula: " + matricula + "\n" +
                "Kilometraje: " + kilometraje + "\n";
    }

    public void imprimirDetalles() {
        System.out.println(getDetalles());
    }
}
