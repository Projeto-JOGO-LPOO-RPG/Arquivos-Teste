package main;


import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("The Kingdom of Dyks");

        PainelDoJogo painelDoJogo = new PainelDoJogo();
        window.add(painelDoJogo);

        window.pack();


        window.setLocationRelativeTo(null);
        window.setVisible(true);

        painelDoJogo.InicioContaTempoJogo();

    }

}