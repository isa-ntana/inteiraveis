import java.util.Arrays;

public class exercicio {
    public static void main(String[] args) {
        // A matriz abaixo representa um grupo de alunos que foram reprovados e aprovados na escola.
        // cada linha/indice repsenta um aluno, para decidir quais alunos vão passar de ano é necessario que
        // ele tenha pelo menos 50% de Aprovação (V) entre as 5 materias;
        // Faça um programa que mostre os nomes de cada um dos alunos aprovados e reprovados.
        // Os indices de cada nome corresponde ao indice de cada linha da matriz

        String[] nome = {"João", "Ines Brasil", "Zaca", "Munha"};
        String[][] aprovados = {
                {"V", "F", "V", "F", "V"}, //aprovado
                {"V", "F", "F", "F", "V"}, //reprovado
                {"F", "F", "F", "V", "F"}, //reprovado
                {"F", "V", "V", "F", "V"}  //aprovado
        };
/*     lógica viny

        for (int i = 0; i < nome.length; i++) { // nomes e notas dos alunos
            int cont = 0;
            String nomes = nome[i];
            String[] notasEspecificas = aprovados[i];
            System.out.println("As notas do "+nomes+" são: "+notasEspecificas[0]+" "+notasEspecificas[1]
                    + " "+notasEspecificas[2]+" "+notasEspecificas[3]+" "+notasEspecificas[4]);

            for (int j = 0; j < notasEspecificas.length; j++) {
                //repetirá o primeiro para fazer looping com adicionando +1 no contador
                if (notasEspecificas[i] == "V") {
                    cont++;
                }
            }

            if(cont * 100 / 5 >= 50){ //fará o calculo se ele acertou 50% das matérias
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }
        }

 */

        for (int i = 0; i < aprovados.length; i++) {
            int notas = 0; //variavel para guardar as notas dos alunos

            //verificação de quantos "V" cada um tem, se tiver "V", vai armazenar o valor em notas
            for (int j = 0; j < aprovados[i].length; j++) {
                if (aprovados[i][j] == "V") {
                    notas++;
                }
            }

            //se o aluno tiver 50% ou mais, ele é aprovado
            if (notas * 100 / 5 >= 50) {
                System.out.println(nome[i] + " - Aprovado");
            } else {
                System.out.println(nome[i] + " - Reprovado");
            }
        }


    }
}
