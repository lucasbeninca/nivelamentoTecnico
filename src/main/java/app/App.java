package app;

import dto.Viagem;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        Viagem viagem = new Viagem(Destinos.OSASCO);

        viagem.setDestino(Destinos.RECIFE);
        viagem.setDestino(Destinos.MARINGA);

        List<String> acompanhantes = new ArrayList<String>();
        acompanhantes.add("teste");
        acompanhantes.add("teste2");

        viagem.setAcompanhantes(acompanhantes);

        System.out.println(viagem.getDestino().getCidade());
        System.out.println(viagem.getAcompanhantes().size());
        System.out.println(viagem.getAcompanhantes().get(0));
        System.out.println(viagem.getAcompanhantes().get(1));
    }
}
