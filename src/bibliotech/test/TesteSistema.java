package bibliotech.test;
import bibliotech.model.Livro;
import bibliotech.dao.LivroDAO;

public class TesteSistema {
    public static void main(String[] args) {
        // Criando o objeto livro (Regra de Negócio)
        Livro novoLivro = new Livro();
        novoLivro.setTitulo("Refatoração na Prática");
        novoLivro.setAutor("Martin Fowler");
        novoLivro.setEditora("Novatec");

        // Salvando via DAO
        LivroDAO dao = new LivroDAO();
        dao.salvar(novoLivro);

        System.out.println("Teste finalizado! Verifique o banco de dados.");
    }
}