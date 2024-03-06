public class MenuAdmin {
    public Departamento[] departamentos;
    public Sala[] salas;
    public int cont = 0;

    public void listarDepartamento(){
        for (int i = 0; i < cont; i++) {
            System.out.println("-"+departamentos[i]);
        }
    }
    public void añadirDepartamento(String nombre, String codigo){
        boolean valido = true;
        for (int i = 0; i < cont; i++) {
            if (this.departamentos[i].nombre.equalsIgnoreCase(nombre)){
                valido = false;
                System.out.println("Este nombre ya existe");
            }
            else {
                this.departamentos[cont].nombre = nombre;
            }
        }
        if (codigo.length() < 3 || codigo.length() > 3){
            valido = false;
        }
        else {
            this.departamentos[cont].codigo = nombre;
        }
        cont++;
    }
}
