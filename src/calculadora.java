import javax.lang.model.element.NestingKind;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class calculadora extends javax.swing.JFrame {
    private JPanel panel1;
    private JButton botonCero;
    private JButton botonUno;
    private JLabel mostrar;

    private JPanel JPEspacioP;
    private JLabel txtResultado;
    private JButton botonTres;
    private JButton botonDos;
    private JButton botonCuatro;
    private JButton botonCinco;
    private JButton botonSeis;
    private JButton botonSiete;
    private JButton botonOcho;
    private JButton botonNueve;
    private JButton botonResta;
    private JButton botonSuma;
    private JButton botonPunto;
    private JButton botonIgual;
    private JLabel txtOperaciones;
    private JButton botonMulti;
    private JButton botonDiv;
    private JButton botonBorrar;

    public calculadora() {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine se = sem.getEngineByName("JavaScript");
        botonCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText()+digito);
            }
        });

        botonUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText() + digito);
            }
        });


        botonDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText()+digito);
            }
        });

        botonTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText()+digito);
            }
        });


        botonCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText()+digito);
            }
        });

        botonCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText()+digito);
            }
        });

        botonSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText()+digito);
            }
        });

        botonSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText()+digito);
            }
        });

        botonOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText()+digito);
            }
        });

        botonNueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // obtener el valor del boton
                String digito = e.getActionCommand();
                // agregar el valor al JLabel
                txtOperaciones.setText(txtOperaciones.getText()+digito);
            }
        });

        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtener el valor del boton
                String digito = botonSuma.getText();
                // verificar si ya existe una barra al final del texto
                if(!txtOperaciones.getText().endsWith("+")){
                    // agregar el valor al JLabel
                    txtOperaciones.setText(txtOperaciones.getText()+"+");
                }
            }
        });


        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtener el valor del boton
                String digito = botonResta.getText();
                // verificar si ya existe una barra al final del texto
                if(!txtOperaciones.getText().endsWith("-")){
                    // agregar el valor al JLabel
                    txtOperaciones.setText(txtOperaciones.getText()+"-");
                }
            }
        });


        botonMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtener el valor del boton
                String digito = botonMulti.getText();
                // verificar si ya existe una barra al final del texto
                if(!txtOperaciones.getText().endsWith("*")){
                    // agregar el valor al JLabel
                    txtOperaciones.setText(txtOperaciones.getText()+"*");
                }
            }
        });


        botonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtener el valor del boton
                String digito = botonDiv.getText();
                // verificar si ya existe una barra al final del texto
                if(!txtOperaciones.getText().endsWith("/")){
                    // agregar el valor al JLabel
                    txtOperaciones.setText(txtOperaciones.getText()+"/");
                }
            }
        });


        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // limpiar el valor del JLabel txtOperaciones
                txtOperaciones.setText("");
                // limpiar el valor del JLabel txtResultado
                txtResultado.setText("0");
            }
        });

        botonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtOperaciones.getText().contains(".")) {
                    txtOperaciones.setText(txtOperaciones.getText() + ".");
                }
            }
        });


        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String resultado = se.eval(txtOperaciones.getText()).toString();
                    txtResultado.setText(resultado);
                } catch (Exception ex) {
                    System.out.println("Error de sintaxis");
                }
            }
        });
    }

    public static void main (String[]args){
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new calculadora().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}




