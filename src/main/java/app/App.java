package app;

import dto.Viagem;

public class App {
    public static void main(String[] args){
        Viagem viagem = new Viagem("roma");

        System.out.println(viagem.destino);
    }
}
//teste