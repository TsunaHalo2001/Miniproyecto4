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
public class Delantero extends Jugador {
    private int precision;
	private int goles;

	public Delantero(String nombre, int edad, int arranque, int velocidad, int resistencia, int precision) {
		super(nombre, EnumPosicion.Delantero, edad, arranque, velocidad, resistencia);
		this.precision = precision;
		this.goles = 0;
	}

	@Override
	public void ganarJuego() {
		super.ganarJuego();
		this.setPrecision(this.getPrecision() + 3);
	}

	@Override
	public void empatarJuego() {
		super.empatarJuego();
		this.setPrecision(this.getPrecision() + 2);
	}

	@Override
	public void perderJuego() {
		super.perderJuego();
		this.setPrecision(this.getPrecision() + 1);
	}

	public void marcarGol(int stat, Mediocampista asistidor) {
		if (stat < this.getPrecision()){
			this.goles++;
			asistidor.asistir(stat);
		}
	}

	public int getPrecision() {
		return this.precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public int getGoles() {
		return this.goles;
	}
}
