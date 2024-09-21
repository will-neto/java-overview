package my.javaoverview.poo.strings;

public class StringTests {
    public static void main(String[] args) {

        System.out.println("== Strings ==");

        /*
            - A Classe String é um wrapper que trabalha como uma coleção de caracteres

            - Strings trabalham com a "heap" e "pool de strings" dependendo do contexto em que são declarados
                - Heap: dependendo de como uma variável do tipo String é criada, é possível que seja criado um objeto na
                    Heap ou uma referência que aponta para um objeto no Pool de String.
                - Pool de String: área reservada dentro da Heap para inclusão de objetos do tipo String que contém textos
                    que podem ser reutilizados por outras variáveis que forem criadas

                - Quando é criado um objeto na Heap:
                    - Operador "new": ao utilizar o new -> "String variavel = new String("Texto") <- para a criação de uma
                        variável do tipo String, é criado um objeto na Heap que contém o valor "Texto". Não é gerado o
                        texto no pool de string
                    - Concatenação: usar concatenação, mesmo em uma variável já criada a partir de string literal (sem uso
                        do operador "new"), sempre irá criar um novo objeto na Heap que irá conter o valor do texto.

                - Quando é criado um objeto no Pool de String:
                    - String Literal: quando uma variável String é criada sem utilizar o operador "new"
                        -> "String variavel = "texto" <-, um objeto do tipo String é criado no Pool de Strings com o valor "texto"
                            e na Heap é criada uma referência ao objeto no pool de string
                    - Método intern(): o uso do método intern() em um objeto do tipo String irá referenciar o objeto no
                        pool de string que contém o mesmo valor, caso já exista. Se não existir, ele criará um novo objeto
                        no String Pool e a variável irá apontar para esse novo objeto.

                   ** Se uma variável criada a partir de string literal receber um valor que já existe no pool de strings,
                        será utilizada a mesma referência já existente na Heap. Deste modo, nada será criado (apenas a variável)**
        */

        // Cria um objeto no pool de strings com o valor "Maçã" e uma referência na heap que aponta para esse objeto.
        String maca = "Maçã";
        // Verifica se "Maçã" já existe no pool de strings e utiliza a referência já existente, sem criar um novo objeto na heap.
        String maca2 = "Maçã";

        // Cria um objeto na heap com o valor "Maçã". Não é criado nenhum objeto no pool de strings.
        String maca3 = new String("Maçã");

        // True, pois a referência de ambos os objetos são as mesmas
        System.out.println(maca == maca2);
        // False, pois maca3 é um novo objeto no Heap
        System.out.println(maca == maca3);

        // True, porque maca3.intern() retorna a referência do objeto no pool de strings, que é o mesmo que maca.
        System.out.println(maca == maca3.intern());
        System.out.println(maca.intern() == maca3.intern());

        // A concatenação gerará um novo objeto na heap, e o valor "Maçã Fuji" ficará limitado apenas à heap, não será armazenado no pool de strings.
        maca = maca + " Fuji";

        System.out.println(maca);

    }
}
