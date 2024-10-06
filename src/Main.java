import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Menú del código
        System.out.println("---------------------------------");
        System.out.println("-Área--de--figuras--geométricas--");
        System.out.println("---------------------------------");
        System.out.println("De que figura desea calcular el área: ");
        System.out.println();
        System.out.println("1.-Triángulo");
        System.out.println("2.-Cuadrado");
        System.out.println("3.-Círculo");
        System.out.println("4.-Ninguno");
        //elección de calculo
        int opcion = sc.nextInt();
        //Condiciones
        if (opcion == 1) {
            System.out.println("--------------Triangulo---------------");
            System.out.println("Ingrese la base del triángulo:");
            double base = sc.nextDouble();
            System.out.println("ingrese la altura del triángulo:");
            double altura = sc.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("El area del triángulo es de: "+ area);

        } else if (opcion == 2) {
            //Área del cuadrado
            System.out.println("--------------Cuadrado---------------");
            System.out.println("---Ingrese la longitud del cuadrado--");
            double lado= sc.nextDouble();
            double areacuadrado= lado*lado;
            System.out.println("---El área del cuadrado es :"+areacuadrado);
        } else if (opcion == 3) {
            //Área del círculo
            System.out.println("------Círculo------");
            System.out.println("Ingrese el radio del círculo: ");
            double radio = sc.nextDouble();
            double area = Math.PI * radio * radio;
            System.out.println("El área del circulo es: " + area);
        } else if (opcion == 4) {
            System.out.println("No seleccionó ninguna opción");
        }

    }
}