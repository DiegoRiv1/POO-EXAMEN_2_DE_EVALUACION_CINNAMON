package problema3_examen_practico;
/**
 *
 * @author Diego
 */
public class EmpleadoTiempoCompleto extends Empleados{

    public EmpleadoTiempoCompleto() {
    }
    
    public EmpleadoTiempoCompleto(String ID, String nombre, int salario) {
        super(ID, nombre, salario);
    }
    
    public double calcularSalario() {
        double sueldo = getSalario();
        return sueldo;
    }
    
}
