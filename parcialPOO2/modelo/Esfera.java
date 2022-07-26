package modelo;

public class Esfera extends FiguraGeometrica
{
   //Atributos
    //---------------
    private double radio;
    
    //-----------------------
    //------Metodos----------
    //-----------------------

    public Esfera(double r)
    {
        super("Esfera");
        this.radio=r;
    }
    public Esfera()
    {
        super("Esfera");
    }

    public void setRadio(double radio)
    {
        this.radio= radio;
    }
    public double getRadio()
    {
        return radio;
    }

    
    
    
    
    @Override
    public double calcularVolumen() 
    {    
        return Math.PI*(Math.pow(radio, 2));
    } 
}
