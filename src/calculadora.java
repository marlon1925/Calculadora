import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JPanel panel1;
    private JButton botonCero;
    private JButton botonUno;
    private JLabel mostrar;

    private JPanel JPEspacioP;
    private JLabel txtOperaciones;
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

    public calculadora() {
        botonCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar.setText("0");
            }
        });
        botonUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar.setText("1");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("v1");
        frame.setContentPane(new calculadora().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }


}
