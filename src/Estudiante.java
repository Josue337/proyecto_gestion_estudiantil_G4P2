import java.util.ArrayList;

/**
 * La clase Estudiante representa a un estudiante con un ID, nombre y una lista de notas.
 */
class Estudiante {
    private int id;
    private String name;
    private ArrayList<Double> notas;

    /**
     * Constructor de la clase Estudiante.
     *
     * @param id   El ID del estudiante.
     * @param name El nombre del estudiante.
     */
    public Estudiante(int id, String name) {
        this.id = id;
        this.name = name;
        this.notas = new ArrayList<>();
    }

    /**
     * Devuelve una representación en cadena del estudiante, incluyendo su nombre y ID.
     *
     * @return Una cadena con el nombre y el ID del estudiante.
     */
    @Override
    public String toString() {
        return "Nombre: " + name + ", ID: " + id;
    }

    /**
     * Imprime el nombre del estudiante.
     */
    public void getEstudiante() {
        System.out.println(name);
    }

    /**
     * Calcula y muestra el promedio de las notas del estudiante.
     *
     * @throws IllegalArgumentException Si el estudiante no tiene ninguna nota.
     */
    public void calcularPromedio() {
        if (notas.isEmpty()) {
            throw new IllegalArgumentException("Primero debe ingresar las notas.");
        }

        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedio = sumaNotas / notas.size();
        System.out.println("El promedio del estudiante es de: " + promedio);
    }

    /**
     * Muestra todas las notas del estudiante.
     */
    public void mostrarNota() {
        System.out.println(notas);
    }

    /**
     * Agrega una nota a la lista de notas del estudiante.
     *
     * @param notaAgregada La nota a agregar.
     */
    public void agregarNota(double notaAgregada) {
        notas.add(notaAgregada);
    }

    /**
     * Actualiza una nota existente en la lista de notas del estudiante.
     *
     * @param index     El índice de la nota a actualizar.
     * @param nuevaNota La nueva calificación para la nota especificada.
     */
    public void actualizarNota(int index, double nuevaNota) {
        if (index >= 0 && index < notas.size()) {
            notas.set(index, nuevaNota);
            System.out.println("Nota actualizada exitosamente.\n");
        } else {
            System.out.println("Índice de nota no válido.\n");
        }
    }
}