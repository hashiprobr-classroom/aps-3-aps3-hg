public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private int notaPassageiro;
    private int notaMotorista;

    public Corrida(Passageiro passageiro) {
        this.passageiro = passageiro;
        this.motorista = null;
        this.notaPassageiro = 0;
        this.notaMotorista = 0;
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

    private int truncarNota(int nota) {
        if (nota < 1) {
            return 1;
        } else if (nota > 5) {
            return 5;
        }
        return nota;
    }

    public void setNotaPassageiro(int nota) {
        this.notaPassageiro = truncarNota(nota);
    }

    public void setNotaMotorista(int nota) {
        this.notaMotorista = truncarNota(nota);
    }
}
