public class Diretor {
    private String nome;
    private Data dataNascimento;
    
    public void setNome(String n){
        this.nome=n;
    }
    public void setDataNascimento(Data d){
        this.dataNascimento=d;
    }
    public String getNome(){
        return this.nome;
    }
    public Data getDataNascimento(){
        return this.dataNascimento;
    }
    public void mostrar(){
        System.out.println("Nome do Diretor: "+this.getNome());
        System.out.println("Data de Nascimento: "+this.getDataNascimento());
    }
}
