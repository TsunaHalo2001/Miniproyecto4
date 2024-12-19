/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproyecto.miniproyecto4.Equipo;

import java.util.ArrayList;

import miniproyecto.miniproyecto4.Jugadores.Defensa;
import miniproyecto.miniproyecto4.Jugadores.Delantero;
import miniproyecto.miniproyecto4.Jugadores.Mediocampista;
import miniproyecto.miniproyecto4.Jugadores.Portero;

/**
 *
 * @author tsuna
 */
public class Equipo {
    private Portero p1;
	private ArrayList<Defensa> defensas;
	private ArrayList<Mediocampista> mediocampistas;
	private ArrayList<Delantero> delanteros;
	private ArrayList<Portero> pSuplentes;
	private ArrayList<Defensa> defSuplentes;
	private ArrayList<Mediocampista> mSuplentes;
	private ArrayList<Delantero> delSuplentes;
    
	public Equipo (Portero p1,
				   ArrayList<Defensa> defensas,
				   ArrayList<Mediocampista> mediocampistas,
				   ArrayList<Delantero> delanteros,
				   ArrayList<Portero> pSuplentes,
				   ArrayList<Defensa> defSuplentes,
				   ArrayList<Mediocampista> mSuplentes,
				   ArrayList<Delantero> delSuplentes
				   ) {
		this.p1 = p1;
		this.defensas = defensas;
		this.mediocampistas = mediocampistas;
		this.delanteros = delanteros;
		this.pSuplentes = pSuplentes;
		this.defSuplentes = defSuplentes;
		this.mSuplentes = mSuplentes;
		this.delSuplentes = delSuplentes;
	}

	public Portero getP() {
		return this.p1;
	}

	public ArrayList<Defensa> getDefensas() {
		return this.defensas;
	}

	public ArrayList<Mediocampista> getMediocampistas() {
		return this.mediocampistas;
	}

	public ArrayList<Delantero> getDelanteros() {
		return this.delanteros;
	}

	public ArrayList<Portero> getPSuplentes() {
		return this.pSuplentes;
	}

	public ArrayList<Defensa> getDefSuplentes() {
		return this.defSuplentes;
	}

	public ArrayList<Mediocampista> getMSuplentes() {
		return this.mSuplentes;
	}

	public ArrayList<Delantero> getDelSuplentes() {
		return this.delSuplentes;
	}

	public void setP(Portero p) {
		this.p1 = p;
	}

	public void setDefensas(ArrayList<Defensa> defensas) {
		this.defensas = defensas;
	}

	public void setMediocampistas(ArrayList<Mediocampista> mediocampistas) {
		this.mediocampistas = mediocampistas;
	}

	public void setDelanteros(ArrayList<Delantero> delanteros) {
		this.delanteros = delanteros;
	}
}
