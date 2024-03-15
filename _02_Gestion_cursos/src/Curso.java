import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    private String codigo;

    private String nombre;

    private ArrayList<Estudiante> listaEstudiantes;

    private static int idEstudiante = 1;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void guardarEstudiante(Scanner objScan) {
        System.out.println("Agregar nuevo estudiante");
        System.out.println("Ingresa el nombre del estudiante: ");
        String nombre = objScan.next();

        System.out.println("Ingresa el email del estudiante: ");
        String email = objScan.next();

        Estudiante objEstudiante = new Estudiante(idEstudiante, nombre, email);
        idEstudiante++;

        if (this.listaEstudiantes.add(objEstudiante)) {
            System.out.println("Estudiante agregado correctamente!");
        } else {
            System.out.println("El estudiante, no se pudo agregar.");
        }
    }

    public void listarEstudiantes() {

        //Validar si la lista esta vacía

        if (this.listaEstudiantes.isEmpty()) {
            System.out.println("el curso ".concat(this.nombre).concat("El curso no tiene estudiantes."));
        } else {

            System.out.println("Lista de estudiantes en el curso -" + this.nombre);

            for (Estudiante estudiante : this.listaEstudiantes) {
                System.out.println("Estudiante: " + estudiante.getNombre() +
                        ", email del estudiante: " + estudiante.getEmail() +
                        "id del estudiante: " + estudiante.getId());
            }
        }

    }

    public void eliminarEstudiantes(Scanner objScan) {

        this.listarEstudiantes();

        System.out.println("Ingrese el id del estudiante que desea retirar: ");
        int idConsultado = objScan.nextInt();

        if (this.listaEstudiantes.removeIf(estudiante -> estudiante.getId() == idConsultado)) {
            System.out.println("Estudiante eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el estudiante.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
