package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//лист с вопросами
public class QuestionList extends DateSince_QuestionList implements ActionListener {
//создание проекта с дефолтными данными
    public QuestionList() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 550);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);

        jPanel = new JPanel(new GridBagLayout());
        getContentPane().add(jPanel);
        jLabel.setText("Вопрос #1");
        jPanel.add(jLabel, GridConstraints(0,1));
        jPanel.add(jLabelQuestion, GridConstraints(0,2));

//обьединение в группу
        Group.add(check_1);
        Group.add(check_2);
        Group.add(check_3);
        Group.add(check_4);

//вставка кнопок в панель
        Image = new ImageIcon(img[0]);
        ImageRes(Image);
        jPanel.add(jLabelImg, GridConstraints(0, 3));
        jPanel.add(check_1, GridConstraints(0, 4));
        jPanel.add(check_2, GridConstraints(0, 5));
        jPanel.add(check_3, GridConstraints(0, 6));
        jPanel.add(check_4, GridConstraints(0, 7));
        jPanel.add(resultBut, GridConstraints(0, 8));
        resultBut.addActionListener(this);
//вызов функции проверки ответов
        QuestionRealize(QuestionList, numberQuestion);
    }
//присваевыние картинкам размера
    public void ImageRes(ImageIcon image){
        Image imageRes = image.getImage().getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
        jLabelImg = new JLabel(new ImageIcon(imageRes));
    }
//присваевынее всем обьектам в проекте упорядоченое место
    public GridBagConstraints GridConstraints(int x, int y){
        GridBagConstraints Grid = new GridBagConstraints();
        Grid.gridx = x;
        Grid.gridy = y;
        Grid.insets = new Insets(5,5,5,5);
        return Grid;
    }
//присваевывание вопросов
    public void QuestionRealize(String[][] arr, int numberQuestion){
        if (check_1.getText().isEmpty()){
            check_1.setText(arr[numberQuestion-1][0]);
            check_2.setText(arr[numberQuestion-1][1]);
            check_3.setText(arr[numberQuestion-1][2]);
            check_4.setText(arr[numberQuestion-1][3]);
        }
    }
//сравнивание правильности ответов
    @Override
    public void actionPerformed(ActionEvent e) {
        Group.clearSelection();
        if(numberQuestion == 10){
            JOptionPane.showMessageDialog(null, "Поздравляю, вы прошли тест");
            System.exit(0);
        }
        if(check_1.getText().equals(answer[numberQuestion-1]) && check_1.isSelected()){
            JOptionPane.showMessageDialog(null, "правильно");
            check_1.setText("");
            check_2.setText("");
            check_3.setText("");
            check_4.setText("");
            numberQuestion++;
            jLabel.setText("Вопрос #"+numberQuestion);
            Image.setImage(new ImageIcon(img[numberQuestion-1]).getImage());
            jLabelImg.setIcon(Image);
            jPanel.add(jLabel, GridConstraints(0,1));
        }
        else if(check_2.getText().equals(answer[numberQuestion-1]) && check_2.isSelected()){
            JOptionPane.showMessageDialog(null, "правильно");
            check_1.setText("");
            check_2.setText("");
            check_3.setText("");
            check_4.setText("");
            numberQuestion++;
            jLabel.setText("Вопрос #"+numberQuestion);Image.setImage(new ImageIcon(img[numberQuestion-1]).getImage());
            jLabelImg.setIcon(Image);
            jPanel.add(jLabel, GridConstraints(0,1));
        }
        else if(check_3.getText().equals(answer[numberQuestion-1]) && check_3.isSelected()){
            JOptionPane.showMessageDialog(null, "правильно");
            check_1.setText("");
            check_2.setText("");
            check_3.setText("");
            check_4.setText("");
            numberQuestion++;
            jLabel.setText("Вопрос #"+numberQuestion);
            Image.setImage(new ImageIcon(img[numberQuestion-1]).getImage());
            jLabelImg.setIcon(Image);
            jPanel.add(jLabel, GridConstraints(0,1));
        }
        else if(check_4.getText().equals(answer[numberQuestion-1]) && check_4.isSelected()){
            JOptionPane.showMessageDialog(null, "правильно");
            check_1.setText("");
            check_2.setText("");
            check_3.setText("");
            check_4.setText("");
            numberQuestion++;
            jLabel.setText("Вопрос #"+numberQuestion);
            Image.setImage(new ImageIcon(img[numberQuestion-1]).getImage());
            jLabelImg.setIcon(Image);
            jPanel.add(jLabel, GridConstraints(0,1));
        }
        else {
            JOptionPane.showMessageDialog(null, "не правильно");
        }
        QuestionRealize(QuestionList, numberQuestion);
    }
}