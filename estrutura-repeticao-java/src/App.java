public class App {
    public static void main(String[] args) throws Exception {
        //Laços de repetição, támbem conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iterações de código, ou seja, que comandos presente no blocio sejam repetidos diversas vezes.

        //Tipos de laços: For (para), While (enquanto), Do While (faça enquanto).

        //For: permite que uma variavel contadora seja testada e incrementada a cada iteração, sendo definida na chamada do comando

        /*
         * for (bloco de inicialização; expressão booleana de validação; bloco de incrementação) {
         *      comando que será executado até que a expressão de validação se torne falsa
         * }
         */

         //O Laço For tambem pode ser utilizado com Arrays, onde o bloco de inicialização se tornará um index para a posição dos dados dentro de um array

         //Quando estamos falando de laços de repetição com Arrays, temos como boa pratica o uso do For Each, uma forma abreviada de utilização do For

         //Quando usamos o For, temos que ter em mente que tambem existem dois comandos não muito comuns que podem ser utilizados, o Break e o Continue, onde o Break interrompe o laço e o Continue nos permite continuar de um determinado ponto como visto em Switch

         //While: determina que enquanto uma condição for válida, o bloco de codigo será executado, ele testa a condição antes de executado o código, ou seja, caso a condição seja inválida, ele não executa o bloco.

         /*
          * while (expressão booleana de validação) {
                comando que será executado até que a expressão de validação torne-se falsa
          }
          */

          //Do While: Assim como o While, considera que enquanto uma determinada condição for valida, o bloco de codigo sera executado, entretanto, ele testa a condição após a execução do código, ou seja, o codigo sempre será feito pelo menos uma vez

          /*
           do {
                //comando que será executado até que a expressão de validação seja falsa
           }
           while (expressão booleana de validação);
           */
          for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }
    }
}
