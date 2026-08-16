
public class ObjVehiculo {

    private String Marca;
    private String Tipo;
    private int Cilindraje;
    private int PagoAnterior; 
    private int PagoActual;
    private int NumeroCelda;

    public ObjVehiculo(String marca, String tipo, int cilindraje, int pagoAnterior, int pagoActual, int numeroCelda) {
        Marca = marca;
        Tipo = tipo;
        Cilindraje = cilindraje;
        PagoAnterior = pagoAnterior;
        PagoActual = pagoActual;
        NumeroCelda = numeroCelda;
    }

    public ObjVehiculo() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }

    public int getPagoAnterior() {
        return PagoAnterior;
    }

    public void setPagoAnterior(int pagoAnterior) {
        PagoAnterior = pagoAnterior;
    }

    public int getPagoActual() {
        return PagoActual;
    }

    public void setPagoActual(int pagoActual) {
        PagoActual = pagoActual;
    }

    public int getNumeroCelda() {
        return NumeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        NumeroCelda = numeroCelda;
    }  
    
}
