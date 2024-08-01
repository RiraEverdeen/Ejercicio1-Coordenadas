/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Coordenadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir coordenadas polares a cartesianas");
            System.out.println("2. Convertir coordenadas cartesianas a polares");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Convertir coordenadas polares a cartesianas
                    System.out.print("Ingrese el radio (r): ");
                    double r = scanner.nextDouble();
                    System.out.print("Ingrese el ángulo (theta) en grados: ");
                    double thetaGrados = scanner.nextDouble();
                    double[] cartesianas = convertirAPolares(r, thetaGrados);
                    System.out.println("Coordenadas cartesianas:");
                    System.out.println("x: " + cartesianas[0] + ", y: " + cartesianas[1]);
                    break;
                case 2:
                    // Convertir coordenadas cartesianas a polares
                    System.out.print("Ingrese la coordenada x: ");
                    double x = scanner.nextDouble();
                    System.out.print("Ingrese la coordenada y: ");
                    double y = scanner.nextDouble();
                    double[] polares = convertirAPolares(x, y);
                    System.out.println("Coordenadas polares:");
                    System.out.println("r: " + polares[0] + ", theta: " + polares[1] + " grados");
                    break;
                case 3:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static double[] convertirACartesianas(double r, double thetaGrados) {
        double thetaRadianes = Math.toRadians(thetaGrados);
        double x = r * Math.cos(thetaRadianes);
        double y = r * Math.sin(thetaRadianes);
        return new double[]{x, y};
    }

    public static double[] convertirAPolares(double x, double y) {
        double r = Math.sqrt(x * x + y * y);
        double thetaRadianes = Math.atan2(y, x);
        double thetaGrados = Math.toDegrees(thetaRadianes);
        return new double[]{r, thetaGrados};
    }
}
