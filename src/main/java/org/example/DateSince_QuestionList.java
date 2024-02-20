package org.example;

import javax.swing.*;

public class DateSince_QuestionList extends JFrame {
    protected JPanel jPanel;
    protected ImageIcon Image = new ImageIcon();
    protected JLabel jLabelImg = new JLabel();
    protected JLabel jLabel = new JLabel("");
    protected JButton resultBut = new JButton("проверка");
    protected int numberQuestion = 1;
    protected JRadioButton check_1 = new JRadioButton();
    protected JRadioButton check_2 = new JRadioButton();
    protected JRadioButton check_3 = new JRadioButton();
    protected JRadioButton check_4 = new JRadioButton();
    protected ButtonGroup Group = new ButtonGroup();
    protected String[] img = {"src/img/image_1.png","src/img/image_2.jpg","src/img/image_3.png","src/img/image_4.png"};
    protected String[] answer = {"2. пешеходный переход", "3. проезд запрещен", "3. место для инвалидов", "1. светофорное регулирование"};
    protected String[][] QuestionList = new String[][]{
            {"1. проезд запрещен","2. пешеходный переход", "3. место для инвалидов", "4. осторожно олень"},
            {"1. пешеходный переход", "2. платная дорога", "3. проезд запрещен", "4. место для инвалидов"},
            {"1. железнодорожный переезд со шлагбаумом", "2. пешеходный переход", "3. место для инвалидов", "4. пересечение с трамвайной линией"},
            {"1. светофорное регулирование", "2. пешеходный переход", "3. шлагбаум", "4. автобусная остановка"}
    };
}
