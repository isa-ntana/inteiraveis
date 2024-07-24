import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppList2 {
    public static void main(String[] args) {
        //Melhoria do programa, permita que o usuario digite os nomes a serem sorteados
        List<String> nomes = new ArrayList<String>();
        boolean execute = true;

        while(execute) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um nome: ");
            String nome = scanner.next();
            //next pega apenas a primeira palavra, só nextLine que pega o que tiver separado
            nomes.add(nome);

            System.out.println("Digite 1 para sair e 2 para continuar: ");
            int opcao = scanner.nextInt();

            if(opcao == 1) execute = false;
        }

        String sorteio = nomes.get((int)(Math.random()*nomes.size()));
        System.out.println(sorteio);
    }
}
