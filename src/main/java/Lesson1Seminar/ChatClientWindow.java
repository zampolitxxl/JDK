package Lesson1Seminar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatClientWindow extends  JFrame{

    private  static final int  WINDOW_HEIGHT = 555;
    private  static final int  WINDOW_WIDTH = 507;
    private  static final int  WINDOW_POSX = 800;
    private  static final int  WINDOW_POSY = 300;

    JTextArea log =new JTextArea();
    JPanel panelTop = new JPanel(new GridLayout(2,3));
    JTextField tfIPAdress = new JTextField("127.0.0.1");
    JTextField tfIPort = new JTextField("8189");

    JTextField tfLogin = new JTextField("ivan_igorevich");

    JPasswordField tfIPassword = new JPasswordField("123456");
    JButton btnLogin = new JButton("Login");

    //низ
    JPanel panelBottom = new JPanel(new BorderLayout());

    JTextField tfMessage = new JTextField();
    JButton btnSend = new JButton("Send");


    ChatClientWindow(ServerWindow serverWindow){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("ChatClientWindow");
        setResizable(false);


        //Верх
        panelTop.add(tfIPAdress);
        panelTop.add(tfIPort);
        panelTop.add(tfLogin);
        panelTop.add(tfIPassword);
        panelTop.add(btnLogin);
        add(panelTop, BorderLayout.NORTH);

        //Низ

        panelBottom.add(tfMessage, BorderLayout.CENTER);
        panelBottom.add(btnSend, BorderLayout.EAST);
        add(panelBottom, BorderLayout.SOUTH);

        //Не понял

        log.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(log);
        add(scrollLog);

        setVisible(true);






/*
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        */





    }




    }

