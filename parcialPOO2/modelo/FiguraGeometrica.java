package modelo;

public abstract class FiguraGeometrica
{
    protected String nombre;

    public FiguraGeometrica(String n)
    {
        nombre= n;
    }

    //Metodos de acceso
    public void setNombre(String n)
    {
        this.nombre=n;
    }
    public String getNombre()
    {
        return nombre;
    } 


    //Abstracto vacio para instanciar en las diferentes clases
    public abstract double calcularVolumen();

    //nose jaja imprime la figura con el nombre
    public String toString()
    {
        return "Nombre Figura= "+ nombre +"\n" + "Volumen= " + calcularVolumen() + "\n";
    }

    

}