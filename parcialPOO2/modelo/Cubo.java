package modelo;

public class Cubo extends FiguraGeometrica
{

    //Atributos
    //---------------
    private double lado;

    
    //-----------------------
    //------Metodos----------
    //-----------------------
    public Cubo(double b)
    {
        super("Cubo");
        this.lado= b;

    }
    public Cubo()
    {
        super("Cubo");
    }
    //metodos de acceso
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }


    
    @Override
    public double calcularVolumen() 
    {    
        return Math.pow(lado, 3);
    }

    

}
