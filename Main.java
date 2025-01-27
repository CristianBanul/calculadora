import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        terminal : while (true){
            mostrarOpciones();
            input = scanner.next().toLowerCase();
            switch (input) {
                case "1":
                    int resultado = calculadoraSuma(scanner);
                    System.out.println("El resultado es: ");
                    System.out.println(resultado);
                    break;
                case "2":
                   int resultado1 = calculadoraResta(scanner);
                    System.out.println("El resultado es: ");
                    System.out.println(resultado1);
                    break;
                case "3":
                    int resultado2 = calculadoraMultiplicacion(scanner);
                    System.out.println("El resultado es: ");
                    System.out.println(resultado2);
                    break;
                case "4":
                    int resultado3 = calculadoraDivision(scanner);
                    System.out.println("El resultado es: ");
                    System.out.println(resultado3);
                    break;
                case "5":
                    System.out.println("Has salido del programa");
                    break terminal;
                default:
                    System.out.println("Comando invalido");
                    break;
            }
        }
    }

    static void mostrarOpciones(){
        System.out.println("Por favor elige una opcion: ");
        System.out.println("1. Calculadora de suma");
        System.out.println("2. Calculadora de resta");
        System.out.println("3. Calculadora de multiplicación");
        System.out.println("4. Calculadora de division");
        System.out.println("5. Salir ok bla bla bla");
    }
    static int calculadoraSuma(Scanner scanner){
        System.out.println("Elige el primer numero: ");
        int a = scanner.nextInt();
        System.out.println("Elige el segundo numero: ");
        int b = scanner.nextInt();
        return a + b;

    }
    static int calculadoraResta(Scanner scanner){
        System.out.println("Elige el primer numero: ");
        int c = scanner.nextInt();
        System.out.println("Elige el segundo numero: ");
        int d = scanner.nextInt();
        return c - d;
    }
    static int calculadoraMultiplicacion(Scanner scanner){
        System.out.println("Elige el primer numero: ");
        int e = scanner.nextInt();
        System.out.println("Elige el segundo numero: ");
        int f = scanner.nextInt();
        return e * f;
    }
    static int calculadoraDivision(Scanner scanner){
        System.out.println("Elige el primer numero: ");
        int g = scanner.nextInt();
        System.out.println("Elige el segundo numero: ");
        int h = scanner.nextInt();
        return g / h;
    }
}