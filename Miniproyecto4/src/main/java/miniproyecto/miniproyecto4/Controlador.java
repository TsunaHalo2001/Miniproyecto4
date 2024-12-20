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


        this.vista.crear.getGuardarArquero().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearPortero(vista.crear.getNombreArquero(), vista.crear.getEdadArquero(), vista.crear.getVelocidadArquero(), vista.crear.getResistenciaArquero(), vista.crear.getAlturaArquero());
            }
        });

        this.vista.crear.getGuardarDefensa().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearDefensa(vista.crear.getNombreDefensa(), vista.crear.getEdadDefensa(), vista.crear.getArranqueDefensa(), vista.crear.getVelocidadDefensa(), vista.crear.getResistenciaDefensa());
            }
        });

        this.vista.crear.getGuardarMedio().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearMediocampista(vista.crear.getNombreMedio(), vista.crear.getEdadMedio(), vista.crear.getArranqueMedio(), vista.crear.getVelocidadMedio(), vista.crear.getResistenciaMedio());
            }
        });

        this.vista.crear.getGuardarDelantero().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearDelantero(vista.crear.getNombreDelantero(), vista.crear.getEdadDelantero(), vista.crear.getArranqueDelantero(), vista.crear.getVelocidadDelantero(), vista.crear.getResistenciaDelantero());
            }
        });

        this.vista.actualizar.getActualizarArqueroBtn(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.actualizarArquero(vista.actualizar.get, vista.actualizar.getEdadArquero(), vista.actualizar.getVelocidadArquero(), vista.actualizar.getResistenciaArquero(), vista.actualizar.getAlturaArquero());
                vista.menuA();
                modelo.leerLista(vista.menu.getLista_jugadores());
            }
        });

        this.vista.actualizar.getActualizarMedioBtn(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarDefensa(vista.actualizar.getNombreT(), vista.actualizar.getCodigoT(), vista.actualizar.getUnidadT());
				vista.menuA();
				modelo.leerLista(vista.menu.getLista_Soldados());
            }
        });

        this.vista.actualizar.getGuardarCa().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarCapitan(vista.actualizar.getNombreCa(), vista.actualizar.getCodigoCa(), vista.actualizar.getUnidadCa(), vista.actualizar.getUnidadesCa());
				vista.menuA();
				modelo.leerLista(vista.menu.getLista_Soldados());
			}
        });

        this.vista.actualizar.getGuardarCo().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarCoronel(vista.actualizar.getNombreCo(), vista.actualizar.getCodigoCo(), vista.actualizar.getUnidadCo(), vista.actualizar.getEstrategiaCo());
				vista.menuA();
				modelo.leerLista(vista.menu.getLista_Soldados());
			}
        });
    }
    
}
