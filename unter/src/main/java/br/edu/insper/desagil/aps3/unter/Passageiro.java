package br.edu.insper.desagil.aps3.unter;

public class Passageiro extends Usuario {

    @Override
    public void avalia(Corrida corrida, int nota) {
        corrida.avaliaMotorista(nota);
    }
}
