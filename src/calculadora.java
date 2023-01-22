import javax.jws.Oneway;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calculadora {
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


        botonCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(txtOperaciones.getText()+"0");
            }
        });

        botonUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(txtOperaciones.getText()+"1");
            }
        });

        botonDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(txtOperaciones.getText()+"2");
            }
        });

        botonTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(txtOperaciones.getText()+"3");
            }
        });

        botonCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(txtOperaciones.getText()+"4");
            }
        });

        botonCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(txtOperaciones.getText()+"5");
            }
        });

        botonSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(txtOperaciones.getText()+"6");
            }
        });

        botonSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(txtOperaciones.getText()+"7");
            }
        });

        botonOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(txtOperaciones.getText()+"8");
            }
        });



        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText("+");
            }
        });

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText("-");
            }
        });

        botonMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText("*");
            }
        });

        botonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText("/");
            }
        });

        botonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText(".");
            }
        });

        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperaciones.setText("");
            }
        });


    }



    public static void main (String[]args){
        JFrame frame = new JFrame("v1");
        frame.setContentPane(new calculadora().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
