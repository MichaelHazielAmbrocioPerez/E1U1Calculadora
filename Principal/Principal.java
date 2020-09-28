package Principal;
import Logica.Operaciones;
import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
    Operaciones metodo = new Operaciones();
    Scanner V = new Scanner(System.in);
    int opc;
    do{
        System.out.println("\tBienvenido"
        +"\n\t¿Que desea hacer?"
        +"\n\t[1]Suma"
        +"\n\t[2]Resta)"
        +"\n\t[3]Multiplicación"
        +"\n\t[4]Division"
        +"\n\t[5]Salir");
        opc = V.nextInt();
    switch(opc){
        case 1:
            System.out.println("El resultado de la suma es: \n" + metodo.Suma());
            break;
        case 2:
            System.out.println("El resultado de la resta es: \n" + metodo.Resta());
            break;
        case 3:
            System.out.println("El resultado de la multiplicación es: \n" + metodo.Multiplicacion());
            break;
        case 4:
            System.out.println("\nEl resultado de la división es: " + metodo.Division());
            break;
        case 5:
            System.out.println("Entendido, vuelva pronto");
            break;
    }
        }while(opc!=5);
    }

    private static Operaciones Operaciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
