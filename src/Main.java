import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    Scanner t= new Scanner(System.in);

    public static void main(String[] args) {
        Alumno a;
        a= new Alumno();
        System.out.println(a.getNombre());
        //a.nombre="Lillian";
        //a.matricula="19382";
        a.setNombre("Lillian York");
        a.calif1=98;
        a.calif2=89;
        a.calif3=75;

        System.out.println(a.getNombre());
        System.out.println(a.getCalif1());
        System.out.println(a.calculaPromedio());

    }

}