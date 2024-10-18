package nose;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JButton boton;
    private JTextField texto;

    public ventana() {
        setBounds(50,50,500,500);
        setTitle ("evento");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void iniciarComponentes(){
        cPanel();
        cEtiquita();
        cTexto();
        cBoton();
    }
    private void cPanel(){
        panel= new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void cEtiquita(){
        JLabel eti=new JLabel("ingrese dato");
        eti.setBounds(30, 10, 200, 30);
        eti.setFont(new Font("cooper black",0,15));
        panel.add(eti);
    }
    private void cTexto(){
        texto= new JTextField();
        texto.setBounds(30, 40, 300, 30);
        panel.add(texto);
    }
    private void cBoton(){
        boton=new JButton("culo");
        boton.setBounds(150, 100, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
       
        
        saludo= new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial",0,20));
        panel.add(saludo);
        
        ActionListener oo=(ActionEvent ae) -> {
            saludo.setText("mañana hay clase "+ texto.getText());
        };
        boton.addActionListener(oo);
    }
}
