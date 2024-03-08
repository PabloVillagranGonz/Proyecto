import java.util.Arrays;

public class MenuAdmin {
    public Departamento[] departamentos;
    public Sala[] salas;
    public int cont = 0;

    public void listarDepartamento(){
        for (int i = 0; i < cont; i++) {
            System.out.println("-"+departamentos[i].nombre);
        }
    }
    public void anadirDepartamento(String nombre, String codigo){
        boolean valido = true;

        if (codigo.length() != 3){
            valido = false;
        }
        else {
            departamentos[cont].codigo = codigo;
            cont++;
            for (int i = 0; i < cont; i++) {
                if (departamentos[i].nombre.equalsIgnoreCase(nombre)){
                    valido = false;
                    System.out.println("Este nombre ya existe");
                }
                else {
                    departamentos[cont].nombre = nombre;
                }
            }
        }
    }
    public void eliminarDepartamento(String nombre, String codigo){
        int i = 0;
        boolean encontrado = false;
            while (i < cont && !encontrado){
                if (departamentos[i].nombre.equalsIgnoreCase(codigo)){
                    for (int j = i; j<cont -1; j++){
                        departamentos[j] = departamentos[j+1];
                    }
                    cont--;
                }
                else
                    i++;
            }
    }
    public void listarSalas(){
        for (int i = 0; i < cont; i++) {
            System.out.println("-"+salas[i].nombre);
        }
    }
    public void anadirSala(String nombre, String codigo){
        boolean valido = true;

        if (codigo.length() == 3){
            valido = false;
        }
        else {
            salas[cont].codigo = codigo;
            cont++;
            for (int i = 0; i < cont; i++) {
                if (salas[i].nombre.equalsIgnoreCase(nombre)){
                    valido = false;
                    System.out.println("Este sala ya existe");
                }
                else {
                    salas[cont].nombre = nombre;
                }
            }
        }

    }
}