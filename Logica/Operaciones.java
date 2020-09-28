package Logica;

import java.util.Scanner;

public class Operaciones {
    Scanner v = new Scanner(System.in);
    private double a,b;

public double Suma(){
    double c;
    System.out.println("---Ha seleccionado la opcion de suma---\n");
    System.out.println("Introdusca el valor 1\n");
    a = v.nextDouble();
    System.out.println("Introduzca el valor 2\n");
    b = v.nextDouble();
    c = a + b;
    return c;
}
public double Resta(){
    double c;
    System.out.println("---Ha seleccionado la opcion de resta---\n");
    System.out.println("Introduzca el valor 1");
    a = v.nextDouble();
    System.out.println("Introduzca el valor 2");
    b = v.nextDouble();
    c = a - b;
    return c;
}
public double Multiplicacion(){
    double c;
    System.out.println("---Ha seleccionado la opcion de multiplicación---\n");
    System.out.println("Introduce el valor 1");
    a = v.nextDouble();
    System.out.println("Introduce el valor 2");
    b = v.nextDouble();
    c = a * b;
    return c;
}
public double Division(){
    double c=0;
    try{
    System.out.println("---Ha seleccionado la opcion de división---\n");
    System.out.println("Introduzca el dividendo");
    a = v.nextDouble();
    System.out.println("Introduzca el divisor");
    b = v.nextDouble();
    c = a / b;
        
    }catch(Exception e){
        System.out.println(e.getCause());
    }
        return c;
}
    
}
