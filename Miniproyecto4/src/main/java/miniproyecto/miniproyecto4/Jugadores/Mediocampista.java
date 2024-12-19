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
public class Mediocampista extends Jugador {
    private int iq;
	private int asistencias;

	public Mediocampista(String nombre, int edad, int arranque, int velocidad, int resistencia, int iq) {
		super(nombre, EnumPosicion.Mediocampista, edad, arranque, velocidad, resistencia);
		this.iq = iq;
		this.asistencias = 0;
	}

	@Override
	public void ganarJuego() {
		super.ganarJuego();
		this.setIq(this.getIq() + 3);
	}

	@Override
	public void empatarJuego() {
		super.empatarJuego();
		this.setIq(this.getIq() + 2);
	}

	@Override
	public void perderJuego() {
		super.perderJuego();
		this.setIq(this.getIq() + 1);
	}

	public void asistir(int stat) {
		if (stat < this.getIq()) this.asistencias++;
	}

	public int getIq() {
		return this.iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public int getAsistencias() {
		return this.asistencias;
	}
}
