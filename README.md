# Sistema de Gestión de Estudiantes

Este proyecto es una aplicación de consola desarrollada en Java para gestionar estudiantes y sus calificaciones. Permite registrar estudiantes, agregarles calificaciones, calcular el promedio de sus notas, actualizar calificaciones específicas y eliminarlos del sistema.

## Características

- **Agregar estudiantes**: Permite registrar un nuevo estudiante con un identificador único y nombre.
- **Registrar calificaciones**: Añade calificaciones individuales a cada estudiante.
- **Actualizar calificaciones**: Modifica calificaciones específicas de un estudiante.
- **Consultar promedio**: Calcula y muestra el promedio de calificaciones de un estudiante.
- **Eliminar estudiantes**: Elimina a un estudiante registrado en el sistema.

## Estructura del Proyecto
### Clase `Estudiante`

La clase `Estudiante` encapsula la información de cada estudiante y sus calificaciones.

- **Atributos**:
    - `id` (int): Identificador único del estudiante.
    - `name` (String): Nombre del estudiante.
    - `notas` (ArrayList<Double>): Lista de calificaciones.

- **Métodos**:
    - `toString`: Retorna el nombre e ID del estudiante en formato de cadena.
    - `getEstudiante`: Muestra el nombre del estudiante.
    - `calcularPromedio`: Calcula y muestra el promedio de calificaciones.
    - `mostrarNota`: Muestra todas las calificaciones del estudiante.
    - `agregarNota`: Añade una nueva calificación a la lista.
    - `actualizarNota`: Modifica una calificación en una posición específica de la lista.

### Clase `GestorEstudiante`

La clase `GestorEstudiante` contiene el método principal (`main`) que gestiona el flujo de la aplicación, mostrando un menú interactivo que permite al usuario:

1. **Agregar estudiantes**: Registrar nuevos estudiantes.
2. **Ingresar o actualizar calificación**: Añadir una nueva calificación o actualizar una existente.
3. **Consultar promedio de un estudiante**: Mostrar el promedio de calificaciones de un estudiante específico.
4. **Eliminar estudiante**: Quitar un estudiante de la lista.
5. **Salir del programa**: Terminar la aplicación.

## Tecnologías

- **Lenguaje**: Java

## Requisitos

- Java Development Kit (JDK) 8 o superior.

## Instalación y Ejecución

1. Clona este repositorio:
   ```bash
   git clone https://github.com/usuario/sistema-gestion-estudiantes.git
