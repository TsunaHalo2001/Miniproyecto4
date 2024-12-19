/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproyecto.miniproyecto4.Partido;

import java.util.Random;

import miniproyecto.miniproyecto4.Equipo.Equipo;
import miniproyecto.miniproyecto4.Jugadores.Defensa;
import miniproyecto.miniproyecto4.Jugadores.Portero;

/**
 *
 * @author tsuna
 */
public class Partido {
	public static void resultado(Equipo equipo) {
		Random POcations = new Random();
		int PVOcations = POcations.nextInt(5);
		for (int i = 0; i < PVOcations; i++) {
			Random Prand = new Random();
			int Pvalue = Prand.nextInt(17);
			equipo.getP().recibirGol(Pvalue);
		}

		Random DOcations = new Random();
		int DVOcations = DOcations.nextInt(5);
		for (int i = 0; i < DVOcations; i++) {
			for (int j = 0; j < equipo.getDefensas().size(); j++) {
				Random Drand = new Random();
				int Dvalue = Drand.nextInt(100);
				equipo.getDefensas().get(j).recuperarBalon(Dvalue);
			}
		}

		Random GOcations = new Random();
		int GVOcations = GOcations.nextInt(5);
		for (int i = 0; i < GVOcations; i++) {
			for (int j = 0; j < equipo.getDelanteros().size(); j++) {
				for (int k = 0; k < equipo.getMediocampistas().size(); k++) {
					Random Grand = new Random();
					int Gvalue = Grand.nextInt(100);
					equipo.getDelanteros().get(j).marcarGol(Gvalue, equipo.getMediocampistas().get(k));
				}
			}
		}

		Random SOcations = new Random();
		int SVOcations = SOcations.nextInt(5);
		for (int i = 0; i < SVOcations; i++) {
			for (int j = 0; j < equipo.getPSuplentes().size(); j++) {
				if (equipo.getP().getPosicion() == equipo.getPSuplentes().get(j).getPosicion()) {
					Portero temp = equipo.getP();
					equipo.setP(equipo.getPSuplentes().get(j));
					equipo.getPSuplentes().set(j, temp);
					break;
				}
			}

			for (int j = 0; j < equipo.getDefSuplentes().size(); j++) {
				for (int k = 0; k < equipo.getDefensas().size(); k++) {
					if (equipo.getDefensas().get(k).getPosicion() == equipo.getDefSuplentes().get(j).getPosicion()) {
						Defensa temp = equipo.getDefensas().get(k);
						equipo.getDefensas().set(k, equipo.getDefSuplentes().get(j));
						equipo.getDefSuplentes().set(j, temp);
						break;
					}
				}
			}

			for (int j = 0; j < equipo.getMSuplentes().size(); j++) {
				for (int k = 0; k < equipo.getMediocampistas().size(); k++) {
					if (equipo.getMediocampistas().get(k).getPosicion() == equipo.getMSuplentes().get(j).getPosicion()) {
						Defensa temp = equipo.getDefensas().get(k);
						equipo.getDefensas().set(k, equipo.getDefSuplentes().get(j));
						equipo.getDefSuplentes().set(j, temp);
						break;
					}
				}
			}

			for (int j = 0; j < equipo.getDelSuplentes().size(); j++) {
				for (int k = 0; k < equipo.getDelanteros().size(); k++) {
					if (equipo.getDelanteros().get(k).getPosicion() == equipo.getDelSuplentes().get(j).getPosicion()) {
						Defensa temp = equipo.getDefensas().get(k);
						equipo.getDefensas().set(k, equipo.getDefSuplentes().get(j));
						equipo.getDefSuplentes().set(j, temp);
						break;
					}
				}
			}
		}
	}
}
