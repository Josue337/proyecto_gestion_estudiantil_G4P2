import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que contiene el menú de opciones para gestionar estudiantes.
 */
public class GestorEstudiantes {
    /**
     * Método principal que ejecuta el menú para la gestión de estudiantes.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        while (true) {
            try {
                System.out.println("\n1. Agregar estudiante");
                System.out.println("2. Ingresar o actualizar calificación");
                System.out.println("3. Consultar estudiante y promedio");
                System.out.println("4. Eliminar estudiante");
                System.out.println("5. Salir del programa");

                System.out.print("Ingrese la opción que necesita: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar buffer
                System.out.println("______________________________________________");

                switch (opcion) {
                    case 1:
                        // Lógica para agregar un estudiante
                        System.out.print("Ingrese el ID del estudiante: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del estudiante: ");
                        String nombre = scanner.nextLine();

                        Estudiante estudiante = new Estudiante(id, nombre);
                        estudiantes.add(estudiante);
                        System.out.println("Estudiante " + nombre + " agregado exitosamente.\n");
                        break;

                    case 2:
                        // Lógica para ingresar o actualizar calificación
                        System.out.println("1. Ingresar calificación");
                        System.out.println("2. Actualizar calificación");
                        System.out.print("Ingrese la opción que necesita: ");
                        int indicador = scanner.nextInt();
                        scanner.nextLine();

                        switch (indicador) {
                            case 1:
                                // Lógica para ingresar calificación
                                System.out.println("Lista de estudiantes:");
                                for (int i = 0; i < estudiantes.size(); i++) {
                                    System.out.println((i + 1) + ". " + estudiantes.get(i));
                                }

                                System.out.print("¿A qué estudiante se le va a ingresar la nota? ");
                                int ingresarEstudiante = scanner.nextInt() - 1;

                                if (ingresarEstudiante >= 0 && ingresarEstudiante < estudiantes.size()) {
                                    System.out.print("Ingrese la nota: ");
                                    double notaAgregada = scanner.nextDouble();
                                    estudiantes.get(ingresarEstudiante).agregarNota(notaAgregada);
                                    System.out.println("Nota agregada exitosamente.\n");
                                } else {
                                    System.out.println("Índice de estudiante no válido.\n");
                                }
                                break;

                            case 2:
                                // Lógica para actualizar calificación
                                System.out.println("Lista de estudiantes:");
                                for (int i = 0; i < estudiantes.size(); i++) {
                                    System.out.println((i + 1) + ". " + estudiantes.get(i));
                                }

                                System.out.print("¿A qué estudiante desea actualizar la nota? ");
                                int actualizarEstudiante = scanner.nextInt() - 1;

                                if (actualizarEstudiante >= 0 && actualizarEstudiante < estudiantes.size()) {
                                    Estudiante est = estudiantes.get(actualizarEstudiante);
                                    est.mostrarNota();
                                    System.out.print("Ingrese el índice de la nota a actualizar: ");
                                    int indexNota = scanner.nextInt() - 1;
                                    System.out.print("Ingrese la nueva calificación: ");
                                    double nuevaNota = scanner.nextDouble();
                                    est.actualizarNota(indexNota, nuevaNota);
                                    System.out.println("Nota actualizada exitosamente.\n");
                                } else {
                                    System.out.println("Índice de estudiante no válido.\n");
                                }
                                break;

                            default:
                                System.out.println("Opción no válida.\n");
                        }
                        break;

                    case 3:
                        // Lógica para consultar estudiante y promedio
                        System.out.println("Lista de estudiantes:");
                        for (int i = 0; i < estudiantes.size(); i++) {
                            System.out.println((i + 1) + ". " + estudiantes.get(i));
                        }

                        System.out.print("¿De qué estudiante quiere saber el promedio? ");
                        int numEstudiante = scanner.nextInt() - 1;

                        if (numEstudiante >= 0 && numEstudiante < estudiantes.size()) {
                            estudiantes.get(numEstudiante).getEstudiante();
                            estudiantes.get(numEstudiante).calcularPromedio();
                        } else {
                            System.out.println("Índice de estudiante no válido.\n");
                        }
                        break;

                    case 4:
                        // Lógica para eliminar estudiante
                        System.out.println("Lista de estudiantes:");
                        for (int i = 0; i < estudiantes.size(); i++) {
                            System.out.println((i + 1) + ". " + estudiantes.get(i));
                        }

                        System.out.print("Ingrese el número del estudiante que desea eliminar: ");
                        int eliminarEstudiante = scanner.nextInt() - 1;

                        if (eliminarEstudiante >= 0 && eliminarEstudiante < estudiantes.size()) {
                            estudiantes.remove(eliminarEstudiante);
                            System.out.println("Estudiante eliminado exitosamente.\n");
                        } else {
                            System.out.println("Índice de estudiante no válido.\n");
                        }
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opción no válida.\n");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "\n");
                scanner.nextLine();  // Limpiar el buffer en caso de excepción
            }
        }
    }
}