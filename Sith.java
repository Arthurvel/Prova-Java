package Force;
import Weapon.Saber;

//questão 07 criar uma classe Sith 

public class Sith implements Force{

    private String nome;
    private String titulo;
    private String weapons;

    //construtor 

    public Sith (String nome, String titulo, String weapons){
        this.nome = nome;
        this.titulo = titulo;
        this.weapons = weapons;
    }

    public Sith (){

    }
    
    // setters 

    public void setName(String nome){
        this.nome = nome;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setWeapons( String weapons){
        this.weapons = weapons;
    }

    //getters sith 

    public String getnome () {
        return this.nome;
    }

    public String gettitulo (){
        return this.titulo;
    }

    public String getweapons (){
        return this.weapons;
    }

    @Override
    public void mindControl() {
        System.out.println("controle de mente");
        
    }

    @Override
    public void farseeing() {
        System.out.println("something");
        
    }

    @Override
    public void telepath() {
        System.out.println("telepatia");
    }

    // sobrecarregando o metodo levitation 

    @Override
    public void levetation() {
        System.out.println("levitating something");
        // quando invocar o metodo vai aparecer "levitating something"
    }

    public void pickUp(Saber sabreVermelho) {
    }

    public void slash() {
    }
    
}
