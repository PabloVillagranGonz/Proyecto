import java.util.Scanner;
public class Proyecto {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int resp=0;
        boolean salir=false;

        do{
            try {
                System.out.println(
                                "1. Login de administrador\n" +
                                "2. Login de departamento"
                );
                System.out.println("Elige la opción deseada");
                resp = Integer.parseInt(in.nextLine());
                salir = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Número no válido, pulse intro para continuar");
                in.nextLine();
            }
        }
        while(!salir);
        in.close();
    }
}
