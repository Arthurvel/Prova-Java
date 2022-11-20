package Weapon;
// QUESTÃO 14 

// EXTENDENDO OS COMPORTAMENTOS DA CLASSE WEAPON 
public class Saber extends Weapon{

    private String descricao;
    private float dano;
    //GETTERS 
    public String getDescricao (){
        return descricao;
    }
    
    public float getDano() {
        return dano;
    }

    public Saber(String descricao, float dano){
        super();
    }
    // SETTERS 
    public void setDescrição(String descricao){
        this.descricao = descricao;
    }

    public void setDano(float dano){
        this.dano = dano;
    }

    public void slash(){}
}
