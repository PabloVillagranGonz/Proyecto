import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Reservas {
    Scanner in = new Scanner(System.in);
    public ArrayList<Reservas> reservas = new ArrayList<>();

    String nombSala;
    String fecha = new String();
    String hora = new String();


        public void listarReservas() {
            Iterator<Reservas> iterador = this.reservas.iterator();

            while (iterador.hasNext()) {
                Reservas reservas = iterador.next();
                System.out.println("Sala: " + reservas.nombSala + ", hora: " + reservas.hora + ", fecha: " + reservas.fecha);
            }
        }
        public void anadirReserva () {

            System.out.println("Escribe fecha, hora de la reserva y la sala");
            System.out.println("Fecha (año,mes,dia)");
            fecha = in.nextLine();
            StringTokenizer fechatoken = new StringTokenizer(fecha, ",");
            LocalDate fecha2 = LocalDate.of(Integer.parseInt(fechatoken.nextToken()),
                    Integer.parseInt(fechatoken.nextToken()),
                    Integer.parseInt(fechatoken.nextToken()));
            System.out.println("Hora (hora:minuto)");
            hora = in.nextLine();
            StringTokenizer horatoken = new StringTokenizer(hora, ":");
            LocalTime hora2 = LocalTime.of(Integer.parseInt(horatoken.nextToken()),
                    Integer.parseInt(horatoken.nextToken()));
            System.out.println("Escribe la sala deseada");
            nombSala = in.nextLine();
        }
    public void eliminarReserva() {
        Iterator <Reservas> iterator = this.reservas.iterator();

        while (iterator.hasNext()) {
            Reservas reservas = iterator.next();

            if (reservas.nombSala.equalsIgnoreCase(nombSala)) {
                iterator.remove();
                System.out.println("Reserva eliminada con éxito.");
                return; // Termina el método después de eliminar la reserva
            }
        }

        System.out.println("No se encontró ningúna reserva con el código especificado.");
    }
}

