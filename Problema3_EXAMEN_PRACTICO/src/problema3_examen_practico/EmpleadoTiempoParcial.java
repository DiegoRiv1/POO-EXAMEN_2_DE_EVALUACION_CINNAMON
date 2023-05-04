package problema3_examen_practico;
/**
 * @author Diego
 */
public class EmpleadoTiempoParcial extends Empleados{
    
    private double pagoPorHora;
    private double horasTrabajadas;

    public EmpleadoTiempoParcial() {
    }

    public EmpleadoTiempoParcial(double pagoPorHora, double horasTrabajadas, String ID, String nombre, int salario) {
        super(ID, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalario() {
        double sueldo;
        sueldo = getHorasTrabajadas() * getPagoPorHora();
        return sueldo;
    }
    
}
