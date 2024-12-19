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
public class Portero extends Jugador {
	private float altura;
	private int golesRecibidos;

	public Portero(String nombre, int edad, int arranque, int velocidad, int resistencia, float altura) {
		super(nombre, EnumPosicion.Portero, edad, arranque, velocidad, resistencia);
		this.altura = altura;
		this.golesRecibidos = 0;
	}

	@Override
	public void ganarJuego() {
		super.ganarJuego();
		this.setAltura(this.getAltura() + 0.03f);
	}

	@Override
	public void empatarJuego() {
		super.empatarJuego();
		this.setAltura(this.getAltura() + 0.02f);
	}

	@Override
	public void perderJuego() {
		super.perderJuego();
		this.setAltura(this.getAltura() + 0.01f);
	}

	public void recibirGol(float chebyshev) {
		if (chebyshev > this.getAltura() + this.getArranque()) this.golesRecibidos++;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getGolesRecibidos() {
		return this.golesRecibidos;
	}

	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
}
