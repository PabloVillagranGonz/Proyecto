import java.awt.*;
import java.util.Scanner;

public class MenuGeneral extends MenuAdmin {
    Scanner in=new Scanner(System.in);
        String codigo;
        String nombDepart;
        String resp;
        int opcionAdmin=0;
        int opcionDepart=0;
        int contrasena = 13245;
        int adminContr;

    public void escribir() {
            do {
                System.out.println(
                            "--------MENU------\n" +
                                    "1. Login de administrador\n" +
                                    "2. Login de departamento\n" +
                                    "3. Cerrar"
                    );
                    System.out.println("Elige la opción deseada");
                    resp = in.nextLine();
                do {
                    if (resp.equalsIgnoreCase("1")) {
                        System.out.println("Escribe la contraseña (Solo sirven numeros)");
                        adminContr = Integer.parseInt(in.nextLine());
                        if (adminContr == contrasena) {
                            System.out.println("1. Listar departamentos\n"+
                                    "2. Añadir departamentos\n"+
                                    "3. Eliminar departamentos\n"+
                                    "4. Listar salas\n"+
                                    "5. Añadir salas\n"+
                                    "6. Eliminar salas\n"+
                                    "7. Listar todas las reservas\n"+
                                    "8. Cerrar sesion (vuelta al menu inicio)");
                            opcionAdmin = Integer.parseInt(in.nextLine());
                        } else {
                            System.out.println("Con esa contraseña no se puede acceder");
                        }
                    }
                    else if (resp.equalsIgnoreCase("2")) {
                        do {
                            System.out.println("Escribe el departamento que eres (Maximo 3 letras)");
                            nombDepart = in.nextLine();
                            if (nombDepart.length() == 3) {
                                System.out.println("1. Añadir reserva\n"+
                                        "2. Cancelar reserva\n"+
                                        "3. Listar todas las reserva\n"+
                                        "4. Cerrar sesion");
                                opcionDepart = Integer.parseInt(in.nextLine());
                            }

                            else {
                                System.out.println("No estas escribiendo bien el departamento");
                            }
                        } while (opcionDepart != 4);
                    }
                } while (opcionAdmin != 8);
            } while (resp.equalsIgnoreCase("3"));
        in.close();

    }
}