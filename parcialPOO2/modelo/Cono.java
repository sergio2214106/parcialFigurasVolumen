package modelo;

public class Cono extends FiguraGeometrica
{
    //Atributos
    //---------------
    private double radio;
    private double altura;
    
    //-----------------------
    //------Metodos----------
    //-----------------------

    public Cono(double b, double h)
    {
        super("Cono");
        this.radio= b;
        this.altura=h;
        
    }
    public Cono()
    {
        super("Cono");    
    }
    
    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
    @Override
    public double calcularVolumen() 
    {    
        return (Math.PI*altura*Math.pow(radio, 2))/3;
    }
}
