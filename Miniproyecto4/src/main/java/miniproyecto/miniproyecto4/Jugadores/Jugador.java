/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproyecto.miniproyecto4.Jugadores;

import miniproyecto.miniproyecto4.Enum.EnumPosicion;

/**
 *
 * @author tsuna
 */
public class Jugador {
	private static int nJugador = 0;
	private int con;
	private final String nombre;
    private EnumPosicion posicion;
	private final int edadInicial;
	private int edad;
	private int juegos;
	private int arranque;
	private int velocidad;
	private int resistencia;

	public Jugador(String nombre, EnumPosicion posicion, int edad, int arranque, int velocidad, int resistencia) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.edad = edad;
		this.edadInicial = edad;
		this.juegos = 0;
		this.arranque = arranque;
		this.velocidad = velocidad;
		this.resistencia = resistencia;
		nJugador++;
		this.con = nJugador;
	}

	public String MostrarInformacion(){
		String info = "<html>" 
					+ "Nombre: " + this.nombre   + "<br>"
					+ "Unidad: " + this.edad + "<br>"
					+ "Numero: " + nJugador + "<br>"
					+ "Posicion: "  + this.posicion  + "<br>"
					+ "</html>";

		return info;
	}

	public static int getNjugadores() {
        return nJugador;
    }
	
	public void setNjugadores(int con) {
		this.con = con;
	}

	public void ganarJuego() {
		juegos++;
		setEdad();
		setArranque(arranque + 3);
		setVelocidad(velocidad + 3);
		setResistencia(resistencia + 3);
	}

	public void empatarJuego() {
		juegos++;
		setEdad();
		setArranque(arranque + 2);
		setVelocidad(velocidad + 2);
		setResistencia(resistencia + 2);
	}

	public void perderJuego() {
		juegos++;
		setEdad();
		setArranque(arranque + 1);
		setVelocidad(velocidad + 1);
		setResistencia(resistencia + 1);
	}

	public static int getnJugador() {
		return nJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public EnumPosicion getPosicion() {
		return posicion;
	}

	public int getEdad() {
		return edad;
	}

	public int getJuegos() {
		return juegos;
	}

	public int getArranque() {
		return arranque;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setPosicion(EnumPosicion posicion) {
		this.posicion = posicion;
	}

	public void setEdad() {
		this.edad = edadInicial + juegos / 20;
	}

	public void setJuegos(int juegos) {
		this.juegos = juegos;
	}

	public void setArranque(int arranque) {
		this.arranque = arranque;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public static void resetear() {
		nJugador = 0;
	}


}
