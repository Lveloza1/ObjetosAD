package clases;


public class Persona {

    private long identificacion;
    private String primer_nombre;
    private String primer_apellido;

    public Persona(long identificacion, String primer_nombre, String primer_apellido) {
        this.identificacion = identificacion;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
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

}
