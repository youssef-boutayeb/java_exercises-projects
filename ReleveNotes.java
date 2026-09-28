import java.util.Scanner;

public class ReleveNotes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] modules = new String[6][6];
        double[][] notes = new double[6][6];
        double[] moyennesSemestres = new double[6];
        double[] moyennesAnnees = new double[3];



        for (int semestre = 0; semestre < 6; semestre++) {

            System.out.println("\n===== SEMESTRE " + (semestre + 1) + " =====");

            for (int module = 0; module < 6; module++) {

                System.out.print("Nom du module " + (module + 1) + " : ");
                modules[semestre][module] = scanner.nextLine();

                System.out.print("Note de " + modules[semestre][module] + " : ");
                notes[semestre][module] = scanner.nextDouble();

                scanner.nextLine();
            }
        }

        for (int semestre = 0; semestre < 6; semestre++) {

            double somme = 0;

            for (int module = 0; module < 6; module++) {
                somme = somme + notes[semestre][module];
            }

            moyennesSemestres[semestre] = somme / 6;
        }


        for (int annee = 0; annee < 3; annee++) {

            moyennesAnnees[annee] =
                    (moyennesSemestres[annee * 2]
                            + moyennesSemestres[annee * 2 + 1]) / 2;
        }


        double sommeGenerale = 0;

        for (int annee = 0; annee < 3; annee++) {
            sommeGenerale = sommeGenerale + moyennesAnnees[annee];
        }

        double moyenneGenerale = sommeGenerale / 3;



        System.out.println("           RELEVE DE NOTES");
        System.out.println("========================================");

        for (int semestre = 0; semestre < 6; semestre++) {

            System.out.println("\n--- SEMESTRE " + (semestre + 1) + " ---");

            for (int module = 0; module < 6; module++) {

                System.out.println(
                        modules[semestre][module]
                                + " : "
                                + notes[semestre][module]
                );
            }

            System.out.println(
                    "Moyenne du semestre : "
                            + moyennesSemestres[semestre]
            );
        }


        System.out.println("           MOYENNES ANNUELLES");
        System.out.println("========================================");

        for (int annee = 0; annee < 3; annee++) {

            System.out.println(
                    "Moyenne Année " + (annee + 1)
                            + " : "
                            + moyennesAnnees[annee]
            );
        }


        System.out.println("Moyenne generale du dilome : "
                + moyenneGenerale);
        System.out.println("========================================");

        scanner.close();
    }
}