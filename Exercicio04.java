// Kauã Marques Almeida
public class Exercicio04 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln());
            }
        }

        int quantidadePares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    quantidadePares++;
                }
            }
        }
        System.out.println("Quantidade de pares: " + quantidadePares);
    }
}
