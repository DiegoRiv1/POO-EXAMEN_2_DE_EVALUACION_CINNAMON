package problema3_examen_practico;
/**
 * @author Diego
 */
public class Administrador 
        extends EmpleadoTiempoCompleto implements ElegibleParaBono{
        private int porcentajeBono;

    public Administrador() {
    }

    public Administrador(int porcentajeBono, String ID, String nombre, int salario) {
        super(ID, nombre, salario);
        this.porcentajeBono = porcentajeBono;
    }

    public int getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(int porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }

    
    public double calcularBono() {
        double aniadido = (getPorcentajeBono() * getSalario()) / 100;
        return (aniadido + getSalario());
    }
    
}
