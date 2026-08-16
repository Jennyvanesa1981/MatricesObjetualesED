
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos M = new Metodos();
        int n = 0; // esta es la dimensión de la matriz 
        System.out.println("Por favor Ingrese la dimensión de la matriz");
        n= sc.nextInt();
        ObjVehiculo[][] m = new ObjVehiculo[n][n];
        m = M.LlenarCeldas(m);
        System.out.println("Ahora Vamos a calcular la nueva administración");
        m = M.CalcularNuevoPago(m);
        M.MostrarInformacionCeldas(m);

    }
}
