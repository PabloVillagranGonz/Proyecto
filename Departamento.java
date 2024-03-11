import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Departamento{
    public String nombre;
    public String codigo;

    public Departamento (String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void anadirReserva(){
        Scanner in = new Scanner(System.in);
        String fecha = new String();
        String hora = new String();
        System.out.println("Escribe fecha y hora de la reserva");
        System.out.println("Fecha (año,mes,dia)");
        fecha = in.nextLine();
        StringTokenizer fechatoken = new StringTokenizer(fecha, ",");
        LocalDate fecha2 = LocalDate.of(Integer.parseInt(fechatoken.nextToken()),
                                        Integer.parseInt(fechatoken.nextToken()),
                                        Integer.parseInt(fechatoken.nextToken()));
        System.out.println("Hora (hora:minuto)");
        hora = in.nextLine();
        StringTokenizer horatoken = new StringTokenizer(hora, ":");
        LocalTime hora2 = LocalTime.of( Integer.parseInt(horatoken.nextToken()),
                                        Integer.parseInt(horatoken.nextToken()));

    }
}
