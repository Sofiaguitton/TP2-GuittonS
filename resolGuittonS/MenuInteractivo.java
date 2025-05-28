package resolGuittonS;
import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int opcion  = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    Ejercicio1 ejercicio1=new Ejercicio1(); 
                    ejercicio1.ejercicio1();
                    break;
                case 2:
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.ejercicio2();
                break;
                case 3:
                    Ejercicio3 ejercicio3= new Ejercicio3();
                    ejercicio3.ejercicio3();
                break;
                case 4:
                    Ejercicio4 ejercicio4=new Ejercicio4(); 
                    ejercicio4.ejercicio4();
                    break;
                case 5:
                    Ejercicio5 ejercicio5=new Ejercicio5(); 
                    ejercicio5.ejercicio5();
                    break;
                case 6:
                    Ejercicio6 ejercicio6=new Ejercicio6(); 
                    ejercicio6.ejercicio6();
                    break; 
                case 7:
                    Ejercicio7 ejercicio7=new Ejercicio7(); 
                    ejercicio7.ejercicio7();
                    break; 
                case 8:
                    Ejercicio8 ejercicio8=new Ejercicio8(); 
                    ejercicio8.ejercicio8();
                    break; 
                case 9:
                    Ejercicio9 ejercicio9=new Ejercicio9(); 
                    ejercicio9.ejercicio9();
                    break; 
                case 10:
                    Ejercicio10 ejercicio10=new Ejercicio10(); 
                    ejercicio10.ejercicio10();
                    break;
                default : 
                System.out.println("Opcion invalida");
                main (args);
                break;
            }
        
        scanner.close();
        }


        
    }
    