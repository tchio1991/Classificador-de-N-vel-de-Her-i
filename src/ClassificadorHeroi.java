import java.util.Scanner;

public class ClassificadorHeroi {
    public static void main(String[] args) {
        // Criando o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados: nome e quantidade de XP
        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a quantidade de XP do herói: ");
        int xp = scanner.nextInt();
        
        // Definir o nível com base na quantidade de XP
        String nivel = "";

        if (xp < 1000) {
            nivel = "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            nivel = "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            nivel = "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            nivel = "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            nivel = "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            nivel = "Imortal";
        } else if (xp > 10000) {
            nivel = "Radiante";
        }

        // Exibindo o resultado
        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);

        // Fechar o scanner
        scanner.close();
    }
}