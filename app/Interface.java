package app;

import java.awt.*;
import javax.swing.*;

public class Interface extends JFrame {

    JButton button1 = new JButton("CADASTRAR PESSOA");
    JButton button2 = new JButton("CADASTRAR DIVIDA");
    JButton button3 = new JButton("CADASTRAR PROVENTO");
    JButton button4 = new JButton("CONSULTAR PESSOAS");
    JButton button5 = new JButton("CONSULTAR DIVIDA");
    JButton button6 = new JButton("CONSULTAR PROVENTO");

    public Interface() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(button4);
        pane.add(button5);
        pane.add(button6);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,250);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Interface janela = new Interface();
    }
}