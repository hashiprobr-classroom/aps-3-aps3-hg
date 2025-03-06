import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PassageiroTest {

    @Test
    public void constroi() {
        Passageiro passageiro = new Passageiro("12345678900", "João");
        assertEquals("12345678900", passageiro.getCpf());
        assertEquals("João", passageiro.getNome());
    }

    @Test
    public void mudaNome() {
        Passageiro passageiro = new Passageiro("12345678900", "João");
        passageiro.setNome("Carlos");
        assertEquals("Carlos", passageiro.getNome());
    }

    @Test
    public void avalia() {
        Passageiro passageiro = new Passageiro("12345678900", "João");
        Corrida corrida = new Corrida(passageiro);
        passageiro.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaMotorista());
    }

    @Test
    public void avaliaBaixo() {
        Passageiro passageiro = new Passageiro("12345678900", "João");
        Corrida corrida = new Corrida(passageiro);
        passageiro.avalia(corrida, 0);
        assertEquals(1, corrida.getNotaMotorista());
    }

    @Test
    public void avaliaAlto() {
        Passageiro passageiro = new Passageiro("12345678900", "João");
        Corrida corrida = new Corrida(passageiro);
        passageiro.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaMotorista());
    }
}
