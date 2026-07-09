import java.util.Scanner;

void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int opcao = 0;
    while (opcao != 3) {

        System.out.println("1 - Adicionar Tarefa: ");
        System.out.println("2 - Listar Tarefa: ");
        System.out.println("3 - Sair: ");

        opcao = sc.nextInt();

        if ( opcao == 1 ) {
            System.out.println("Adicionar Tarefa: ");

        } else if ( opcao == 2 ) {
            System.out.println("Listar Tarefa: ");

        }else if ( opcao == 3 ) {
            System.out.println("Sair: ");

        } else {
        System.out.println("Opção inválida!");
    }
    }
}