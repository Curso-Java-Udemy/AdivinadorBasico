
package main;

import java.util.Random;
import java.util.Scanner;

public class Adivinador2 {

    public static void main(String[] args) {
        
        //Variables
        int intento, user;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int numeroSecreto = numero.nextInt(100)+1;
        boolean gano=false;
        final int MAX_INTENTOS = 3;
        System.out.println("Adivinador 2.0 - Dispones de "+MAX_INTENTOS+" intentos para adivinar");
        
        //System.out.println("For Debuggin "+numeroSecreto);
        
        for(intento=1;intento<=MAX_INTENTOS;intento++)
        {
        System.out.print("Intento "+intento+": ");
        user = entrada.nextInt();
        
        if(user == numeroSecreto)
        {
            System.out.println("Ganaste!!!!!");
            gano=true;
            break;
        }
        
        if(user > numeroSecreto && intento!=10)
                System.out.println("En numero secreto es menor");
        else if(user < numeroSecreto && intento!=10)
                System.out.println("En numero secreto es mayor");
        }
        
        if(!gano)
            System.out.println("Perdiste!");
    }
}
