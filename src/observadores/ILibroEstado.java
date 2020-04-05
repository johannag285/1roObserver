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
public interface ILibroEstado {
    //Cada clase que quiera observar el 
    //cambio del estado en el libro deberá implementar la siguiente interface
    //y darle lógica al método actualizar:
    public void actualizar();
}
