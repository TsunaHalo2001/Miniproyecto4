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
public class Defensa extends Jugador {
    private int agilidad;
	private int balonesRecuperados;

	public Defensa(String nombre, int edad, int arranque, int velocidad, int resistencia, int agilidad) {
		super(nombre, EnumPosicion.Defensa, edad, arranque, velocidad, resistencia);
		this.agilidad = agilidad;
		this.balonesRecuperados = 0;
	}

	@Override
	public void ganarJuego() {
		super.ganarJuego();
		this.setAgilidad(this.getAgilidad() + 3);
	}

	@Override
	public void empatarJuego() {
		super.empatarJuego();
		this.setAgilidad(this.getAgilidad() + 2);
	}

	@Override
	public void perderJuego() {
		super.perderJuego();
		this.setAgilidad(this.getAgilidad() + 1);
	}

	public void recuperarBalon(int stat) {
		if (stat < (this.getAgilidad() + this.getVelocidad()) / 2) this.balonesRecuperados++;
	}

	public int getAgilidad() {
		return this.agilidad;
	}

	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}
}
