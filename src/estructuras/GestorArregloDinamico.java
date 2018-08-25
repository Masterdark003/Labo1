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
    private int[] datos;
    PUTOOOOOOOOOOOOOOOOOOOOOOOOO
    public void tamanioDinamico (int tamanio){
        datos = new int [tamanio];
    }
     public void agregar (int indice, int elemento){
         datos[indice]=elemento;
     }
     public String visualizar (){
        String salida = "Elementos: \n";
        int contador=0;
        int i = 0;
        for (int x : datos){
            if (x!=0){
                salida = salida + contador + ": " + x + "\n";
                contador++;
            }
            i++;
        }
        salida = salida + "Cantidad de elementos significativos: " + 
                contador + "\n" + "Tamanio del arreglo: " + datos.length + "\n";
        
        return salida;
     }
}
