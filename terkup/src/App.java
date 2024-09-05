import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Kúp Térfogata:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sugár: ");
        String radiusStr = scanner.nextLine();
        Double radius = Double.parseDouble(radiusStr);  //konvertálás

        System.out.print("Magasság: ");
        String heightStr = scanner.nextLine();
        Double height = Double.parseDouble(heightStr);

        
        
        scanner.close();

        Double volume = 1.0/3.0 * Math.pow(radius, 2) * Math.PI * height;
        
        System.out.println("Térfogat: " + volume);
    }
}
