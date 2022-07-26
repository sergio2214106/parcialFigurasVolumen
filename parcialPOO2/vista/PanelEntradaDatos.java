package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelEntradaDatos extends JPanel
{
        //----------------------
        //-------Atributos------
        //----------------------
        public JLabel lbSeleccion;
        public JLabel lbLado;
        public JLabel lbRadio;
        public JLabel lbAltura;
        public JRadioButton btCilindro;
        public JRadioButton btCubo;
        public JRadioButton btEsfera;
        public JRadioButton btCono;
        public JTextField tfLado;
        public JTextField tfRadio;
        public JTextField tfAltura;
        private ButtonGroup grupoBotones = new ButtonGroup();


        //----------------------
        //---------Metodos------
        //----------------------   

        /*Método Constructor*/
        public PanelEntradaDatos() 
    
        {




        //Crear y agregar etiqueta seleccion
        lbSeleccion= new JLabel("Seleccione su objeto = ");
        lbSeleccion.setBounds(20, 20, 240, 20);
        this.add(lbSeleccion);
        //Crear y agregar etiqueta lado
        lbLado= new JLabel("lado = ");
        lbLado.setBounds(240, 70, 100, 20);
        this.add(lbLado);
        lbLado.setVisible(true);
        //Crear y agregar etiqueta radio
        lbRadio= new JLabel("radio = ");
        lbRadio.setBounds(240, 90, 100, 20);
        this.add(lbRadio);
        lbRadio.setVisible(true);
        //Crear y agregar etiqueta altura
        lbAltura= new JLabel("altura = ");
        lbAltura.setBounds(240, 110, 100, 20);
        this.add(lbAltura);
        lbAltura.setVisible(true);

        //crear y agregar Caja de texto lado
        tfLado= new JTextField();
        tfLado.setBounds(300, 70, 100, 20);
        this.add(tfLado);
        tfLado.setVisible(true);
        //crear y agregar Caja de texto lado
        tfLado= new JTextField();
        tfLado.setBounds(300, 70, 100, 20);
        this.add(tfLado);
        tfLado.setVisible(true);
        //crear y agregar Caja de texto lado
        tfRadio= new JTextField();
        tfRadio.setBounds(300, 90, 100, 20);
        this.add(tfRadio);
        tfRadio.setVisible(true);
        //crear y agregar Caja de texto lado
        tfAltura= new JTextField();
        tfAltura.setBounds(300, 110, 100, 20);
        this.add(tfAltura);
        tfAltura.setVisible(true);

        
        //Crear y agregar Caja de texto X
        btCubo= new JRadioButton(" Cubo");
        btCubo.setBounds(20, 40, 60, 20);
        btCubo.setBackground(Color.GRAY);
        this.add(btCubo);
        grupoBotones.add(btCubo);
        btCubo.setActionCommand("seleccionarCubo");
        //Crear y agregar Caja de texto X
        btCilindro= new JRadioButton(" Cilindro");
        btCilindro.setBounds(20, 60, 80, 20);
        btCilindro.setBackground(Color.GRAY);
        this.add(btCilindro);
        grupoBotones.add(btCilindro);
        btCilindro.setActionCommand("seleccionarCilindro");
        //Crear y agregar Caja de texto X
        btCono= new JRadioButton(" Cono");
        btCono.setBounds(20, 80, 60, 20);
        btCono.setBackground(Color.GRAY);
        btCono.setActionCommand("seleccionarCono");
        this.add(btCono);
        grupoBotones.add(btCono);
        //Crear y agregar Caja de texto X
        btEsfera= new JRadioButton(" Esfera");
        btEsfera.setBounds(20, 100, 80, 20);
        btEsfera.setBackground(Color.GRAY);
        this.add(btEsfera);
        grupoBotones.add(btEsfera);
        btEsfera.setActionCommand("seleccionarEsfera");

        


        //definir contenedor del panel

        this.setLayout(null);
        this.setBackground(Color.GRAY);

        //Borde y tituo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada") ;
        borde.setTitleColor(Color.WHITE);
        this.setBorder(borde);

        }

        //Métodos de acceso  a la informacion

        public String getTfRadio() {
            return tfRadio.getText();
        }

        public void setTfRadio(JTextField tfRadio) {
            this.tfRadio = tfRadio;
        }
        public String getTfLado() {
            return tfLado.getText();
        }

        public void setTfLado(JTextField tfLado) {
            this.tfLado = tfLado;
        }
        public String getTfAltura() {
            return tfAltura.getText();
        }

        public void setTfAltura(JTextField tfAltura) {
            this.tfAltura = tfAltura;
        }

        //Metodo Borrar cajas de texto

        public void borrar()
        {
            tfLado.setText("");
            tfRadio.setText("");
            tfAltura.setText("");
        }


}
