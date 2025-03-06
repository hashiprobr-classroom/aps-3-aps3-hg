package br.edu.insper.desagil.aps3.unter;
public class Motorista extends Usuario {

    @Override
    public void avalia(Corrida corrida, int nota) {
        corrida.avaliaPassageiro(nota);
    }
}