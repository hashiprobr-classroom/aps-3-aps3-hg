public class Passageiro extends Usuario {

    public Passageiro(String cpf, String nome) {
        super(cpf, nome);
    }

    public void avaliarCorrida(Corrida corrida, int nota) {
        corrida.setNotaMotorista(nota);
    }
}
