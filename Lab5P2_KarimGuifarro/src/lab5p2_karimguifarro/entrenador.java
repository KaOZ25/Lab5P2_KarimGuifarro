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
public class entrenador extends persona{
    
    public entrenador(String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
    }
    private int duracion_contrato;
    private int cant_copas;

    public int getDuracion_contrato() {
        return duracion_contrato;
    }

    public void setDuracion_contrato(int duracion_contrato) {
        this.duracion_contrato = duracion_contrato;
    }

    public int getCant_copas() {
        return cant_copas;
    }

    public void setCant_copas(int cant_copas) {
        this.cant_copas = cant_copas;
    }

    @Override
    public String toString() {
        return "entrenador{" + "duracion_contrato=" + duracion_contrato + ", cant_copas=" + cant_copas + '}';
    }
    
}
