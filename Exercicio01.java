// Kauã Marques Almeida
public class Exercicio01 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln());
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
