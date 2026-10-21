public class Main { 
public static void main( String[] args) { 
    mostrarSaludo(" Ana"); 
System.out.println("Resultado de la suma: " + sumar(4, 6));

} 
<<<<<<< HEAD

public static void mostrarSaludo(String nombre){ 
    System.out.println("=============================="); 
System.out.println("Hola, " + nombre + "!");
System.out.println("Bienvenido/ a a la práctica de Git.");
System.out.println("=============================="); 
} 

public static int sumar( int a, int b) { 
return a + b; 
=======
public static void mostrarSaludo(String nombre){ 
System.out.println("Hola" + nombre); 
>>>>>>> feature-suma
} 
public static int sumar( int a, int b){
System.out.println("Sumando" + a + " + " + b + "...");
int resultado = a + b;
return resultado;

} 

