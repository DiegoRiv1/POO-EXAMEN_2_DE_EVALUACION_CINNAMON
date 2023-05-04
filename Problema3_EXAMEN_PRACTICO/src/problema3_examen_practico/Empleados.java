package problema3_examen_practico;

/**
 * @author Diego
 */
public abstract class Empleados {
    private String ID;
    private String nombre;
    private double salario;

    public Empleados() {
    }

    public Empleados(String ID, String nombre, int salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double calcularSalario();
}
