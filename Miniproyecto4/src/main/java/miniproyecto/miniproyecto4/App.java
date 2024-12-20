/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package miniproyecto.miniproyecto4;

/**
 *
 * @author tsuna
 */
public class App {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();

        Controlador controlador = new Controlador(vista, modelo);
    }
}
