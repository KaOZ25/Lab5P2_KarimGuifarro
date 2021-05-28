
package lab5p2_karimguifarro;


public class psicologo extends persona{
    
    public psicologo(String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
    }
    private String titulo;
    private String ID;
    private String especialidad;
    private int cant_informes;
    private int cant_pacientes;

    public psicologo(String titulo, String ID, String especialidad, int cant_informes, int cant_pacientes, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.titulo = titulo;
        this.ID = ID;
        this.especialidad = especialidad;
        this.cant_informes = cant_informes;
        this.cant_pacientes = cant_pacientes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCant_informes() {
        return cant_informes;
    }

    public void setCant_informes(int cant_informes) {
        this.cant_informes = cant_informes;
    }

    public int getCant_pacientes() {
        return cant_pacientes;
    }

    public void setCant_pacientes(int cant_pacientes) {
        this.cant_pacientes = cant_pacientes;
    }

    @Override
    public String toString() {
        return "psicologo{" + "titulo=" + titulo + ", ID=" + ID + ", especialidad=" + especialidad + ", cant_informes=" + cant_informes + ", cant_pacientes=" + cant_pacientes + '}';
    }
    
}
