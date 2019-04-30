
package torredehanoi;
import java.util.Scanner;
/**
 *
 * @author Jorge Ivan Vasquez Sosa (0901-16-4067)
 */
public class TorredeHanoi {

    static int nMovimientos;
    
    public static void main(String[] args) {
       // Lee el numero de disco
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero de discos: ");
        int nDiscos = teclado.nextInt();
        System.out.println("");
        
        Hanoi(nDiscos, "Torre 1", "Torre 2", "Torre 3");
        
        System.out.println("Se resolvio en: "+nMovimientos+" Movimientos.");
        
    }
    
    // metodo recursivo 
    public static void Hanoi(int disco, String torreA, String torreB, String torreC) {
        if(disco == 1) {
            nMovimientos = nMovimientos + 1;
            System.out.println(nMovimientos+": Mover disco "+disco+" de "+torreA+" a "+torreC);
        } else {      
            Hanoi(disco-1, torreA, torreC, torreB);
            nMovimientos = nMovimientos + 1;
            System.out.println(nMovimientos+": Mover disco "+disco+" de "+torreA+" a "+torreC);
            Hanoi(disco-1, torreB, torreA, torreC);
            
        }
    }
    
}
