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
public class jugador extends persona{
    
    public jugador(String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
    }
    private int num_jugador;
    private int partidos_jugados;
    private int cant_copas;
    private int cant_amarillas;
    private int cant_rojas;
    private int duracion_contrato;

    public jugador(int num_jugador, int partidos_jugados, int cant_copas, int cant_amarillas, int cant_rojas, int duracion_contrato, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.num_jugador = num_jugador;
        this.partidos_jugados = partidos_jugados;
        this.cant_copas = cant_copas;
        this.cant_amarillas = cant_amarillas;
        this.cant_rojas = cant_rojas;
        this.duracion_contrato = duracion_contrato;
    }

    public int getNum_jugador() {
        return num_jugador;
    }

    public void setNum_jugador(int num_jugador) {
        this.num_jugador = num_jugador;
    }

    public int getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(int partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }

    public int getCant_copas() {
        return cant_copas;
    }

    public void setCant_copas(int cant_copas) {
        this.cant_copas = cant_copas;
    }

    public int getCant_amarillas() {
        return cant_amarillas;
    }

    public void setCant_amarillas(int cant_amarillas) {
        this.cant_amarillas = cant_amarillas;
    }

    public int getCant_rojas() {
        return cant_rojas;
    }

    public void setCant_rojas(int cant_rojas) {
        this.cant_rojas = cant_rojas;
    }

    public int getDuracion_contrato() {
        return duracion_contrato;
    }

    public void setDuracion_contrato(int duracion_contrato) {
        this.duracion_contrato = duracion_contrato;
    }

    @Override
    public String toString() {
        return "jugador{" + "num_jugador=" + num_jugador + ", partidos_jugados=" + partidos_jugados + ", cant_copas=" + cant_copas + ", cant_amarillas=" + cant_amarillas + ", cant_rojas=" + cant_rojas + ", duracion_contrato=" + duracion_contrato + '}';
    }
    
    
}
