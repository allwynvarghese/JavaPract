package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToeMain {

    public static void main(String[] args) {
        new TicTacToe();
    }
}

class TicTacToe implements ActionListener {

    JButton[] buttons = new JButton[9];
    JLabel text;
    Random random = new Random();
    private boolean player1 = true;
    TicTacToe(){

        //frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setSize(500,500);
        frame.setBounds(350, 100, 500,500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        //Textfield Jlabel
        text = new JLabel();
        text.setBackground(new Color(25,25,25));
        text.setForeground(new Color(25,255,0));
        text.setFont(new Font("Ink free", Font.BOLD, 75));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("Tic-Tac-Toe");

        //title panel
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBackground(Color.BLACK);
        titlePanel.setBounds(0,0,500,80);
        titlePanel.add(text);
        frame.add(titlePanel, BorderLayout.NORTH);

        //button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(150,150,150));
        buttonPanel.setLayout(new GridLayout(3,3));
        frame.add(buttonPanel);

        //Adding buttons
        for(int i=0;i<9;i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 100));
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setFocusable(false);
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(this);
        }

        firstTurn();
    }

    private void firstTurn() {
        try {
            Thread.sleep(2000);
        }catch(Exception e){
            e.getMessage();
        }
        if(random.nextInt(2) == 0){
            player1 = true;
            text.setText("X turn");
        }else {
            player1 = false;
            text.setText("O turn");
        }
    }

    private void check(){

        //check X win conditions
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="X")
        ) {
            xWins(0,1,2);
        }
        if(
                (buttons[3].getText()=="X") &&
                        (buttons[4].getText()=="X") &&
                        (buttons[5].getText()=="X")
        ) {
            xWins(3,4,5);
        }
        if(
                (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ) {
            xWins(6,7,8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[6].getText()=="X")
        ) {
            xWins(0,3,6);
        }
        if(
                (buttons[1].getText()=="X") &&
                        (buttons[4].getText()=="X") &&
                        (buttons[7].getText()=="X")
        ) {
            xWins(1,4,7);
        }
        if(
                (buttons[2].getText()=="X") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ) {
            xWins(2,5,8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[4].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ) {
            xWins(0,4,8);
        }
        if(
                (buttons[2].getText()=="X") &&
                        (buttons[4].getText()=="X") &&
                        (buttons[6].getText()=="X")
        ) {
            xWins(2,4,6);
        }
        //check O win conditions
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="O")
        ) {
            oWins(0,1,2);
        }
        if(
                (buttons[3].getText()=="O") &&
                        (buttons[4].getText()=="O") &&
                        (buttons[5].getText()=="O")
        ) {
            oWins(3,4,5);
        }
        if(
                (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ) {
            oWins(6,7,8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[6].getText()=="O")
        ) {
            oWins(0,3,6);
        }
        if(
                (buttons[1].getText()=="O") &&
                        (buttons[4].getText()=="O") &&
                        (buttons[7].getText()=="O")
        ) {
            oWins(1,4,7);
        }
        if(
                (buttons[2].getText()=="O") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ) {
            oWins(2,5,8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[4].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ) {
            oWins(0,4,8);
        }
        if(
                (buttons[2].getText()=="O") &&
                        (buttons[4].getText()=="O") &&
                        (buttons[6].getText()=="O")
        ) {
            oWins(2,4,6);
        }
    }

    private void xWins(int a, int b, int c){

        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        text.setText("X wins!!!");
    }

    private void oWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        text.setText("O wins!!!");
    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        for(int i=0;i<9;i++){
            if(ae.getSource() == buttons[i]){
                if(buttons[i].getText() == ""){
                    if(player1){
                        buttons[i].setText("X");
                        buttons[i].setForeground(new Color(255,0,0));
                        player1 = false;
                        text.setText("O turn");
                        check();
                    }else {
                        buttons[i].setText("O");
                        buttons[i].setForeground(new Color(0,0,255));
                        player1 = true;
                        text.setText("X turn");
                        check();
                    }
                }
            }
        }

    }


}
