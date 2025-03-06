package br.edu.insper.desagil.aps3.unter;

public class PassageiroTest {
    public static void constroi() {
        Passageiro p = new Passageiro("123", "Joao");
        System.out.println(p.getCpf().equals("123") && p.getNome().equals("Joao"));
    }

    public static void mudaNome() {
        Passageiro p = new Passageiro("456", "Maria");
        p.setNome("Ana");
        System.out.println(p.getNome().equals("Ana"));
    }

    public static void avalia() {
        Passageiro p = new Passageiro("123", "Joao");
        Corrida c = new Corrida(p);
        p.avalia(c, 3);
        System.out.println(c.getNotaMotorista() == 3);
    }

    public static void avaliaBaixo() {
        Passageiro p = new Passageiro("123", "Joao");
        Corrida c = new Corrida(p);
        p.avalia(c, 0);
        System.out.println(c.getNotaMotorista() == 1);
    }

    public static void avaliaAlto() {
        Passageiro p = new Passageiro("123", "Joao");
        Corrida c = new Corrida(p);
        p.avalia(c, 6);
        System.out.println(c.getNotaMotorista() == 5);
    }
}
