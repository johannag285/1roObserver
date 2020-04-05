/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import observador.NotificaEstadoLibro;
import observadores.Administracion;
import observadores.Compras;
import observadores.Stock;

/**
 *
 * @author Johanna
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NotificaEstadoLibro a = new NotificaEstadoLibro();
        a.agregar(new Compras());
        a.agregar(new Administracion());
        a.agregar(new Stock());
        
        Libro libro = new Libro();
        libro.setEstado("Dañado");
        
        Biblioteca b = new Biblioteca();
        b.devolverLibro(libro);
    }
    
}
