/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.ArrayList;
import observadores.ILibroEstado;

/**
 *
 * @author Johanna
 */
public class NotificaEstadoLibro implements IObservable{

    
    private static final ArrayList<ILibroEstado> observadores = new ArrayList<ILibroEstado>();
    
    @Override
    public void agregar(ILibroEstado observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminaragregar(ILibroEstado observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
       for(int i=0; i<observadores.size(); i++){
        observadores.get(i).actualizar();
       }
    }
    
}
