import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MenuAdmin {
    public ArrayList<Departamento> departamentos = new ArrayList<>();
    public ArrayList<Sala> salas = new ArrayList<>();
    public int cont = 0;
    String codigoDepart;
    String codigoSala;
    String nombDepart;
    String nombSala;
    int resp;
    int opcionAdmin=0;
    int opcionDepart=0;

    public void listarDep() {
        Iterator<Departamento> iterador = this.departamentos.iterator();

        while(iterador.hasNext()) {
            Departamento departamento = iterador.next();
            System.out.println("Código: " + departamento.codigo + ", nombre: " + departamento.nombre);
        }

    }
    public void anadirDepartamento(String nombre, String codigo) {
        boolean valido = true;

        // Verificar la longitud del código
        if (codigo.length() != 3) {
            valido = false;
            System.out.println("El código debe tener exactamente 3 caracteres.");
        }

        // Verificar la existencia del nombre
        for (Departamento departamento : this.departamentos) {
            if (departamento.nombre.equalsIgnoreCase(nombre)) {
                valido = false;
                System.out.println("Este nombre ya existe.");
                break; // Terminar el bucle si se encuentra un nombre existente
            }
        }

        // Añadir el departamento si es válido
        if (valido) {
            this.departamentos.add(new Departamento(nombre, codigo));
            System.out.println("Departamento añadido con éxito.");
        }
    }

    public void eliminarDep(String codigo) {
        Iterator<Departamento> iterator = this.departamentos.iterator();

        while (iterator.hasNext()) {
            Departamento departamento = iterator.next();

            if (departamento.codigo.equalsIgnoreCase(codigo)) {
                iterator.remove();
                System.out.println("Departamento eliminado con éxito.");
                return; // Termina el método después de eliminar el departamento
            }
        }

        System.out.println("No se encontró ningún departamento con el código especificado.");
    }
    public void listarSalas() {
        Iterator<Sala> iterador = this.salas.iterator();

        while(iterador.hasNext()) {
            Sala salas = iterador.next();
            System.out.println("Código: " + salas.codigo + ", nombre: " + salas.nombre);
        }

    }
    public void anadirSala(String nombre, String codigo) {
        boolean valido = true;

        // Verificar la longitud del código
        if (codigo.length() != 3) {
            valido = false;
            System.out.println("El código debe tener exactamente 3 caracteres.");
        }

        // Verificar la existencia del nombre
        for (Sala salas : this.salas) {
            if (salas.nombre.equalsIgnoreCase(nombre)) {
                valido = false;
                System.out.println("Esta sala ya existe.");
                break; // Terminar el bucle si se encuentra un nombre existente
            }
        }

        // Añadir la sala si es válido
        if (valido) {
            this.salas.add(new Sala(nombre, codigo));
            System.out.println("Sala añadida con éxito.");
        }
    }
    public void eliminarSalas(String codigo) {
        Iterator <Sala> iterator = this.salas.iterator();

        while (iterator.hasNext()) {
            Sala salas = iterator.next();

            if (salas.codigo.equalsIgnoreCase(codigo)) {
                iterator.remove();
                System.out.println("Sala eliminada con éxito.");
                return; // Termina el método después de eliminar la sala
            }
        }

        System.out.println("No se encontró ningúna sala con el código especificado.");
    }
}