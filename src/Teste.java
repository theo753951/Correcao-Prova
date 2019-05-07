public class Teste {
    public static void main(String [] args){
        Diretor d1=new Diretor();
        d1.setNome("Afonso");
        
        Data n1=new Data();
        n1.setDia(15);
        n1.setMes(05);
        n1.setAno(1955);
        
        d1.setDataNascimento(n1);
        
        Filme f1=new Filme();
        
        Data n2=new Data();
        n2.setDia(20);
        n2.setMes(06);
        n2.setAno(2017);
        
        f1.setDataLancamento(n2);
        f1.setDiretor(d1);
       
        d1.mostrar();
        f1.mostrar();
        f1.informeGenero("Terror");
    }
    
}
