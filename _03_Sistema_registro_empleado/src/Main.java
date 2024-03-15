public class Main {

    public static void main(String[] args) {

        GestionEmpleado gestionEmpleado = new GestionEmpleado();

        Empleado empleado1 = new EmpleadoPermanente(
                "Felipe",
                26,
                1,
                1000000,
                2);

        Empleado empleado2 = new EmpleadoPermanente(
                "María",
                25,
                2,
                2000000,
                3);

        Empleado empleado3 = new EmpleadoPermanente(
                "Pedro",
                24,
                3,
                3000000,
                4);

        gestionEmpleado.agregarEmpleados(empleado1);
        gestionEmpleado.agregarEmpleados(empleado2);
        gestionEmpleado.agregarEmpleados(empleado3);

        gestionEmpleado.mostrarEmpleados();

        gestionEmpleado.eliminarEmpleado(1);

        System.out.println("\nDespues de eliminar: ");
        gestionEmpleado.mostrarEmpleados();
    }
}