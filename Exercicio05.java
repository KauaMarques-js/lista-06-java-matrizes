// Kauã Marques Almeida
public class Exercicio05 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln());
            }
        }

        System.out.print("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" " + matriz[i][i]);
        }
        System.out.println();
    }
}
