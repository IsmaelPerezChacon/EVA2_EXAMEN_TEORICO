/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_examen_practico;

import java.util.Scanner;

/**
 *
 * @author Jennis
 */
public class EVA2_EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 String[] opciones = {"Piedra", "Papel", "Tijeras"};
        int victoriasUsuario = 0;
        int victoriasMaquina = 0;
  Scanner captu = new Scanner(System.in);
   while (true) {
           System.out.println("Elige tu jugada (Piedra[0],Papel[1],Tijeras[2],SALIR[3]):");
            int jugadaUsuario = captu.nextInt();
     if (jugadaUsuario < 0 || jugadaUsuario > 3) {
                System.out.println("Error favor de seleccionar una opcion valida");
                continue;
            }
 if (jugadaUsuario == 3) {
                break;
            }

            int jugadaMaquina = (int) (Math.random() * 3);

            System.out.println("Tu jugada: " + opciones[jugadaUsuario]);
            System.out.println("Jugada de la maquina: " + opciones[jugadaMaquina]);

            if (jugadaUsuario == jugadaMaquina) {
                System.out.println("EMPATE!");
            } else if ((jugadaUsuario == 0 && jugadaMaquina == 2) ||
                    (jugadaUsuario == 1 && jugadaMaquina == 0) ||
                    (jugadaUsuario == 2 && jugadaMaquina == 1)) {
                System.out.println("Ganaste");
                victoriasUsuario++;
            } else {
                System.out.println("Maquina ganadora");
                victoriasMaquina++;
            }
        }
 System.out.println("Resultados:");
 System.out.println("Victorias del usuario: " + victoriasUsuario);
 System.out.println("Victorias de la maquina: " + victoriasMaquina);
    }
}

  
    
