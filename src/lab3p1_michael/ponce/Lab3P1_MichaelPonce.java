/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_michael.ponce;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Lab3P1_MichaelPonce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //System.out.println("Bienvenido al Juego ");
        //System.out.println("Seleccione [1]Prieda, [2]Papel, [0]Tijera");
        //Scanner scanner = new Scanner(System.in);
        //int participante1 = 0; 
        //int participante2 = 0;
        //int seleccion = 0;
        
        //System.out.println("Particiante 1 haga su seleccion");
        //seleccion = scanner.nextInt();
        
        //ystem.out.println("Particiante 2 haga su seleccion");
        // = scanner.nextInt();
        
        Scanner scanner = new Scanner(System.in);
        int participante1 = 0;
        int participante2 = 0; 
        int puntos1 = 0;
        int puntos2 = 0;

        System.out.println("Bienvenido:");
        System.out.println("Seleccione [1]Prieda, [2]Papel, [0]Tijera");
        

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ronda " + i);
            System.out.println("Participante 1, elige tu opción:");
            participante1 = scanner.nextInt();
            System.out.println("Participante 2, elige tu opción:");
            participante2 = scanner.nextInt();

            switch (participante1) {
                case 0:
                    switch (participante2) {
                        case 0:
                            System.out.println("todos ganan!");
                            break;
                        case 1:
                            System.out.println("participante 2 gana la ronda!");
                            puntos2++;
                            break;
                        case 2:
                            System.out.println("participante 1 gana la ronda!");
                            puntos1++;
                            break;
                    }
                    break;
                case 1:
                    switch (participante2) {
                        case 0:
                            System.out.println("participante 1 gana la ronda!");
                            puntos1++;
                            break;
                        case 1:
                            System.out.println("todos ganan!");
                            break;
                        case 2:
                            System.out.println("Jugador 2 gana la ronda!");
                            puntos2++;
                            break;
                    }
                    break;
                case 2:
                    switch (participante2) {
                        case 0:
                            System.out.println("Jugador 2 gana la ronda!");
                            puntos2++;
                            break;
                        case 1:
                            System.out.println("Jugador 1 gana la ronda!");
                            puntos1++;
                            break;
                        case 2:
                            System.out.println("todos ganan!");
                            break;
                    }
                    break;
            }
            System.out.println("Puntos: Jugador 1 = " + puntos1 + " Jugador 2 = " + puntos2 + "\n");
        }

        if (puntos1 > puntos2) {
            System.out.println("Jugador 1 es el ganador!");
        } else if (puntos2 > puntos1) {
            System.out.println("Jugador 2 es el ganador!");
        } else {
            System.out.println("todos ganan!");
        }
        System.out.println("Puntos finales: Jugador 1 = " + puntos1 + " Jugador 2 = " + puntos2);
    }

        
                
        
        }
        
        
        
        
        
        
        
        
        
    }
    
}
