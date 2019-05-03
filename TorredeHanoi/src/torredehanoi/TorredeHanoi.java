
package torredehanoi;
import java.util.Scanner;
/**
 *
 * @author Jorge Ivan Vasquez Sosa (0901-16-4067)
 */
public class TorredeHanoi {

    static int Nmovimientos;
    
    public static void main(String[] args) {
       // Lee el numero de disco
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero de discos: ");// Pide en pantalla en numero de discos que el usuario quiere
        int Ndiscos = teclado.nextInt();//se ingrese en el teclado el numero de disco que el usuario quiere y ese numero ingresado se guardara en la variable Ndiscos
        System.out.println("");
        
        Hanoi(Ndiscos, "Torre 1", "Torre 2", "Torre 3");
        
        System.out.println("Se resolvio en: "+Nmovimientos+" Movimientos.");
        
    }
    
    // metodo recursivo 
    public static void Hanoi(int disco, String Torrea, String Torreb, String Torrec) { 
        if(disco == 1) { 
            Nmovimientos = Nmovimientos + 1;
            System.out.println(Nmovimientos+": Mover disco "+disco+" de "+Torrea+" a "+Torrec);
        } else {      
            Hanoi(disco-1, Torrea, Torrec, Torreb);
            Nmovimientos = Nmovimientos + 1;
            System.out.println(Nmovimientos+": Mover disco "+disco+" de "+Torrea+" a "+Torrec);
            Hanoi(disco-1, Torreb, Torrea, Torrec);
            
        }
    }
    
}
