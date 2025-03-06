public class CentralTest {
    public static void main(String[] args) {
        testNenhumaAvaliacaoPassageiro();
        testNenhumaAvaliacaoMotorista();
        testAvaliacoesPassageiro();
        testAvaliacoesMotorista();

        System.out.println("Todos os testes foram executados com sucesso.");
    }

    static void testNenhumaAvaliacaoPassageiro() {
        Central central = new Central();
        if (central.mediaPassageiro() != 0) {
            System.out.println("Erro: mediaPassageiro deveria ser 0.");
        }
    }

    static void testNenhumaAvaliacaoMotorista() {
        Central central = new Central();
        if (central.mediaMotorista() != 0) {
            System.out.println("Erro: mediaMotorista deveria ser 0.");
        }
    }

    static void testAvaliacoesPassageiro() {
        Central central = new Central();

        Motorista motorista = new Motorista("11111111111", "Carlos");
        Passageiro passageiro1 = new Passageiro("22222222222", "Ana");
        Passageiro passageiro2 = new Passageiro("33333333333", "Lucas");

        Corrida corrida1 = new Corrida(motorista, passageiro1);
        Corrida corrida2 = new Corrida(motorista, passageiro1);
        Corrida corrida3 = new Corrida(motorista, passageiro1);
        Corrida corrida4 = new Corrida(motorista, passageiro2);

        corrida1.setNotaPassageiro(0);
        corrida2.setNotaPassageiro(4);
        corrida3.setNotaPassageiro(5);
        corrida4.setNotaPassageiro(3);

        central.adiciona(corrida1);
        central.adiciona(corrida2);
        central.adiciona(corrida3);
        central.adiciona(corrida4);

        double mediaEsperada = 4.5;
        if (Math.abs(central.mediaPassageiro() - mediaEsperada) > 0.01) {
            System.out.println("Erro: mediaPassageiro deveria ser " + mediaEsperada);
        }
    }

    static void testAvaliacoesMotorista() {
        Central central = new Central();

        Motorista motorista1 = new Motorista("11111111111", "Carlos");
        Motorista motorista2 = new Motorista("44444444444", "João");

        Passageiro passageiro = new Passageiro("22222222222", "Ana");

        Corrida corrida1 = new Corrida(motorista1, passageiro);
        Corrida corrida2 = new Corrida(motorista1, passageiro);
        Corrida corrida3 = new Corrida(motorista1, passageiro);
        Corrida corrida4 = new Corrida(motorista2, passageiro);
        Corrida corrida5 = new Corrida(null, passageiro);

        corrida1.setNotaMotorista(0);
        corrida2.setNotaMotorista(2);
        corrida3.setNotaMotorista(3);
        corrida4.setNotaMotorista(1);
        corrida5.setNotaMotorista(1);

        central.adiciona(corrida1);
        central.adiciona(corrida2);
        central.adiciona(corrida3);
        central.adiciona(corrida4);
        central.adiciona(corrida5);

        double mediaEsperada = 2.5;
        if (Math.abs(central.mediaMotorista() - mediaEsperada) > 0.01) {
            System.out.println("Erro: mediaMotorista deveria ser " + mediaEsperada);
        }
    }
}
