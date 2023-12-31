abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String identificacion;
    protected int edad;

    public Persona(String nombre, String apellido, String identificacion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public abstract String getProfesion();

    public abstract void mostrarInformacion();
}