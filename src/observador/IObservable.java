/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import observadores.ILibroEstado;

/**
 *
 * @author Johanna
 */
public interface IObservable {
    
    public void agregar(ILibroEstado observador);
    public void  eliminaragregar(ILibroEstado observador);
    public void notificarObservadores();
    
}
