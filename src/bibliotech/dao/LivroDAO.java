package bibliotech.dao;
import bibliotech.model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class LivroDAO {
    public void salvar(Livro livro) { // Recebe o objeto completo
        String sql = "INSERT INTO livro (titulo, autor, editora) VALUES (?, ?, ?)";
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getEditora());
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}