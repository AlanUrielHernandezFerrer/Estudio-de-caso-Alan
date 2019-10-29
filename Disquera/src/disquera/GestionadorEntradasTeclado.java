/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disquera;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
        class GestionadorEntradasTeclado {

            private String entradaTeclado;
            Scanner sc = new Scanner(System.in);

            public GestionadorEntradasTeclado() {
                entradaTeclado = "";
            }

            public String recogerPalabra() {
                entradaTeclado = sc.nextLine();
                return entradaTeclado;
            }
        }
