package nose;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ventana extends JFrame{
    private JPanel p;
    private JLabel saludo;
    private JButton boton;
    private JTextField tex;

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
        p= new JPanel();
        p.setLayout(null);
        this.add(p);
    }
    private void cEtiquita(){
        JLabel eti=new JLabel("ingrese dato");
        eti.setBounds(30, 10, 200, 30);
        eti.setFont(new Font("cooper black",0,15));
        p.add(eti);
    }
    private void cTexto(){
        tex= new JTextField();
        tex.setBounds(30, 40, 300, 30);
        p.add(tex);
    }
    private void cBoton(){
        boton=new JButton("culo");
        boton.setBounds(150, 100, 150, 40);
        boton.setFont(new Font("arial",0,15));
        p.add(boton);
       
        
        saludo= new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial",0,20));
        p.add(saludo);
        
        ActionListener oo=(ActionEvent ae) -> {
            saludo.setText("mañana hay clase "+ tex.getText());
        };
        boton.addActionListener(oo);
    }
}
