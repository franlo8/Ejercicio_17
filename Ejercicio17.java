import java.util.Scanner;

class Ejercicio17 {
    public static void main(String[] args) {
        double radio, areacirculo, longitucircunferencia;
        Scanner leerporteclado = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del radio ");
        radio = leerporteclado.nextDouble();
        areacirculo = Math.PI * Math.pow(radio, 2);
        longitucircunferencia = 2 * Math.PI * radio;
        
        System.out.println("El radio es " + radio);
        
        System.out.println("El area del circulo es " + areacirculo);
        
        System.out.println("La longitu de la circunferencia es " + longitucircunferencia);
        
    }
}