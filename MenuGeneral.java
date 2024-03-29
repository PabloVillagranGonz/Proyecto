import java.awt.*;
import java.util.Scanner;

public class MenuGeneral extends MenuAdmin {
    Scanner in = new Scanner(System.in);
    Reservas reservas = new Reservas();
    int contrasena = 12345;
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
            resp = Integer.parseInt(in.nextLine());

                if (resp == 1) {
                    System.out.println("Escribe la contraseña (Solo sirven numeros)");
                    adminContr = Integer.parseInt(in.nextLine());
                    do {
                    if (adminContr == contrasena) {
                        System.out.println("1. Listar departamentos\n" +
                                "2. Añadir departamentos\n" +
                                "3. Eliminar departamentos\n" +
                                "4. Listar salas\n" +
                                "5. Añadir salas\n" +
                                "6. Eliminar salas\n" +
                                "7. Listar todas las reservas\n" +
                                "8. Cerrar sesion (vuelta al menu inicio)");
                        opcionAdmin = Integer.parseInt(in.nextLine());
                        if (opcionAdmin == 1) {
                            listarDep();
                        } else if (opcionAdmin == 2) {
                            System.out.println("Escribe el nombre de departamento");
                            nombDepart = in.nextLine();
                            System.out.println("Escribe el codigo (MAX 3 LETRAS)");
                            codigoDepart = in.nextLine();
                            anadirDepartamento(nombDepart, codigoDepart);
                        } else if (opcionAdmin == 3) {
                            System.out.println("Escribe el codigo del departamento que deseas eliminar");
                            codigoDepart = in.nextLine();
                            eliminarDep(codigoDepart);
                        } else if (opcionAdmin == 4) {
                            listarSalas();
                        } else if (opcionAdmin == 5) {
                            System.out.println("Escribe el nombre de la sala");
                            nombSala = in.nextLine();
                            System.out.println("Escribe el codigo de la sala (MAX 3 LETRAS)");
                            codigoSala = in.nextLine();
                            anadirSala(nombSala, codigoSala);
                        } else if (opcionAdmin == 6) {
                            System.out.println("Escribe el codigo de la sala que deseas eliminar");
                            codigoSala = in.nextLine();
                            eliminarSalas(codigoSala);
                        } else if (opcionAdmin == 7) {
                            listarSalas();
                            listarDep();
                        }
                    } else {
                        System.out.println("Con esa contraseña no se puede acceder");
                    }

                } while (opcionAdmin != 8) ;
            } if (resp == 2) {
                do {
                    System.out.println("Escribe el departamento que eres (Maximo 3 letras)");
                    nombDepart = in.nextLine();
                    if (nombDepart.length() == 3) {
                        System.out.println("1. Añadir reserva\n" +
                                "2. Cancelar reserva\n" +
                                "3. Listar todas las reserva\n" +
                                "4. Cerrar sesion");
                        opcionDepart = Integer.parseInt(in.nextLine());
                        if (opcionDepart == 1){
                            reservas.anadirReserva();
                        } else if (opcionDepart == 2){
                            reservas.eliminarReserva();
                        } else if (opcionDepart == 3){
                            reservas.listarReservas();
                        }
                    } else {
                        System.out.println("No estas escribiendo bien el departamento");
                    }
                } while (opcionDepart != 4);
            }
        } while (resp != 3);
        in.close();
    }

}