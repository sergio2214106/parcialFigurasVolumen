package ejecutable;

import controlador.Controlador;
import modelo.Cilindro;
import modelo.Cono;
import modelo.Cubo;
import modelo.Esfera;
import vista.VentanaPrincipal;

public class test 
{
    public static void main(String[] args)
    
    {
        VentanaPrincipal miVentana= new VentanaPrincipal();
        Cilindro mCilindro= new Cilindro();
        Cubo miCubo= new Cubo();
        Cono miCono = new Cono();
        Esfera miEsfera = new Esfera();
        Controlador miControlador = new Controlador(miVentana,mCilindro,miCubo,miCono,miEsfera); 

    }
}
