/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disquera;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Disquera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cantante, disco;
        ListaCantantesFamosos listaCantate = new ListaCantantesFamosos();
        GestionadorEntradasTeclado entrada = new GestionadorEntradasTeclado();

        System.out.println("Ingresa los datos de la lista: ");
        listaCantate.listarCantanteFamoso();
        String continuar;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre de un cantante: ");
            cantante = entrada.recogerPalabra();
            System.out.println("Ingrese su disco mas vendido: ");
            disco = entrada.recogerPalabra();
            listaCantate.agregarCantanteFamoso(new CantanteFamoso(cantante, disco));
            System.out.println("La lista contiene los siguientes datos: ");
            listaCantate.listarCantanteFamoso();
            System.out.println("¿Deseas agregar otro cantante y su disco (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));


    }

}
