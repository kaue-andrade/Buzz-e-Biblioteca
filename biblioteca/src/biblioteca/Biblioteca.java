//Algoritmo continuado por Kauê Andrade dos Santos

package biblioteca;

public class Biblioteca {
    public static void main(String[] args) {

        //Os autores dos respectivos livros e suas editoras foram escolhidos pelo professor na aula.

        Autor coelho = new Autor();
        coelho.setCodigo("123456");
        coelho.setNome("Paulo Coelho");
        coelho.setBibliografia("Um autor renomado...");

        Editora ed1 = new Editora();
        ed1.setCodigo("0987654");
        ed1.setNome("Pearson");

        Editora exata = new Editora();
        exata.setCodigo("32795");
        exata.setNome("Editora Exata");

        Livro l1 = new Livro();
        l1.setTitulo("O Alquimista");
        l1.setISBN("asd12345");
        l1.setAutor(coelho);
        l1.setEditora(ed1);

        Livro l2 = new Livro();
        l2.setTitulo("Maktub");
        l2.setISBN("123asdf123");
        l2.setAutor(coelho);
        l2.setEditora(exata);

        //Primeira impressão (Livro #1):
        System.out.println("\nLivro #1\n");
        System.out.println("TÍTULO: " + l1.getTitulo());
        System.out.println("ISBN: " + l1.getISBN());

        /*Primeira forma
        Autor autorRecuperado = l1.getAutor();
        /System.out.println("AUTOR: "autorRecuperado.getNome());*/

        //Segunda forma
        System.out.println("AUTOR: " + l1.getAutor().getNome());

        //Continuem para exibir a editora...

        System.out.println("NOME DA EDITORA: " + ed1.getNome());
        System.out.println("CÓDIGO DA EDITORA: " + ed1.getCodigo());

        //Segunda impressão (Livro #2):
        System.out.println("\nLivro #2\n");
        System.out.println("TÍTULO: " + l2.getTitulo());
        System.out.println("ISBN: " + l2.getISBN());

        //Segunda forma
        System.out.println("AUTOR: " + l2.getAutor().getNome());

        //Continuem para exibir a editora...

        System.out.println("NOME DA EDITORA: " + exata.getNome());
        System.out.println("CÓDIGO DA EDITORA: " + exata.getCodigo());

        ////Exiba tudo novamente com a alteração
        //Primeira impressão (Livro #1) com a alteração:

        System.out.println("\nLivro #1 com alteração\n");
        System.out.println("TÍTULO: " + l1.getTitulo());
        System.out.println("ISBN: " + l1.getISBN());

        //Segunda forma

        coelho.setNome("Coelho, Paulo");
        System.out.println("AUTOR: " + l2.getAutor().getNome());

        //Continuem para exibir a editora...

        System.out.println("NOME DA EDITORA: " + ed1.getNome());
        System.out.println("CÓDIGO DA EDITORA: " + ed1.getCodigo());

        //Alterem o nome do autor para "Coelho, Paulo"

        //Alteração feita na linha 69

        //Segunda impressão (Livro #2) com a alteração:
        System.out.println("\nLivro #2 com alteração\n");
        System.out.println("TÍTULO: " + l2.getTitulo());
        System.out.println("ISBN: " + l2.getISBN());

        //Segunda forma

        coelho.setNome("Coelho, Paulo");
        System.out.println("AUTOR: " + l2.getAutor().getNome());

        System.out.println("NOME DA EDITORA: " + exata.getNome());
        System.out.println("CÓDIGO DA EDITORA: " + exata.getCodigo());
    }
}