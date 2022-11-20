//questão 01 criar uma classe pessoa 
public class Pessoa {

    
    private String nome;
    private String sobrenome;
    private String sexo;

        // questão 04 criar um construtor 
        //passar os parametros da classe pessoa com os atributos 
        public Pessoa (String nome, String sobrenome, String sexo){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.sexo = sexo;
        }
        //passando o nome e sobrenome 
        public Pessoa (String nome, String sobrenome){
            this.nome = nome;
            this.sobrenome = sobrenome;
        }
    
        public Pessoa (){
            
        }
    // Questão 3 


        //metodos setters 
    public void setName(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    // metodos gettes 
    public String getnome () {
        return this.nome;
    }

    public String getsobrenome (){
        return this.sobrenome;
    }

    public String getsexo (){
        return this.sexo;
    }


}