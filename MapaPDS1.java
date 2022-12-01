import java.text.DecimalFormat;
import java.util.Scanner;

public class MapaPDS1{

    private static Scanner entrada;
    public static void main(String[] args) {
        String nome, sexo, matricula;
        double nota1, nota2, nota3, media, media2, presenca;

        entrada = new Scanner(System.in);
        try {
            System.out.println("------------------------------");
            System.out.println("DIGITE AS INFORMAÇÕES DO ALUNO");
            System.out.println("------------------------------");

            System.out.print("Nome completo: ");
            nome = entrada.nextLine();

            System.out.print("Sexo: ");
            sexo = entrada.nextLine();

            System.out.print("Matrícula (Apenas números): ");
            matricula = entrada.nextLine();

            System.out.print("Presença: ");
            presenca = lerNumerico();

            System.out.println("====Utilizar PONTO para notas 'QUEBRADAS'===");

            System.out.print("Nota 1 (0 a 10): ");
            nota1 = lerNumerico();

            System.out.print("Nota 2 (0 a 10): ");
            nota2 = lerNumerico();

            System.out.print("Nota 3 (0 a 10): ");
            nota3 = lerNumerico();

            media = (nota1 + nota2 + nota3) / 3;
            media2 = (presenca / 60) * 100;
            int media2i = (int)media2;

            System.out.println("--------------");
            System.out.println("SITUAÇÃO FINAL");
            System.out.println("--------------");

            System.out.println("Matrícula nº: " + matricula);
            System.out.println("Aluno(a): " + nome.toUpperCase() + "\nSexo: " + sexo.substring(0, 1).toUpperCase());
            System.out.println("Presença: "+ media2i+"%");
            DecimalFormat format = new DecimalFormat("0.#");

            if (media >= 6) {

                System.out.println("Status: APROVADO(A)");
                System.out.print("Parabéns, sua média final foi: ");
                System.out.println(format.format(media));
            } else {
                System.out.println("Status: REPROVADO(A)");
                System.out.print("Infelizmente, sua média final foi: ");
                System.out.println(format.format(media));
            }
        } catch (NumberFormatException ex) {
            System.out.println("O valor digitado não é um número válido!");
        }
    }

    private static double lerNumerico() {
        String digitado = "";

        digitado = entrada.nextLine();

        return Double.parseDouble(digitado);
    }
}