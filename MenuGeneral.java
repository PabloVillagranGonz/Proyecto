import java.util.Scanner;

public class MenuGeneral {
    Scanner in=new Scanner(System.in);
        int resp=0;
        int opcionAdmin=0;
        int opcionDepart=0;
        int contrasena = 13245;
        int adminContr;
        String nombDepart;

    public void escribir() {
            do {
                try {
                    System.out.println(
                            "--------MENU------\n" +
                                    "1. Login de administrador\n" +
                                    "2. Login de departamento\n" +
                                    "3. Cerrar"
                    );
                    System.out.println("Elige la opción deseada");
                    resp = Integer.parseInt(in.nextLine());

                } catch (NumberFormatException e) {
                    System.out.println("Número no válido, pulse intro para continuar");
                    in.nextLine();
                }
                do {
                    if (resp == 1) {
                        System.out.println("Escribe la contraseña (Solo sirven numeros)");
                        adminContr = Integer.parseInt(in.nextLine());
                        if (adminContr == contrasena) {
                            System.out.println("1. Listar departamentos");
                            System.out.println("2. Añadir departamentos");

                            System.out.println("3. Eliminar departamentos");
                            System.out.println("4. Listar salas");
                            System.out.println("5. Añadir salas");
                            System.out.println("6. Eliminar salas");
                            System.out.println("7. Listar todas las reservas");
                            System.out.println("8. Cerrar sesion (vuelta al menu inicio)");
                            opcionAdmin = Integer.parseInt(in.nextLine());
                        } else {
                            System.out.println("Con esa contraseña no se puede acceder");
                        }
                    } else if (resp == 2) {
                        do {
                            System.out.println("Escribe el departamento que eres (Maximo 3 letras)");
                            nombDepart = in.nextLine();
                            if (nombDepart.length() == 3) {
                                System.out.println("1. Añadir reserva");
                                System.out.println("2. Cancelar reserva");
                                System.out.println("3. Listar todas las reserva");
                                System.out.println("4. Cerrar sesion");
                                opcionDepart = Integer.parseInt(in.nextLine());
                            } else {
                                System.out.println("No estas escribiendo bien el departamento");
                            }
                        } while (opcionDepart != 4);
                    }
                } while (opcionAdmin != 8);
            }
            while (resp != 3);
        in.close();

    }
}