package controlador;

import java.awt.event.ActionListener;

import modelo.Cilindro;
import modelo.Cono;
import modelo.Cubo;
import modelo.Esfera;
import modelo.FiguraGeometrica;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;

public class Controlador implements ActionListener
{
        
    
        //----------------------
        //-------Atributos------
        //----------------------

        private VentanaPrincipal vista;
        private Cilindro modeloCilindro;
        private Cubo modeloCubo;
        private Cono modeloCono;
        private Esfera modeloEsfera;

        //----------------------
        //---------Metodos------
        //---------------------- 
        
        /*Metodo Constructor*/
        public Controlador(VentanaPrincipal pvista,Cilindro ci, Cubo cu, Cono co, Esfera e)
        {
            this.vista = pvista;
            this.modeloCilindro= ci;
            this.modeloCubo= cu;
            this.modeloCono= co;
            this.modeloEsfera= e;
            this.vista.miPanelOperaciones.btHallar.addActionListener(this);
            this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);
            this.vista.miPanelEntradaDatos.btCubo.addActionListener(this);
            this.vista.miPanelEntradaDatos.btCilindro.addActionListener(this);
            this.vista.miPanelEntradaDatos.btCono.addActionListener(this);
            this.vista.miPanelEntradaDatos.btEsfera.addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            // Identificar el comando generado [hallar, borrar, salir]

            String comando = ae.getActionCommand();
            if(comando.equals("seleccionarCubo"))
            {
                vista.miPanelEntradaDatos.lbAltura.setVisible(false);
                vista.miPanelEntradaDatos.lbRadio.setVisible(false);
                vista.miPanelEntradaDatos.tfAltura.setVisible(false);
                vista.miPanelEntradaDatos.tfRadio.setVisible(false);
                if(comando.equals("salir"))
                {
                    System.exit(0);
                }
                if(comando.equals("borrar"))
                {
                    this.vista.miPanelEntradaDatos.borrar();
                    this.vista.miPanelResultados.borrar();
                }
                if(comando.equals("hallar"))
                {
                    modeloCubo.setLado(Integer.parseInt(vista.miPanelEntradaDatos.getTfLado()));
                    vista.miPanelResultados.mostrarResultado(modeloCubo);;
                }
                
            }
            if(comando.equals("seleccionarCono"))
            {
                if(comando.equals("salir"))
                {
                    System.exit(0);
                }
                if(comando.equals("borrar"))
                {
                    this.vista.miPanelEntradaDatos.borrar();
                    this.vista.miPanelResultados.borrar();
                }
                if(comando.equals("hallar"))
                {
                    
                }
            }
            if(comando.equals("seleccionarCilindro"))
            {
                if(comando.equals("salir"))
                {
                    System.exit(0);
                }
                if(comando.equals("borrar"))
                {
                    this.vista.miPanelEntradaDatos.borrar();
                    this.vista.miPanelResultados.borrar();
                }
                if(comando.equals("hallar"))
                {
                    
                }
            }
            if(comando.equals("seleccionarEsfera"))
            {
                    if(comando.equals("salir"))
                {
                    System.exit(0);
                }
                if(comando.equals("borrar"))
                {
                    this.vista.miPanelEntradaDatos.borrar();
                    this.vista.miPanelResultados.borrar();
                }
                if(comando.equals("hallar"))
                {
                    
                }
            }

    
        }
        
    
}
