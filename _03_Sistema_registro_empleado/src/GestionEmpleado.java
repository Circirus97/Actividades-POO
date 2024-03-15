import java.util.ArrayList;

public class GestionEmpleado {

    private ArrayList<Empleado> empleados;

    public GestionEmpleado() {
        this.empleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleados(Empleado empleado) {
        empleados.add(empleado);
    }

    public boolean eliminarEmpleado(int idEmpleado) {
        return empleados.removeIf(emp -> emp.getIdEmpleado() == idEmpleado);
    }

    public void mostrarEmpleados() {
        for (Empleado emp : empleados){
            System.out.println("ID Empleado: " + emp.getIdEmpleado()
            + " Nombre: " + emp.getNombre()
            + ", Salario: " + emp.getSalario());
        }
    }
}
