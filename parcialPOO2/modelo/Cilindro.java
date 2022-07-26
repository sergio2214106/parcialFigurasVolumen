package modelo;

public class Cilindro extends FiguraGeometrica
{
   //Atributos
    //---------------
    private double radio;
    private double altura;
    
    //-----------------------
    //------Metodos----------
    //-----------------------


    public Cilindro(double r, double altura)
    {
        super("Cilindro");
        this.radio=r;
        this.altura=altura;
    }
    public Cilindro()
    {
        super("Cilindro");
    }

    public void setRadio(double radio)
    {
        this.radio= radio;
    }
    public double getRadio()
    {
        return radio;
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
        return Math.PI*(Math.pow(radio, 2))*altura;
    } 
}
