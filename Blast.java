package Weapon;
//QUESTÃO 14 CRIAR CLASSE BLAST E SABER 

public class Blast extends Weapon {
    private String descricao;
    private float dano;
    // GETTERS 
    public String getDescricao() {
        return descricao;
    }

    public float getDano() {
        return dano;
    }

    public Blast (String descricao, float dano ){
        super();
    } 
    //SETTERS 
    public void setDescrição (String descricao){
         this.descricao = descricao;
    }

    public void setDano (float dano){
        this.dano = dano;
    }

    public void shot(){}
    
}
