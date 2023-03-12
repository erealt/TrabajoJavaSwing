package Contenedores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MiPanel extends JFrame {
    private JPanel MiPanel;
    private JRadioButton prioridad1;
    private JRadioButton prioridad3;
    private JRadioButton prioridad2;
    private JComboBox pais;
    private JCheckBox inspeccionadoEnAduanasCheckBox;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JTextField numeroDeColumnaTextField;
    private JButton mostrarDatosContenedorButton;
    private JTextField IDContenedorTextField;
    private JButton cuantosButton;
    private JComboBox comboBox2;
    private JTextField textident;
    private JTextField textToneladas;
    private JPanel JPanel1;
    private JTextArea textDescrip;
    private JTextField textRemitente;
    private JTextField textRecep;
    private JTextArea textestado;


   String ident,peso,descripcion,remitente,receptora,paisselect;
   int prioridad,aduana;
    public MiPanel(){
        setTitle("Gestión de contenedores");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(MiPanel);


        ButtonGroup G = new ButtonGroup(); // Se crea un grupo para que solo se pueda marcar uno de estos 3 botones
        G.add(prioridad1);
        G.add(prioridad2);
        G.add(prioridad3);



        mostrarDatosContenedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ident=textident.getText();
                peso=textToneladas.getText();
                descripcion=textDescrip.getText();
                remitente=textRemitente.getText();
                receptora=textRecep.getText();
                paisselect =(String) pais.getSelectedItem();
                if(prioridad1.isSelected() ){
                    prioridad=1;
                } else if (prioridad2.isSelected()) {
                    prioridad=2;

                } else if (prioridad3.isSelected()) {
                    prioridad=3;
                }


                if(inspeccionadoEnAduanasCheckBox.isSelected()){
                    aduana=1;
                }else{
                    aduana=0;
                }
                new Panel2(ident,peso,descripcion,remitente,receptora,paisselect,prioridad,aduana);


            }
        });


        textident.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {

                super.focusLost(e);
                try {
                    int dato = Integer.parseInt(textident.getText());
                }catch(NumberFormatException ex){

                    JOptionPane.showMessageDialog(null,"El identificador no es un entero, vuelve a teclearlo");

                }
            }
        });
        textToneladas.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                try {
                    int dato = Integer.parseInt(textToneladas.getText());
                }catch(NumberFormatException ex){

                    JOptionPane.showMessageDialog(null,"El peso no es un entero, vuelve a teclearlo");

                }
            }
        });
    }




}
