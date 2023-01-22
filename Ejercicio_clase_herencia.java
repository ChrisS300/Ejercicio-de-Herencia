import java.net.Inet4Address;

public class Ejercicio_clase_herencia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Hernando Goméz");
        cliente.setEdad(35);
        cliente.setTelefono("+13-1-545-5815");
        cliente.setCredito(20500.75);
        System.out.println( "Nombre del Cliente: " +cliente.getNombre() +
                "; Edad: "+ cliente.getEdad()+ "; #Teléfono: "+cliente.getTelefono() +
                "; Cupo Crédito($): " + cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Niel Larthy");
        trabajador.setEdad(23);
        trabajador.setTelefono("+9-5-785-3657");
        trabajador.setSalario(8500.62);
        System.out.println( "Nombre del Trabajador: " +trabajador.getNombre() +
                "; Edad: "+ trabajador.getEdad()+ "; #Teléfono: "+trabajador.getTelefono() +
                "; Salario($): " + trabajador.getSalario());

    }
}

 class Persona {
    private String nombre;
   private int edad;
    private  String telefono;
     public void setNombre(String nombre) {
         this.nombre=nombre;
     }
     public String getNombre(){
         return nombre;
     }
     public void setEdad(int edad) {
         this.edad=edad;
     }
     public int getEdad(){
         return edad;

     }
     public void setTelefono(String telefono) {
         this.telefono=telefono;
     }
     public String getTelefono(){
         return telefono;

     }
}

class Cliente extends Persona {
   private double credito;
public void setCredito(double credito) {
    this.credito=credito;
    }
    public double getCredito(){
    return credito;
    }
}
class Trabajador extends Persona {
    private double salario;
    public void setSalario(double salario) {
        this.salario=salario;
    }
    public double getSalario(){
        return salario;
    }

}