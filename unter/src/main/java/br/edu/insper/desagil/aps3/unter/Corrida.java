package br.edu.insper.desagil.aps3.unter;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista = null;
    private int notaPassageiro = 0;
    private int notaMotorista = 0;

    public Corrida(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    private int truncaNota(int nota) {
        if (nota < 1) return 1;
        if (nota > 5) return 5;
        return nota;
    }

    public void avaliaPassageiro(int nota) {
        this.notaPassageiro = truncaNota(nota);
    }

    public void avaliaMotorista(int nota) {
        this.notaMotorista = truncaNota(nota);
    }
}