import javax.management.openmbean.CompositeDataInvocationHandler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner objScan = new Scanner(System.in);
        GestionCurso objGestion = new GestionCurso();

        int option = 0;

        do {
            System.out.println("""
                    MENU DE OPCIONES
                    1. Administrar curso.
                    2. Administrar estudiantes.
                    3. Salir.
                    """);

            option = objScan.nextInt();

            switch (option) {

                case 1:
                    int option2 = 0;
                    do {
                        System.out.println("""
                                MENU DE CURSOS
                                1. Crear un curso.
                                2. Buscar curso por código.
                                3. Listar cursos.
                                4. Salir.                        
                                """);
                        option2 = objScan.nextInt();

                        switch (option2) {
                            case 1:
                                objGestion.guardarCurso(objScan);
                                break;
                            case 2:
                                System.out.println("Ingresa el codigo del curso");
                                String codigo = objScan.next();
                                System.out.println(objGestion.buscarPorCodigo(codigo).toString());
                                break;
                            case 3:
                                objGestion.listarCurso();
                                break;
                        }

                    } while (option2 != 4);

                    break;
                case 2:
                    int option3 = 0;

                    do {
                        System.out.println("""
                                MENU GESTION DE ESTUDIANTES
                                1. Agregar estudiante.
                                2. Eliminar estudiante.
                                3. Listar estudiantes.
                                4. Salir.
                                """);

                        switch (option3) {
                            case 1:
                                objGestion.listarCurso();

                                System.out.println("Ingrese el codigo del curso del cual desea incribrir el estudiante: ");
                                String codigo = objScan.next();
                                Curso curso = objGestion.buscarPorCodigo(codigo);

                                if (curso == null) {
                                    System.out.println("Curso no encontrado.");
                                } else {
                                    curso.guardarEstudiante(objScan);
                                }
                                break;

                            case 2:
                                //Caso para eliminar un estudianteOBJ
                                ////1. Listar todos los cursos

                                objGestion.listarCurso();

                                // 2.  preguntar al usuario cual es el curso del estudiante a eliminar

                                System.out.println("Ingresa el codigo del curso del estudiante a eliminar :");
                                codigo = objScan.next();

                                //3. llamar al metodo que elimine

                                Curso objCurso = objGestion.buscarPorCodigo(codigo);


                                if (objCurso == null) {
                                    System.out.println("Codigo no valido");
                                } else {
                                    objCurso.eliminarEstudiantes((objScan));
                                }
                                break;

                            case 3:
                                objGestion.listarCurso();

                                System.out.println("Ingrese el codigo del curso del cual desea incribrir el estudiante: ");
                                codigo = objScan.next();
                                curso = objGestion.buscarPorCodigo(codigo);

                                if (curso == null) {
                                    System.out.println("Curso no encontrado.");
                                } else {
                                    curso.listarEstudiantes();
                                }
                                break;
                        }

                        option3 = objScan.nextInt();
                    } while (option3 != 4);
                    break;

            }

        } while (option != 3);


    }
}