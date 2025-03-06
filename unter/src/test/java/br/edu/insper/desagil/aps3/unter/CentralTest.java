public class CentralTest {
    public static void nenhumaAvaliacaoPassageiro() {
        Central central = new Central();
        System.out.println(central.mediaPassageiro("999") == 0.0);
    }

    public static void nenhumaAvaliacaoMotorista() {
        Central central = new Central();
        System.out.println(central.mediaMotorista("888") == 0.0);
    }

    public static void avaliacoesPassageiro() {
        Central central = new Central();
        Passageiro p1 = new Passageiro();
        p1.setCpf("111");
        Corrida c1 = new Corrida(p1);
        Corrida c2 = new Corrida(p1);
        Corrida c3 = new Corrida(p1);
        c1.avaliaPassageiro(0);
        c2.avaliaPassageiro(4);
        c3.avaliaPassageiro(5);
        Passageiro p2 = new Passageiro();
        p2.setCpf("222");
        Corrida c4 = new Corrida(p2);
        c4.avaliaPassageiro(3);
        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);
        System.out.println(central.mediaPassageiro("111") == 4.5);
    }

    public static void avaliacoesMotorista() {
        Central central = new Central();
        Motorista m1 = new Motorista();
        m1.setCpf("333");
        Corrida c1 = new Corrida(new Passageiro());
        Corrida c2 = new Corrida(new Passageiro());
        Corrida c3 = new Corrida(new Passageiro());
        c1.setMotorista(m1);
        c2.setMotorista(m1);
        c3.setMotorista(m1);
        c1.avaliaMotorista(0);
        c2.avaliaMotorista(2);
        c3.avaliaMotorista(3);
        Motorista m2 = new Motorista();
        m2.setCpf("444");
        Corrida c4 = new Corrida(new Passageiro());
        c4.setMotorista(m2);
        c4.avaliaMotorista(1);
        Corrida c5 = new Corrida(new Passageiro());
        c5.avaliaMotorista(1);
        central.adiciona(c1);
        central.adiciona(c2);
        central.adiciona(c3);
        central.adiciona(c4);
        central.adiciona(c5);
        System.out.println(central.mediaMotorista("333") == 2.5);
    }
}
