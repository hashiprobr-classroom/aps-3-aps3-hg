package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas = new ArrayList<>();

    public void adiciona(Corrida corrida) {
        corridas.add(corrida);
    }

    public double mediaPassageiro(String cpf) {
        int soma = 0, qtd = 0;
        for (Corrida corrida : corridas) {
            if (corrida.getPassageiro().getCpf().equals(cpf) && corrida.getNotaPassageiro() != 0) {
                soma += corrida.getNotaPassageiro();
                qtd++;
            }
        }
        return qtd == 0 ? 0 : (double) soma / qtd;
    }

    public double mediaMotorista(String cpf) {
        int soma = 0, qtd = 0;
        for (Corrida corrida : corridas) {
            if (corrida.getMotorista() != null && corrida.getMotorista().getCpf().equals(cpf) && corrida.getNotaMotorista() != 0) {
                soma += corrida.getNotaMotorista();
                qtd++;
            }
        }
        return qtd == 0 ? 0 : (double) soma / qtd;
    }
}
