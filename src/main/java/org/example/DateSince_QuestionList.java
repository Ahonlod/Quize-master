package org.example;

import javax.swing.*;

public class DateSince_QuestionList extends JFrame {
    protected JPanel jPanel;
    protected ImageIcon Image = new ImageIcon();
    protected JLabel jLabelImg = new JLabel();
    protected JLabel jLabel = new JLabel();
    protected JLabel jLabelQuestion = new JLabel("Какой знак представлен на картинке");
    protected JButton resultBut = new JButton("проверка");
    protected int numberQuestion = 1;
    protected JRadioButton check_1 = new JRadioButton();
    protected JRadioButton check_2 = new JRadioButton();
    protected JRadioButton check_3 = new JRadioButton();
    protected JRadioButton check_4 = new JRadioButton();
    protected ButtonGroup Group = new ButtonGroup();
    protected String[] img = {"src/img/image_1.png",
            "src/img/image_2.jpg",
            "src/img/image_3.png",
            "src/img/image_4.png",
            "src/img/image_5.jpeg",
            "src/img/image_6.png,",
            "src/img/image_7.jpeg",
            "src/img/image_8.png",
            "src/img/image_9.png",
            "src/img/image_10.jpg"
    };
    protected String[] answer = {
            "2. пешеходный переход",
            "3. въезд запрещен",
            "3. место для инвалидов",
            "1. светофорное регулирование",
            "2. обгон запрещен",
            "4. конец ограничения максимальной скорости",
            "1. стоянка запрещена",
            "1. движение запрещено",
            "3. сужение дороги",
            "4. сужение дороги"
    };
    protected String[][] QuestionList = new String[][]{
            {"1. проезд запрещен","2. пешеходный переход", "3. место для инвалидов", "4. осторожно олень"},
            {"1. пешеходный переход", "2. платная дорога", "3. въезд запрещен", "4. место для инвалидов"},
            {"1. железнодорожный переезд со шлагбаумом", "2. пешеходный переход", "3. место для инвалидов", "4. пересечение с трамвайной линией"},
            {"1. светофорное регулирование", "2. пешеходный переход", "3. шлагбаум", "4. автобусная остановка"},
            {"1. поворот налево запрещен","2. обгон запрещен","3. разворот запрещен","4. поворот направо запрещен"},
            {"1. ограничение максимальной скорости","2. ограничение минимальной дистанции","3. подача звукового сигнала запрещена","4. конец ограничения максимальной скорости"},
            {"1. стоянка запрещена","2. остановка запрещена","3. парковка запрещена","4. движение запрещено"},
            {"1. движение запрещено","2. круговое движение","3. уступите дорогу","4. движение без остановки запрещено"},
            {"1. пересечение второстепенной дорогой","2. примыкание второстепенной дорогой","3. сужение дороги","4. конец всех ограничений"},
            {"1. проезд запрещен","2. остановка запрещена","3. уступите дорогу","4. сужение дороги"},
    };
}
