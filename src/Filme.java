public class Filme {
    private Data dataLancamento;
    private Diretor diretor;
    private String genero;
    
    public void setDataLancamento(Data d){
        this.dataLancamento=d;
    }
    public void setDiretor(Diretor d){
        this.diretor=d;
    }
    public void setGenero(String g){
        this.genero=g;
    }
    public Data getDataLancamento(){
        return this.dataLancamento;
    }
    public Diretor getDiretor(){
        return this.diretor;
    }
    public String getGenero(){
        return this.genero;
    }
    public void mostrar(){
        System.out.println("Data de Lançamento: "+this.getDataLancamento());
        System.out.println("Diretor de Filme: "+this.getDiretor());
        System.out.println("Genero do Filme: "+this.getGenero());
    }
    public boolean informeGenero(String g){
        genero=g;
        if((g=="Terror")||(g=="Ação")||(g=="Romance"))
            return true;
        else
            return false;
    }
}
