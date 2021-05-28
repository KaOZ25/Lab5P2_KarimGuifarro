/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class preparador_fisico extends persona{
    
    public preparador_fisico(String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
    }
    private String ID;
    private int años_contrato;
    private String especialidad;
    private String titulo;

    public preparador_fisico(String ID, int años_contrato, String especialidad, String titulo, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.ID = ID;
        this.años_contrato = años_contrato;
        this.especialidad = especialidad;
        this.titulo = titulo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAños_contrato() {
        return años_contrato;
    }

    public void setAños_contrato(int años_contrato) {
        this.años_contrato = años_contrato;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "preparador_fisico{" + "ID=" + ID + ", a\u00f1os_contrato=" + años_contrato + ", especialidad=" + especialidad + ", titulo=" + titulo + '}';
    }
    
}
