/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;
/**
 *
 * @author desandlope0
 */
public class GestorArregloDinamico {
    private int tamano;
    private int[] datos;
    
    public void tamanioDinamico (int tamanio){
        datos = new int [tamanio];
    }
     public void agregar (int indice, int elemento){
         datos[indice]=elemento;
     }
     public String visualizar (){
        return "gg";
     }
}
