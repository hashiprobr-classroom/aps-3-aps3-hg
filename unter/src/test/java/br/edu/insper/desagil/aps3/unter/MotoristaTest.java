import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MotoristaTest {

    @Test
    void constroi() {
        Motorista motorista = new Motorista("12345678900", "Carlos");
        assertEquals("12345678900", motorista.getCpf());
        assertEquals("Carlos", motorista.getNome());
    }

    @Test
    void mudaNome() {
        Motorista motorista = new Motorista("12345678900", "Carlos");
        motorista.setNome("Roberto"); // Supondo que haja um setNome() na classe Motorista
        assertEquals("Roberto", motorista.getNome());
    }

    @Test
    void avalia() {
        Motorista motorista = new Motorista("12345678900", "Carlos");
        Passageiro passageiro = new Passageiro("98765432100", "Ana");
        Corrida corrida = new Corrida(motorista, passageiro);

        motorista.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo() {
        Motorista motorista = new Motorista("12345678900", "Carlos");
        Passageiro passageiro = new Passageiro("98765432100", "Ana");
        Corrida corrida = new Corrida(motorista, passageiro);

        motorista.avalia(corrida, 1);
        assertEquals(1, corrida.getNotaPassageiro());
    }

    @Test
    void avaliaAlto() {
        Motorista motorista = new Motorista("12345678900", "Carlos");
        Passageiro passageiro = new Passageiro("98765432100", "Ana");
        Corrida corrida = new Corrida(motorista, passageiro);

        motorista.avalia(corrida, 5);
        assertEquals(5, corrida.getNotaPassageiro());
    }
}
