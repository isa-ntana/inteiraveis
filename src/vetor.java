public class vetor {
    public static void main(String[] args) {
        //versão complicada


        // Faça um vetor de duas dimensões com 3 posições relacionando o faturamento de uma empresa.
        // o ultimo index de cada posição corresponde ao faturamento de cada trimestre
        // 1) faça um programa que calcule o total do faturamento do ano todo.
        // 2) faça um programa que calcule o total do faturamento do meio de cada trimestre
        // 3) faça um programa que calcule o total do faturamento do inicio do ultimo trimestre, medio do segundo e final do primeiro.

        // exemplo da matriz
        //    |0      |1      |2     |
        // |0| 100,00 |237,84 |555,23|
        // |1| 2000,00|4558,72|6534,2|
        // |2| 300,00 |374,23 |765,23|

        Double[][] matrizFaturamento = new Double[3][3];
        matrizFaturamento[0][0] = 100.00;  matrizFaturamento[0][1] = 237.4;   matrizFaturamento[0][2] = 555.23;
        matrizFaturamento[1][0] = 2000.00; matrizFaturamento[1][1] = 4558.72; matrizFaturamento[1][2] = 6534.2;
        matrizFaturamento[2][0] = 300.00;  matrizFaturamento[2][1] = 374.23;  matrizFaturamento[2][2] = 765.23;

        //faturamento anual
        Double totalAno = matrizFaturamento[0][0]+matrizFaturamento[0][1]+matrizFaturamento[0][2]+matrizFaturamento[1][0]+matrizFaturamento[1][1]+matrizFaturamento[1][2]+matrizFaturamento[2][0]+matrizFaturamento[2][1]+matrizFaturamento[2][2];
        System.out.println("Total faturado no ano: " + totalAno);

        //total do mes 2 de cada trimestre
        Double PrimeiroMeioTrimestre = matrizFaturamento[0][0]+matrizFaturamento[0][1]+matrizFaturamento[0][2];
        System.out.println("Total faturado no 2 mês de cada trimestre: " + PrimeiroMeioTrimestre);

        Double totalMeioTrimestre = matrizFaturamento[1][0]+matrizFaturamento[1][1]+matrizFaturamento[1][2];
        System.out.println("Total faturado no 2 mês de cada trimestre: " + totalMeioTrimestre);

        Double terceiroMeioTrimestre = matrizFaturamento[2][0]+matrizFaturamento[2][1]+matrizFaturamento[2][2];
        System.out.println("Total faturado no 2 mês de cada trimestre: " + terceiroMeioTrimestre);

        //total por trimestre
        Double totalPrimeiroTrimestre = matrizFaturamento[0][0]+matrizFaturamento[1][0]+matrizFaturamento[2][0];
        System.out.println("Total do primeiro trimestre: " + totalPrimeiroTrimestre);

        Double totalSegundoTrimestre = matrizFaturamento[0][1]+matrizFaturamento[1][1]+matrizFaturamento[2][1];
        System.out.println("Total do primeiro trimestre: " + totalSegundoTrimestre);

        Double totalTerceiroTrimestre = matrizFaturamento[0][2]+matrizFaturamento[1][2]+matrizFaturamento[2][2];
        System.out.println("Total do primeiro trimestre: " + totalTerceiroTrimestre);
    }
}
