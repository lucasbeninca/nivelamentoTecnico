package dto;
import enums.Destinos;

import java.util.List;

public class Viagem {
    private Destinos destino;
    private List<String> acompanhantes;
    public Viagem(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;

    }

    public Destinos getDestino(){
        return this.destino;
    }

    public void setDestino(Destinos lugarDeDestino){
        this.destino = lugarDeDestino;
    }

    public List<String> getAcompanhantes(){
        return this.acompanhantes;
    }

    public void setAcompanhantes(List<String> acompanhantes){
        this.acompanhantes = acompanhantes;
    }

}
