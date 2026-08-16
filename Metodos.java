
import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public ObjVehiculo[][] LlenarCeldas(ObjVehiculo[][] m) {
        int numeroCelda = 1;
        for (int i = 0; i < m.length; i++) { // filas 
            for (int j = 0; j < m.length; j++) { // columnas
                ObjVehiculo o = new ObjVehiculo();
                System.out.println("Ingrese la marca del Vehiculo");
                o.setMarca(sc.next());
                System.out.println("Ingrese el tipo de Vehiculo");
                o.setTipo(sc.next());
                System.out.println("Ingrese el Cilindraje del Vehiculo");
                o.setCilindraje(sc.nextInt());
                if(o.getCilindraje() > 900 && o.getCilindraje()<= 1600) {
                    o.setPagoAnterior(150000);
                } else if (o.getCilindraje()> 1600 && o.getCilindraje() <=2000) {
                    o.setPagoAnterior(200000);
                } else {
                    o.setPagoAnterior(250000);
                }
                o.setNumeroCelda(numeroCelda);
                numeroCelda++;
                m[i][j] = o;
            }    
        }
        return m;
    }

    public ObjVehiculo[][] CalcularNuevoPago(ObjVehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j].setPagoActual((int) (m[i][j].getPagoAnterior()* 1.23));
            }
        }
        return m;
    }

    public void MostrarInformacionCeldas(ObjVehiculo[][] m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Marca: " + m[i][j].getMarca());
                System.out.println("Tipo Vehiculo: " + m[i][j].getTipo());
                System.out.println("Cilindraje: " + m[i][j].getCilindraje());
                System.out.println("Pago Anterior: " + m[i][j].getPagoAnterior());
                System.out.println("Pago Actual: " + m[i][j].getPagoActual());
                System.out.println("Numero Celda: " + m[i][j].getNumeroCelda());
                System.out.println("-------------------------------------------  \n");
             
                
            }

        }
    }
}    

