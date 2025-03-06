public class Motorista extends Usuario {

    public Motorista(String cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void avalia(Corrida corrida, int nota) {
        corrida.setNotaPassageiro(nota);
    }
}
