package ejercicio1;

public class alumno {

    private String nombre; 
    private int edad;
    private double calificacion;
    private boolean aprobado;

    public alumno (String nom,int ed, double cali, boolean aprobo ){
        dameNombre(nom);
        dameEdad(ed);
        dameCalificacion(cali);
        dimeSiAprobo(aprobo);
    }
    
    public void dameNombre(String nom){

        nombre =nom;
    }
     public void dameEdad(int ed){

        edad = ed;
    }
    public void dameCalificacion(double cali){

       calificacion = cali;
    }
    public void dimeSiAprobo(boolean aprobo){

        if(aprobo==true){
        System.out.println("El alumno aprobo");
        }else{
            System.out.println("El alumno reprobo");
        }
    }
    public String devuelveNombre(){
        return nombre;
    }
    public int devuelveEdad(){
        return edad;
    }
    public double devuelveCalificacion(){
        return calificacion;
    }
    public boolean devuelveAprobacion(){
        return aprobado;
    }
}
