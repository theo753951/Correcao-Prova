public class Triangulo {
    
    private double area;
    private double base;
    private double altura;
    
    public double getArea(){
        return this.area;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setArea(double a){
        this.altura=a;
    }
    public void setBase(double b){
        this.base=b;
    }
    public void setAltura(double A){
        this.altura=A;
    }
   
    public void calculaArea(){
        this.area=(this.base*this.altura)/2;
        System.out.println("Area: "+this.getArea());
    }
}
