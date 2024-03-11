import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MenuAdmin {
    public ArrayList<Departamento> departamentos = new ArrayList<>();
    public ArrayList<Sala> salas = new ArrayList<>();
    public int cont = 0;

    public void listarDep() {
        Iterator<Departamento> iterador = this.departamentos.iterator();

        while(iterador.hasNext()) {
            Departamento departamento = (Departamento)iterador.next();
            System.out.println("Nombre: " + departamento.nombre + ", código: " + departamento.codigo);
        }

    }
    public void anadirDepartamento(String nombre, String codigo){
        boolean valido = true;


        if (codigo.length() != 3){
            valido = false;
        }
        else {
            for (int i = 0; i < cont; i++) {
                Iterator<Departamento> iterador = this.departamentos.iterator();
                Departamento departamento = (Departamento)iterador.next();
                String nombredep = departamento.nombre;
                if (nombredep.equalsIgnoreCase(nombre)){
                    valido = false;
                    System.out.println("Este nombre ya existe");
                }
                else {
                    this.departamentos.add(new Departamento(nombre, codigo));
                }
            }
        }
    }
    public void eliminarDep(String codigo) {
        boolean encontrado = false;
        Iterator<Departamento> iterator = this.departamentos.iterator();
        Departamento departamento = (Departamento)iterator.next();

        while(!encontrado) {
            if (departamento.codigo.equalsIgnoreCase(codigo)) {
                this.departamentos.remove(departamento);
                encontrado = true;
            } else {
                departamento = (Departamento)iterator.next();
            }
        }

    }
    public void listarSalas() {
        Iterator<Sala> iterador = this.salas.iterator();

        while(iterador.hasNext()) {
            Sala sala = (Sala)iterador.next();
            String var10001 = sala.nombre;
            System.out.println("Nombre: " + var10001 + ", código: " + sala.codigo);
        }

    }
    public void anadirSala(String nombre, String codigo){
        boolean valido = true;


        if (codigo.length() != 3){
            valido = false;
        }
        else {
            for (int i = 0; i < cont; i++) {
                Iterator<Sala> iterador = this.salas.iterator();
                Sala sala = (Sala)iterador.next();
                String nombresala = sala.nombre;
                if (nombresala.equalsIgnoreCase(nombre)){
                    valido = false;
                    System.out.println("Este nombre ya existe");
                }
                else {
                    this.salas.add(new Sala(nombre, codigo));
                }
            }
        }
    }
}