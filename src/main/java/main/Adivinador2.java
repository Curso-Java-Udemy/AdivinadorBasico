
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
        System.out.println("Adivinador 2.0 - Dispones de 10 intentos para adivinar");
        
        //System.out.println("For Debuggin "+numeroSecreto);
        
        for(intento=1;intento<=10;intento++)
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
