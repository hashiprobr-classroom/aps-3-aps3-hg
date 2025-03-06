package br.edu.insper.desagil.aps3.unter;

public class MotoristaTest {
    public static void constroi() {
        Motorista m = new Motorista();
        m.setCpf("456");
        m.setNome("Carlos");
        System.out.println(m.getCpf().equals("456") && m.getNome().equals("Carlos"));
    }

    public static void mudaNome() {
        Motorista m = new Motorista();
        m.setNome("Pedro");
        m.setNome("Joao");
        System.out.println(m.getNome().equals("Joao"));
    }

    public static void avalia() {
        Motorista m = new Motorista();
        Passageiro p = new Passageiro();
        Corrida c = new Corrida(p);
        c.setMotorista(m);
        m.avalia(c, 3);
        System.out.println(c.getNotaPassageiro() == 3);
    }

    public static void avaliaBaixo() {
        Motorista m = new Motorista();
        Passageiro p = new Passageiro();
        Corrida c = new Corrida(p);
        c.setMotorista(m);
        m.avalia(c, 0);
        System.out.println(c.getNotaPassageiro() == 1);
    }

    public static void avaliaAlto() {
        Motorista m = new Motorista();
        Passageiro p = new Passageiro();
        Corrida c = new Corrida(p);
        c.setMotorista(m);
        m.avalia(c, 6);
        System.out.println(c.getNotaPassageiro() == 5);
    }
}