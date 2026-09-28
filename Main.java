public class Main {
    public static void main(String[] args) {

        // 1. Variables
        double nombre1 = 15.0;
        double nombre2 = 4.0;

        // 2. Opérations
        System.out.printf("Addition : %.2f%n", nombre1 + nombre2);
        System.out.printf("Soustraction : %.2f%n", nombre1 - nombre2);
        System.out.printf("Multiplication : %.2f%n", nombre1 * nombre2);
        System.out.printf("Division : %.2f%n", nombre1 / nombre2);
        System.out.printf("Modulo : %.2f%n", nombre1 % nombre2);

        // 3. Précédence
        double resultat1 = nombre1 + nombre2 * 2;
        double resultat2 = (nombre1 + nombre2) * 2;

        System.out.printf("Résultat 1 : %.2f%n", resultat1);
        System.out.printf("Résultat 2 : %.2f%n", resultat2);

        // 4. Incrémentation
        int a = 10;

        System.out.println(a++);
        System.out.println(a);

        System.out.println(++a);
        System.out.println(a);
    }
}
