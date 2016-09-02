package clases;


public class Persona {

    private long identificacion;
    private String primer_nombre;
    private String primer_apellido;
    private String genero;

    public Persona(long identificacion, String primer_nombre, String primer_apellido, String genero) {
        this.identificacion = identificacion;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.genero= genero;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }
    public String getGenero() {
        return genero;
    }
    public void setPrimer_nombre(String primer_nombre){
        this.primer_nombre= primer_nombre;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }
    public void setgenero(String genero){
        this.genero=genero;
    }
    

}
