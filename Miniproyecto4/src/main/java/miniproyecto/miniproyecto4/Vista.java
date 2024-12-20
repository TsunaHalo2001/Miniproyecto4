package miniproyecto.miniproyecto4;


import miniproyecto.GUI.Actualizar;
import miniproyecto.GUI.Crear;
import miniproyecto.GUI.Menu;
import miniproyecto.GUI.Partido;

public class Vista {
        Menu menu;
	    Crear crear;
	    Actualizar actualizar;
	    Partido partido;

        public Vista() {
            this.menu = new Menu();
            this.crear = new Crear();
            this.actualizar = new Actualizar();
            this.partido = new Partido();
            this.menu.setVisible(true);
        }

    	public void menuC() {
            this.menu.setVisible(true);
            this.crear.setVisible(false);
        }
    
        public void menuA() {
            this.menu.setVisible(true);
            this.actualizar.setVisible(false);
        }
    
        public void menuPAR() {
            this.menu.setVisible(true);
            this.partido.setVisible(false);
        }

        public void crear() {
            this.crear.setVisible(true);
            this.menu.setVisible(false);
        }
    
        public void actualizar() {
            this.actualizar.setVisible(true);
            this.menu.setVisible(false);
        }
    
        public void partido() {
            this.partido.setVisible(true);
            this.menu.setVisible(false);
        }
}
