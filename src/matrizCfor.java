public class matrizCfor {
    public static void main(String[] args) {
        double [][] receita = {
                {100.00, 2000.00, 300.00},
                {237.84, 4558.72, 374.23},
                {555.23, 6534.20, 765.23}
        };

        for (int i = 0; i < receita.length; i++) {
            double resultado = 0;
            for (int j = 0; j < receita.length; j++) {
                resultado = resultado + receita[i][j];
            }
            System.out.println("O valor total de: " + i + " é " + resultado);
        }
    }
}
