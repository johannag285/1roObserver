/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import observador.NotificaEstadoLibro;

/**
 *
 * @author Johanna
 */
public class Biblioteca {
    //La biblioteca es quién dispara el evento
    
    public void devolverLibro(Libro libro){
        if(libro.getEstado().equals("Dañado")){
            NotificaEstadoLibro notificaEstado = new NotificaEstadoLibro();
            notificaEstado.notificarObservadores();
        }
    }
}
