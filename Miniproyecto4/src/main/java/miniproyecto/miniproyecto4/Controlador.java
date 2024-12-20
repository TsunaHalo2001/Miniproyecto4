package miniproyecto.miniproyecto4;

public class Controlador {
    private Vista vista;
    private Modelo model;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.model = modelo;
        this.model.leerLista(this.vista.menu.getLista_jugadores());
        this.vista.menu.getBoton_Crear().addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				vista.crear();
			}
		});
        this.vista.menu.getBoton_Actualizar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (vista.menu.getLista_jugadores().getSelectedIndex() != -1) {
					modelo.index = vista.menu.getLista_jugadores().getSelectedIndex();
					vista.actualizar();
				}
            }
        });

        this.vista.menu.getResetear().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.resetearLista(vista.menu.getLista_jugadores());
            }
        });

        this.vista.menu.getBoton_Partido().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.partido();
				modelo.leerLista(vista.partido.getListPortero());
				modelo.leerLista(vista.partido.getLista_defensas());
                modelo.leerLista(vista.partido.getLista_medios());
                modelo.leerLista(vista.partido.getLista_delanteros());
            }
        });
		
        this.vista.menu.getBoton_Eliminar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		model.eliminardeLista(vista.menu.getLista_jugadores());
            }
        });

        this.vista.crear.getVolver_botonAr().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuC();
				modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });

        this.vista.crear.getVolver_botonDef().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuC();
				modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });

        this.vista.crear.getVolver_botonMed().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuC();
				modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });

        this.vista.crear.getVolver_botonDel().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuC();
				modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });
        this.vista.actualizar.getVolverAr2().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuA();
                modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });
        this.vista.actualizar.getVolverDef2().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuA();
                modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });
        this.vista.actualizar.getVolverMed2().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuA();
                modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });
        this.vista.actualizar.getVolverDel2().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuA();
                modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });
        this.vista.partido.getVolver_Boton().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuPAR();
            }
        });

        this.vista.crear.getGuardarArquero().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearPortero(vista.crear.getNombreArquero(), vista.crear.getEdadArquero(), vista.crear.getArranqueArquero(), vista.crear.getVelocidadArquero(), vista.crear.getResistenciaArquero(), vista.crear.getAlturaArquero());
            }
        });

        this.vista.crear.getGuardarDefensa().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearDefensa(vista.crear.getNombreDefensa(), vista.crear.getEdadDefensa(), vista.crear.getArranqueDefensa(), vista.crear.getVelocidadDefensa(), vista.crear.getResistenciaDefensa(), vista.crear.getAgilidadDefensa());
            }
        });

        this.vista.crear.getGuardarMedio().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearMediocampista(vista.crear.getNombreMedio(), vista.crear.getEdadMedio(), vista.crear.getArranqueMedio(), vista.crear.getVelocidadMedio(), vista.crear.getResistenciaMedio(), vista.crear.getIQMedio());
            }
        });

        this.vista.crear.getGuardarDelantero().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearDelantero(vista.crear.getNombreDelantero(), vista.crear.getEdadDelantero(), vista.crear.getArranqueDelantero(), vista.crear.getVelocidadDelantero(), vista.crear.getResistenciaDelantero(), vista.crear.getPrecisionDelantero());
            }
        });

        this.vista.actualizar.getActualizarArqueroBtn(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.actualizarArquero(vista.actualizar.getEdadMedio(), vista.actualizar.getEdadArquero(), vista.actualizar.getVelocidadArquero(), vista.actualizar.getResistenciaArquero(), vista.actualizar.getAlturaArquero());
                vista.menuA();
                modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });

        this.vista.actualizar.getActualizarDefensaBtn(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.actualizarDefensa(vista.actualizar.getEdadDefensa(), vista.actualizar.getArranqueDefensa(), vista.actualizar.getVelocidadDefensa(), vista.actualizar.getResistenciaDefensa(), vista.actualizar.getAgilidadDefensa());
                vista.menuA();
                modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });

        this.vista.actualizar.getActualizarMedioBtn(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
        		modelo.actualizarMediocampista(vista.actualizar.getEdadMedio(), vista.actualizar.getArranqueMedio(), vista.actualizar.getVelocidadMedio(), vista.actualizar.getResistenciaMedio(), vista.actualizar.getIQMedio());
				vista.menuA();
				modelo.leerLista(vista.menu.getLista_jugadores());
			}
        });

        this.vista.actualizar.getActualizarDelanteroBtn(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
        		modelo.actualizarDelantero(vista.actualizar.getEdadDelantero(), vista.actualizar.getArranqueDelantero(), vista.actualizar.getVelocidadDelantero(), vista.actualizar.getResistenciaDelantero(), vista.actualizar.getPrecisionDelantero());
				vista.menuA();
				modelo.leerLista(vista.menu.getLista_jugadores());
			}
        });
    }
    
}
