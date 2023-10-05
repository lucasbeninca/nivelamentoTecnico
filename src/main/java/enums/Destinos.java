package enums;

public enum Destinos {
    OSASCO("Osasco"),
    MARINGA("Maringá"),
    GOIAS("Goias"),
    RECIFE("Recife"),
    MANAUS("Manaus");

    public String cidade;
    Destinos(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return  this.cidade;
    }


}
