import java.util.ArrayList;
import java.util.Scanner;

public class GestionCurso {

    public ArrayList<Curso> listaCursos;

    public GestionCurso() {
        this.listaCursos = new ArrayList<>();
    }

    public void guardarCurso(Scanner objScan) {
        System.out.println("Agregar curso");

        System.out.println("Ingresa el codigo del curso: ");
        String codigoCurso = objScan.next();

        System.out.println("Ingresa el nombre del curso: ");
        String nombreCurso = objScan.next();

        //Si el metodo buscar no devuelve null, quiere decir que ese codigo ya existe
        if (this.buscarPorCodigo(codigoCurso) != null){
            System.out.println("El codigo ya existe");
        }else {
            //Creamos el curso
            Curso objCurso = new Curso(codigoCurso, nombreCurso);
            this.listaCursos.add(objCurso);
        }
    }

    public Curso buscarPorCodigo(String codigoBuscar) {

        for (Curso cursoTemp: this.listaCursos) {
            if (cursoTemp.getCodigo().equalsIgnoreCase(codigoBuscar)) {
                return cursoTemp;
            }
        }
        return null;
    }

    public void listarCurso() {

        if (this.listaCursos.isEmpty()){
            System.out.println("No hay cursos registrados");

        }else{
            System.out.println("Lista de cursos");

            for (Curso temp : this.listaCursos) {
                System.out.println(temp.toString());
            }
        }
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
}
