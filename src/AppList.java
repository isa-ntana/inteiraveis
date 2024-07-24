import java.util.List;
import java.util.Scanner;

public class AppList {
    public static void main(String[] args) {
        //Faça um programa que pegue um nome aleatorio dentro de uma lista

        String sorteado = scanner("Digite o 1 nome: ").next();
        String sorteado2 = scanner("Digite o 2 nome: ").next();
        String sorteado3 = scanner("Digite o 3 nome: ").next();

        List<String> nome = List.of(sorteado, sorteado2, sorteado3);

        String sorteio = nome.get((int)(Math.random()*nome.size()));
        System.out.println("O sorteado foi: "+sorteio);
    }

    public static Scanner scanner (String message){
        System.out.print(message);
        return new Scanner(System.in);
    }
}
