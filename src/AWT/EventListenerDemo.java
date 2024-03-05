package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonEvent extends Frame implements ActionListener {


    int count = 0;
    Button btn;
    Label counter;
    ButtonEvent(){

        setLayout(new FlowLayout());
        setSize(300,300);
        setBounds(400,100,300,300);
        setBackground(Color.GRAY);

        //label
        counter = new Label(String.valueOf(count));
        add(counter);

        //button
        btn = new Button("Click");
        btn.addActionListener(this);
        add(btn);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn ){
            count++;
            counter.setText(String.valueOf(count));
        }
    }
}

public class EventListenerDemo {

    public static void main(String[] args) {
        ButtonEvent btnEvt = new ButtonEvent();

    }
}
