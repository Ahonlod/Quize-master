package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//главная страница
public class EnterList extends DateSince implements ActionListener {
    public EnterList(){
        //создание начального листа
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setLayout(null);
        setLocationRelativeTo(null);
        //вставка кнопки и текста
        jText.setBounds(70,100,300,30);
        add(jText);
        jBut.setBounds(150,150,100,30);
        add(jBut);
        jName.setBounds(190, 200, 100, 30);
        add(jName);
        //присваевание слушателя кнопки
        jBut.addActionListener(this);
        //вывод
        setVisible(true);
    }
    //реализация слушателя
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Start")){
            setVisible(false);
            QuestionList list = new QuestionList();
            list.setVisible(true);
        }
    }
}
