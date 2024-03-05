public class MenuAdmin {
    public Departamento[] departamentos;
    public int cont = 0;
    public void añadirDepartamento(Departamento dep){
        this.departamentos[cont] = dep;
        cont++;
    }
    public void listarDepartamento(){
        for (int i = 0; i < cont; i++) {
            System.out.println(departamentos[i]);
        }
    }
}
