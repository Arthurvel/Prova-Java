package Force;
// questão 07 criar classe jedi

import Weapon.Blast;
import Weapon.Saber;

public class Jedi implements Force {

    public String nome;
    public String titulo;
    public String weapons;

    // cronstrutor jedi 

    public Jedi (String nome, String titulo, String weapons){
        this.nome = nome;
        this.titulo = titulo;
        this.weapons = weapons;
    }

    public Jedi (){
        
    }
    
    // setters jedi

    public void setName(String nome){
        this.nome = nome;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setWeapons( String weapons){
        this.weapons = weapons;
    }

    //getters jedi 

    public String getnome () {
        return this.nome;
    }

    public String gettitulo (){
        return this.titulo;
    }

    public String getweapons (){
        return this.weapons;
    }

    // sobre carregando o metodo levitation 
    @Override
    public void mindControl() {
        System.out.println("Do what I wish");
        // quando invocar vai aparecer do what i wish 
    }

    @Override
    public void farseeing() {
        System.out.println("something");
        
    }

    @Override
    public void telepath() {
        System.out.println("telepatia");
        
    }

    @Override
    public void levetation() {
        System.out.println("levitação");
        
    }

    public void pickUp(Saber sabreAzul) {
    }

    public void pickUp(Blast blastLazer) {
    }

    public void shot() {
    }

    public void drop(Blast blastLazer) {
    }

    //listagem das armas 
    

}
