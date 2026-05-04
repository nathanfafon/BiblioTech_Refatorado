package bibliotech.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotech", "root", "root");
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}