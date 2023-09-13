public class For {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando Carneirinhos: " + carneirinhos);
        }

        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //For Each
        for (String aluno : alunos) {
            System.out.println("Nome do Aluno: " + aluno);
        }

        //Break/ Continue
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;
                //Se fosse utilizado o continue, o numero 3 não seria impresso, mas o código não pararia de funcionar.

            System.out.println(numero);
        }
    }
}
