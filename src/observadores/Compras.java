/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observadores;

/**
 *
 * @author Johanna
 */
public class Compras implements ILibroEstado{

    @Override
    public void actualizar() {
        System.out.println("Compras: Solicito una nueva cotixacion de compra");
    }
    
}
