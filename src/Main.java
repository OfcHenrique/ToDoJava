import java.util.Scanner;
import java.util.ArrayList;
void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> tarefas = new ArrayList<>();

    int opcao = 0;
    while (opcao != 3) {

        System.out.println("1 - Adicionar Tarefa: ");
        System.out.println("2 - Listar Tarefa: ");
        System.out.println("3 - Sair: ");

        opcao = sc.nextInt();

        if ( opcao == 1 ) {
            sc.nextLine();
            System.out.println("Digite o nome da Tarefa: ");
            String nomeTarefa = sc.nextLine();
            tarefas.add(nomeTarefa);

        } else if ( opcao == 2 ) {
            for (String tarefa : tarefas) {
                System.out.println("- " + tarefa);
            }
        }else if ( opcao == 3 ) {
            System.out.println("Sair: ");

        } else {
        System.out.println("Opção inválida!");
    }
    }
}