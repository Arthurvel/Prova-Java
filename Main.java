import Force.Jedi;
import Force.Sith;
import Weapon.Blast;
import Weapon.Saber;
//Questão 02 criar uma classe principal
public class Main {

    /**
     * @param args
     */
    //metodo main 
    public static void main(String[] args) {
        
        // instanciar
        
        
        // questão 05
        //instanciar Pessoa Leia
        Pessoa novaPessoa1 = new Pessoa("Leia","Organa","Feminino");
        //novaPessoa1.setName("Leia");
        //novaPessoa1.setSobrenome("Organa");
        //novaPessoa1.setSexo("Feminino");

        
        // questão 06
        //instanciar a Pessoa Luke skywalker 
        Pessoa novaPessoa2 = new Pessoa("Luke","Skywalker","masculino");
        // novaPessoa2.setName("Luke");
        // novaPessoa2.setSobrenome("Skywalker");
        // novaPessoa2.setSexo("Maculino");

        System.out.printf(novaPessoa1.getnome());
        System.out.printf(novaPessoa2.getnome());
        
        //QUESTÃO 16
        //instanciando 3 weapons 

        Saber sabreAzul = new Saber("Um sabre de luz", 200);

        Saber sabreVermelho = new Saber ("Um sabre de luz vermelha",500);

        Blast blastLazer = new Blast("Blast Lazer",1000);
        
        //criando um jedi Obi Wan Questão 9

        Jedi novoJedi1 = new Jedi("Obi Wan", "Jedi","sabreAzul, blasterLazer");
        //novoJedi1.setName("Obi Wan");
        //novoJedi1.setTitulo("Jedi");
        //QUESTÃO 13 INVOCAÇÃO DO METODO LEVITATION E MINDCONTROL
        novoJedi1.levetation();
        novoJedi1.mindControl();
        //Questão 18
        novoJedi1.pickUp(sabreAzul);
        novoJedi1.pickUp(blastLazer);
        //QUESTÃO 19
        novoJedi1.shot();
        // QUESTÃO 20
        novoJedi1.drop(blastLazer);
    
        // criando um Sith Darth Vader Questão 10

        Sith novoSith1 = new Sith("Darth Vader","Sith","sabreVermelho");
        //novoSith1.setName("Darth Vader");
        //novoSith1.setTitulo("Sith");
        
        //invocação mindo control 
        novoSith1.mindControl();
        //questão 13

        //invocação levitation
        novoSith1.levetation();
        //Questão 17
        novoSith1.pickUp(sabreVermelho);
        // QUESTÃO 19
        novoSith1.slash();
    

 

    }
}