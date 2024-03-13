package Lesson1Seminar;

import org.example.Map;
import org.example.SettingsWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends  JFrame{

    private  static final int  WINDOW_HEIGHT = 555;
    private  static final int  WINDOW_WIDTH = 507;
    private  static final int  WINDOW_POSX = 800;
    private  static final int  WINDOW_POSY = 300;

    JButton btnStart = new JButton("Start Server");
    JButton btnStop = new JButton("Stop Server");

    boolean isServerWork = false;

    //Map map;

    //SettingsWindow settings;



    ServerWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("ServerWindow");
        setResizable(false);


        //map = new Map();
        //settings = new SettingsWindow(this);

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWork = false;
                System.out.println(isServerWork);

            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWork = true;
                System.out.println(isServerWork);

            }
        });


        //settings.setVisible(true);

        JPanel panBottom = new JPanel(new GridLayout(1,2));
        panBottom.add(btnStart);
        panBottom.add(btnStop);


        add( panBottom);
        //add(map);

        setVisible(true);

    }

    public boolean  getStatus(){
        boolean status = this.isServerWork;
        return  status;
    }

   // void  startNewGame(int mode, int fSzX, int fSzY, int wLen){
        //map.startNewGame(mode, fSzX, fSzY, wLen);
    }

