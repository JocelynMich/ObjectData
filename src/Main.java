import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        String nombre, matricula;
        double c1,c2,c3;

        Scanner t= new Scanner(System.in);
        Alumno a; //Objeto de la clase
        a= new Alumno(); //crear objeto
        try {
        System.out.print("Nombre: ");
        nombre = t.nextLine();

        System.out.print("Matricula: ");
        matricula=t.nextLine();

        System.out.print("Calificacion 1: ");
        c1=t.nextDouble();

        System.out.print("Calificacion 2: ");
        c2=t.nextDouble();

        System.out.print("Calificacion 3: ");
        c3=t.nextDouble();

            a.setMatricula(matricula);
            a.setNombre(nombre);
            a.setCalif1(c1);
            a.setCalif2(c2);
            a.setCalif3(c3);
        }catch (InputMismatchException e) {
            System.out.println("Error al ingresar calificaciones");
            System.out.println(e.getMessage());
        }

        System.out.println("Promedio: " + a.calculaPromedio());

        System.out.println(a.getNombre());
        System.out.println(a.getCalif1());

    }

}