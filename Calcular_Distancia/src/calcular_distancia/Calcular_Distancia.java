package calcular_distancia;

import java.util.Scanner;

/**
 * @author invitado
 */
public class Calcular_Distancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("FORMULA 1");
        double vi;
        Scanner velocidadInicial = new Scanner(System.in);
        System.out.println("Ingresa la velocidad inicial");
        vi=velocidadInicial.nextDouble();
        
        double t;
        Scanner tiempo = new Scanner(System.in);
        System.out.println("Ingresa el tiempo");
        t=tiempo.nextDouble();
        
        double a;
        Scanner aceleracion = new Scanner(System.in);
        System.out.println("Ingresa la aceleracion");
        a=aceleracion.nextDouble();
        
      
 
        
    }
    public interface Captura{
        void setVelocidadInicial(double vi);
        void setVelocidadFinal(double vf);
        void setAceleracion(double a);
        void setTiempo(double t);
        double getVelocidadInicial();
        double getVelocidadFinal();
        double getAceleracion();
        double getTiempo();
    }
    public abstract class Movimiento implements Captura{
        private double velocidadInicial;
        private double velocidadFinal;
        private double aceleracion;
        private double tiempo;
        
        public Movimiento(){
            this.velocidadInicial = 0.0;
            this.velocidadFinal = 0.0;
            this.aceleracion = 1.0;
            this.tiempo = 1.0;
    }
        public Movimiento(double vi, double vf, double a, double t){
            this.velocidadInicial = vi;
            this.velocidadFinal = vf;
            this.aceleracion = a;
            this.tiempo = t;
        }
        
        public void setVelocidadInicial(double vi){
            this.velocidadInicial = vi;
        }
        public void setVelocidadFinal(double vf){
            this.velocidadFinal = vf;
        }
        public void setAceleracion(double a){
            this.aceleracion = a;
        }
        public void setTiempo(double t){
            this.tiempo = t;
        }
        
        public double getVelocidadInicial(){
            return this.velocidadInicial;
        }
        public double getVelocidadFinal(){
            return this.velocidadFinal;
        }
        public double getAceleracion(){
            return this.aceleracion;
            
        }
        public double getTiempo(){
            return this.tiempo;
        }
        
        public abstract double CalcularDistancia();
    }
    public class DistanciaFormula1 extends Movimiento{
        
        public DistanciaFormula1(){
            super();
        }
        public DistanciaFormula1(double vi, double vf, double a, double t){
            super(vi, vf, a, t);
        }
        public double CalcularDistancia(){
            double d = (this.getVelocidadInicial() + this.getVelocidadFinal() / 2 * this.getTiempo());
            return d;
        }
        public class DistanciaFormula2 extends Movimiento{
            
            public DistanciaFormula2(){
                super();
            }
            
            public DistanciaFormula2(double vi, double vf, double a, double t){
                super(vi, vf, a, t);
            }
            
            public double CalcularDistancia(){
                double d = this.getVelocidadInicial() * this.getTiempo() + 0.5 * this.getAceleracion() * Math.pow(this.getTiempo(), 2);
                return d;
            }
        }
        public class DistanciaFormula3 extends Movimiento{
            
            public DistanciaFormula3(){
                super();
            }
            
            public DistanciaFormula3(double vi, double vf, double a, double t){
                super(vi, vf, a, t);
            }
            public double CalcularDistancia(){
                double d = this.getVelocidadFinal() - this.getVelocidadInicial() / 2 * this.getAceleracion();
                return d;
            }

     
        
        }
    }
}