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

    public void tamanioDinamico(int tamanio) {
        datos = new int[tamanio];
    }

    public void agregar(int indice, int elemento) {

        int[] aux = new int[datos.length];

        int t = datos.length;
        if (datos[indice] == 0) {
            datos[indice] = elemento;
        } else {
            if (datos[t - 1] == 0) {
                System.arraycopy(datos, 0, aux, 0, t);
            } else {
                System.arraycopy(datos, 0, aux, 0, t);
                this.tamanioDinamico(datos.length * 2);
                System.arraycopy(aux, 0, datos, 0, t);
                this.adelantar(indice, elemento);
            }
        }
    }

    public String visualizar() {
        String salida = "Elementos: \n";
        int contador = 0;
        int i = 0;
        for (int x : datos) {
            if (x != 0) {
                salida = salida + i + ": " + x + "\n";
                contador++;
            }
            i++;
        }
        salida = salida + "Cantidad de elementos significativos: "
                + contador + "\n" + "Tamanio del arreglo: " + datos.length + "\n";

        return salida;
    }

    public void adelantar(int ind, int elem) {

        for (int i = datos.length - 2; i >= ind; i--) {

            datos[i + 1] = datos[i];
        }
        datos[ind] = elem;
    }

    public void eliminar(int ind) {
        int j = datos.length - 1;
        for (int i = ind; i < datos.length - 1; i++) {
            datos[i] = datos[i + 1];
        }
        do {
            datos[j] = 0;
            j--;
        } while (datos[j] != 0);
    }

    public int busqueda(int elem) {
        int contador = 0;
        for (int i = 0; i < datos.length - 1; i++) {
            if (elem == datos[i]) {
                contador = i;
            }
        }
        return contador;
    }

}
