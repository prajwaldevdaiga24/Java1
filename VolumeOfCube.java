import java.util.Scanner;

public class VolumeOfCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();

        double volume = Math.pow(side, 3);
        System.out.println("Volume of the cube: " + volume);
    }
}