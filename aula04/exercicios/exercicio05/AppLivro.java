package exercicios.exercicio05;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Programando em Java", "Deitel", 450);

        livro.mostrarCapa();

        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        System.out.println("Pagina atual: " + livro.exibirPagina());

        livro.retrocederPagina();
        System.out.println("Pagina atual: " + livro.exibirPagina());
        
        livro.irParaPagina( 50 );
        System.out.println("Pagina atual: " + livro.exibirPagina());  
    }
}
