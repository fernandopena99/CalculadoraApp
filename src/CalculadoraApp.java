import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) { //pvsm para que sea mas rapido
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicación Caluladora ****");
            //Mostramos el Menú
            mostrarMenu();
            try{
                var operacion = Integer.parseInt(consola.nextLine());
                //Rivisar que este dentro de las opciones realizadas
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { //Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                //Imprimimos un salto antes que se repita el ciclo
                System.out.println();
            }//fin try
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        } // fin while
    }// fin main

    private static void mostrarMenu(){
        // System.out.println("1. Suma \n2. Resta \n3. Multiplicar \n4. Dividir \n5. Salir");
        //Otra Opción
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    """);
        System.out.println("Operación a realizar ?");
    }
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> { //Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado suma: " + resultado);
            }
            case 2 -> { //Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado resta: " + resultado);
            }
            case 3 -> { //Multiplicar
                resultado = operando1 * operando2;
                System.out.println("Resultado multiplicar: " + resultado);
            }
            case 4 -> { //Dividir
                resultado = operando1 / operando2;
                System.out.println("Resultado dividir: " + resultado);
            }
            default -> System.out.println("Opción erronea " + operacion);
        }
    }
}// fin clase
