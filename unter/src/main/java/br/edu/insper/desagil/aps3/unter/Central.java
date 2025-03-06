import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas;

    public Central() {
        this.corridas = new ArrayList<>();
    }

    public void adiciona(Corrida corrida) {
        corridas.add(corrida);
    }
    public double mediaPassageiro() {
        if (corridas.isEmpty()) {
            return 0;
        }
        double soma = 0;
        int totalNotas = 0;
        for (Corrida corrida : corridas) {
            int nota = corrida.getNotaPassageiro();
            if (nota > 0) {
                soma += nota;
                totalNotas++;
            }
        }
        return totalNotas == 0 ? 0 : soma / totalNotas;
    }


    public double mediaMotorista() {
        if (corridas.isEmpty()) {
            return 0;
        }
        double soma = 0;
        int totalNotas = 0;
        for (Corrida corrida : corridas) {
            int nota = corrida.getNotaMotorista();
            if (nota > 0) {
                soma += nota;
                totalNotas++;
            }
        }
        return totalNotas == 0 ? 0 : soma / totalNotas;
    }


    public List<Corrida> getCorridas() {
        return new ArrayList<>(corridas); 
    }
}
