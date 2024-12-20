package miniproyecto.miniproyecto4;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import miniproyecto.Jugador.Portero;
import miniproyecto.Jugador.Defensa;
import miniproyecto.Jugador.Mediocampista;
import miniproyecto.miniproyecto4.Jugadores.Jugador;
import miniproyecto.Jugador.Delantero;


public class Modelo{
    public Arraylist<Portero> listPortero;
    public Arraylist<Defensa> listDefensas;
    public Arraylist<Mediocampista> listMediocampistas;
    public Arraylist<Delantero> listDelanteros;

    public int index;


    public Modelo() {
        this.index = 0;
        this.listPortero = new ArrayList<>();
        this.listDefensas = new ArrayList<>();
        this.listMediocampistas = new ArrayList<>();
        this.listDelanteros = new ArrayList<>();
    }

    private DefaultListModel limpiarLista (JList<String> Lista_jugadores){
        DefaultListModel model = new DefaultListModel();

        Lista_jugadores.setModel(model);

        return model;
    }

    private DefaultListModel agregarValor (miniproyecto.miniproyecto4.Jugadores.Jugador Jugador, JList<String> Lista_jugadores) {
        DefaultListModel model = (DefaultListModel) Lista_jugadores.getModel();

        model.addElement(Jugador.MostrarInformacion());

        return model;
    }

    public void leerLista (JList<String> Lista_jugadores) {
        limpiarLista(Lista_jugadores);

        if (Jugador.getNjugadores() > 0) {
            int a = this.listArqueros.size() + this.listDefensas.size() + this.listMediocampistas.size() + this.listDelanteros.size();
            
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < this.listPortero.size(); j++) if (this.listPortero.get(j).getNjugadores() == i + 1) agregarValor(this.listPortero.get(j), Lista_jugadores);
                for (int j = 0; j < this.listDefensas.size(); j++) if (this.listDefensas.get(j).getNjugadores() == i + 1) agregarValor(this.listDefensas.get(j), Lista_jugadores);
                for (int j = 0; j < this.listMediocampistas.size(); j++) if (this.listMediocampistas.get(j).getContadorSoldados() == i + 1) agregarValor(this.listMediocampistas.get(j), Lista_jugadores);
                for (int j = 0; j < this.listDelanteros.size(); j++) if (this.listDelanteros.get(j).getNjugadores() == i + 1) agregarValor(this.listDelanteros.get(j), Lista_jugadores);
            }

            if (Jugador.getNjugadores() - a > 0) {
                int aux = Jugador.getNjugadores() - a;
                for (int i = 0; i < aux; i++) {
                    for (int j = 0; j < this.listPortero.size(); j++) if (this.listPortero.get(j).getNjugadores() == i + 1) agregarValor(this.listPortero.get(j), Lista_jugadores);
                    for (int j = 0; j < this.listDefensas.size(); j++)       if (this.listDefensas.get(j).getNjugadores() == a + i + 1) agregarValor(this.listDefensas.get(j), Lista_jugadores);
                    for (int j = 0; j < this.listMediocampistas.size(); j++) if (this.listMediocampistas.get(j).getContadorSoldados() == a + i + 1) agregarValor(this.listMediocampistas.get(j), Lista_jugadores);
                    for (int j = 0; j < this.listDelanteros.size(); j++)       if (this.listDelanteros.get(j).getNjugadores() == a + i + 1) agregarValor(this.listDelanteros.get(j), Lista_jugadores);
                }
            }
        }
    }

    public void eliminardeLista (JList<String> Lista_jugadores) {
        if (Lista_jugadores.getModel().getSize() > 0) {
            DefaultListModel model = (DefaultListModel) Lista_jugadores.getModel();

            for (int i = 0; i < this.listPortero.size(); i++) {
                if (this.listPortero.get(i).mostrarInformacion().equals(Lista_jugadores.getSelectedValue())) {
                    this.listPortero.remove(i);
                    model.remove(Lista_jugadores.getSelectedIndex());
                    return;
                }
            }
            
            for (int i = 0; i < this.listDefensas.size(); i++) {
                if (this.listDefensas.get(i).mostrarInformacion().equals(Lista_jugadores.getSelectedValue())) {
                    this.listDefensas.remove(i);
                    model.remove(Lista_jugadores.getSelectedIndex());
                    return;
                }
            }

            for (int i = 0; i < this.listMediocampistas.size(); i++) {
                if (this.listMediocampistas.get(i).mostrarInformacion().equals(Lista_jugadores.getSelectedValue())) {
                    this.listMediocampistas.remove(i);
                    model.remove(Lista_jugadores.getSelectedIndex());
                    return;
                }
            }

            for (int i = 0; i < this.listDelanteros.size(); i++) {
                if (this.listDelanteros.get(i).mostrarInformacion().equals(Lista_jugadores.getSelectedValue())) {
                    this.listDelanteros.remove(i);
                    model.remove(Lista_jugadores.getSelectedIndex());
                    return;
                }
            }
        }
    }

    public void resetearLista (JList<String> Lista_jugadores) {
        limpiarLista(Lista_jugadores);

        Jugador.resetear();
        this.listPortero.clear();
        this.listDefensas.clear();
        this.listMediocampistas.clear();
        this.listDelanteros.clear();
    }

    public void actualizarArquero (JTextField PorteroE, JTextField PorteroArr, JTextField PorteroVe, JTextField PorteroRe, JTextField PorteroAlt) {
        if (PorteroE.getText().isEmpty() || PorteroArr.getText().isEmpty() || PorteroVe.getText().isEmpty() || PorteroRe.getText().isEmpty()|| PorteroAlt.getText().isEmpty()) return;

        Portero jugador = new Portero(PorteroE.getText(), PorteroArr.getText(), PorteroVe.getText(), ArqueroRe.getText(),ArqueroAlt.getText());
        Jugador.setNjugadores(Soldado.getNjugadores() - 1);
        Jugador.setNjugadores(this.index + 1);

        if (!this.listPortero.isEmpty()) {
            for (int i = 0; i < this.listPortero.size(); i++) {
                if (this.listPortero.get(i).getContSoldado() == this.index + 1) {
                    this.listPortero.set(i, jugador);
                    break;
                }
            }
        }

        if (!this.listDefensas.isEmpty()) {
            for (int i = 0; i < this.listDefensas.size(); i++) {
                if (this.listDefensas.get(i).getNjugadores() == this.index + 1) {
                    this.listDefensas.remove(i);
                    this.listPortero.add(jugador);
                    break;
                }
            }
        }

        if (!this.listMediocampistas.isEmpty()) {
            for (int i = 0; i < this.listMediocampistas.size(); i++) {
                if (this.listMediocampistas.get(i).getContSoldado() == this.index + 1) {
                    this.listMediocampistas.remove(i);
                    this.listPortero.add(jugador);
                    break;
                }
            }
        }

        if (!this.listDelanteros.isEmpty()) {
            for (int i = 0; i < this.listDelanteros.size(); i++) {
                if (this.listDelanteros.get(i).getContSoldado() == this.index + 1) {
                    this.listDelanteros.remove(i);
                    this.listPortero.add(jugador);
                    break;
                }
            }
        }
    }

    public void actualizarDefensa (JTextField DefensaE, JTextField DefensaArr, JTextField DefensaVe, JTextField DefensaRe, JTextField DefensaAlt) {
        if (DefensaE.getText().isEmpty() || DefensaArr.getText().isEmpty() || DefensaVe.getText().isEmpty() || DefensaRe.getText().isEmpty()|| DefensaAlt.getText().isEmpty()) return;

        Defensa jugador = new Defensa(DefensaE.getText(), DefensaArr.getText(), DefensaVe.getText(), DefensaRe.getText(),DefensaAlt.getText());
        Jugador.setNjugadores(Soldado.getNjugadores() - 1);
        Jugador.setNjugadores(this.index + 1);

        if (!this.listPortero.isEmpty()) {
            for (int i = 0; i < this.listPortero.size(); i++) {
                if (this.listPortero.get(i).getContSoldado() == this.index + 1) {
                    this.listPortero.remove(i);
                    this.listDefensas.add(jugador);
                    break;
                }
            }
        }

        if (!this.listDefensas.isEmpty()) {
            for (int i = 0; i < this.listDefensas.size(); i++) {
                if (this.listDefensas.get(i).getNjugadores() == this.index + 1) {
                    this.listDefensas.set(i, jugador);
                    break;
                }
            }
        }

        if (!this.listMediocampistas.isEmpty()) {
            for (int i = 0; i < this.listMediocampistas.size(); i++) {
                if (this.listMediocampistas.get(i).getContSoldado() == this.index + 1) {
                    this.listMediocampistas.remove(i);
                    this.listDefensas.add(jugador);
                    break;
                }
            }
        }

        if (!this.listDelanteros.isEmpty()) {
            for (int i = 0; i < this.listDelanteros.size(); i++) {
                if (this.listDelanteros.get(i).getContSoldado() == this.index + 1) {
                    this.listDelanteros.remove(i);
                    this.listDefensas.add(jugador);
                    break;
                }
            }
        }
    }

    public void actualizarMediocampista (JTextField MediocampistaE, JTextField MediocampistaArr, JTextField MediocampistaVe, JTextField MediocampistaRe, JTextField MediocampistaAlt) {
        if (MediocampistaE.getText().isEmpty() || MediocampistaArr.getText().isEmpty() || MediocampistaVe.getText().isEmpty() || MediocampistaRe.getText().isEmpty()|| MediocampistaAlt.getText().isEmpty()) return;

        Mediocampista jugador = new Mediocampista(MediocampistaE.getText(), MediocampistaArr.getText(), MediocampistaVe.getText(), MediocampistaRe.getText(),MediocampistaAlt.getText());
        Jugador.setNjugadores(Soldado.getNjugadores() - 1);
        Jugador.setNjugadores(this.index + 1);

        if (!this.listPortero.isEmpty()) {
            for (int i = 0; i < this.listPortero.size(); i++) {
                if (this.listPortero.get(i).getContSoldado() == this.index + 1) {
                    this.listPortero.remove(i);
                    this.listMediocampistas.add(jugador);
                    break;
                }
            }
        }

        if (!this.listDefensas.isEmpty()) {
            for (int i = 0; i < this.listDefensas.size(); i++) {
                if (this.listDefensas.get(i).getNjugadores() == this.index + 1) {
                    this.listDefensas.remove(i);
                    this.listMediocampistas.add(jugador);
                    break;
                }
            }
        }

        if (!this.listMediocampistas.isEmpty()) {
            for (int i = 0; i < this.listMediocampistas.size(); i++) {
                if (this.listMediocampistas.get(i).getContSoldado() == this.index + 1) {
                    this.listMediocampistas.set(i, jugador);
                    break;
                }
            }
        }

        if (!this.listDelanteros.isEmpty()) {
            for (int i = 0; i < this.listDelanteros.size(); i++) {
                if (this.listDelanteros.get(i).getContSoldado() == this.index + 1) {
                    this.listDelanteros.remove(i);
                    this.listMediocampistas.add(jugador);
                    break;
                }
            }
        }
    }

    public void actualizarDelantero (JTextField DelanteroE, JTextField DelanteroArr, JTextField DelanteroVe, JTextField DelanteroRe, JTextField DelanteroAlt) {
        if (DelanteroE.getText().isEmpty() || DelanteroArr.getText().isEmpty() || DelanteroVe.getText().isEmpty() || DelanteroRe.getText().isEmpty()|| DelanteroAlt.getText().isEmpty()) return;

        Delantero jugador = new Delantero(DelanteroE.getText(), DelanteroArr.getText(), DelanteroVe.getText(), DelanteroRe.getText(),DelanteroAlt.getText());
        Jugador.setNjugadores(Soldado.getNjugadores() - 1);
        Jugador.setNjugadores(this.index + 1);

        if (!this.listPortero.isEmpty()) {
            for (int i = 0; i < this.listPortero.size(); i++) {
                if (this.listPortero.get(i).getContSoldado() == this.index + 1) {
                    this.listPortero.remove(i);
                    this.listDelanteros.add(jugador);
                    break;
                }
            }
        }

        if (!this.listDefensas.isEmpty()) {
            for (int i = 0; i < this.listDefensas.size(); i++) {
                if (this.listDefensas.get(i).getNjugadores() == this.index + 1) {
                    this.listDefensas.remove(i);
                    this.listDelanteros.add(jugador);
                    break;
                }
            }
        }

        if (!this.listMediocampistas.isEmpty()) {
            for (int i = 0; i < this.listMediocampistas.size(); i++) {
                if (this.listMediocampistas.get(i).getContSoldado() == this.index + 1) {
                    this.listMediocampistas.remove(i);
                    this.listDelanteros.add(jugador);
                    break;
                }
            }
        }

        if (!this.listDelanteros.isEmpty()) {
            for (int i = 0; i < this.listDelanteros.size(); i++) {
                if (this.listDelanteros.get(i).getContSoldado() == this.index + 1) {
                    this.listDelanteros.set(i, jugador);
                    break;
                }
            }
        }
    }

    public void crearPortero (JTextField PorteroE, JTextField PorteroArr, JTextField PorteroVe, JTextField PorteroRe, JTextField PorteroAlt) {
        if (PorteroE.getText().isEmpty() || PorteroArr.getText().isEmpty() || PorteroVe.getText().isEmpty() || PorteroRe.getText().isEmpty()|| PorteroAlt.getText().isEmpty()) return;

        Portero jugador = new Portero(PorteroE.getText(), PorteroArr.getText(), PorteroVe.getText(), PorteroRe.getText(),PorteroAlt.getText());
        this.listPortero.add(jugador);
    }

    public void crearDefensa (JTextField DefensaE, JTextField DefensaArr, JTextField DefensaVe, JTextField DefensaRe, JTextField DefensaAlt) {
        if (DefensaE.getText().isEmpty() || DefensaArr.getText().isEmpty() || DefensaVe.getText().isEmpty() || DefensaRe.getText().isEmpty()|| DefensaAlt.getText().isEmpty()) return;

        Defensa jugador = new Defensa(DefensaE.getText(), DefensaArr.getText(), DefensaVe.getText(), DefensaRe.getText(),DefensaAlt.getText());
        this.listDefensas.add(jugador);
    }

    public void crearMediocampista (JTextField MediocampistaE, JTextField MediocampistaArr, JTextField MediocampistaVe, JTextField MediocampistaRe, JTextField MediocampistaAlt) {
        if (MediocampistaE.getText().isEmpty() || MediocampistaArr.getText().isEmpty() || MediocampistaVe.getText().isEmpty() || MediocampistaRe.getText().isEmpty()|| MediocampistaAlt.getText().isEmpty()) return;

        Mediocampista jugador = new Mediocampista(MediocampistaE.getText(), MediocampistaArr.getText(), MediocampistaVe.getText(), MediocampistaRe.getText(),MediocampistaAlt.getText());
        this.listMediocampistas.add(jugador);
    }

    public void crearDelantero (JTextField DelanteroE, JTextField DelanteroArr, JTextField DelanteroVe, JTextField DelanteroRe, JTextField DelanteroAlt) {
        if (DelanteroE.getText().isEmpty() || DelanteroArr.getText().isEmpty() || DelanteroVe.getText().isEmpty() || DelanteroRe.getText().isEmpty()|| DelanteroAlt.getText().isEmpty()) return;

        Delantero jugador = new Delantero(DelanteroE.getText(), DelanteroArr.getText(), DelanteroVe.getText(), DelanteroRe.getText(),DelanteroAlt.getText());
        this.listDelanteros.add(jugador);
    }


}