package bibliotech.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class LivroTest {
    
    @Test
    public void testValidarDadosSucesso() {
        Livro livro = new Livro();
        livro.setTitulo("Java para Iniciantes");
        livro.setAutor("Herbert Schildt");
        
        // Esperamos que o resultado seja VERDADEIRO (true)
        assertTrue(livro.validarDados());
    }

    @Test
    public void testValidarDadosFalha() {
        Livro livro = new Livro();
        livro.setTitulo(""); // Título vazio
        livro.setAutor("Autor Qualquer");
        
        // Esperamos que o resultado seja FALSO (false)
        assertFalse(livro.validarDados());
    }
}