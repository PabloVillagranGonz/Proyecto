import java.awt.*;
import java.util.Scanner;
public class Proyecto extends MenuGeneral{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        MenuGeneral menu= new MenuGeneral();

        menu.escribir();

        in.close();
    }
}
