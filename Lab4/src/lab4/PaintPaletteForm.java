package lab4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class PaintPaletteForm extends JPanel {

    private static Color[] array;

    PaintPaletteForm() {
       //Вызываем в конструкторе метод,заполняющий массив цветов
        setArray();
    }
//Переопределяем метод,который отвечает за непосредственную отрисовку палитры
    @Override
    protected void paintComponent(Graphics gh) {
        super.paintComponent(gh);
        Graphics2D gr2d = (Graphics2D) gh;
        //Высота изображения
        double hd = 42;
        int x = 0;
        //Проходим по граням куба и заполняем палитру в соответствие с методическими указаниями
        for (int color = 0; color < 256; color++) {
            gr2d.setColor(new Color(0, 0, color));
            gr2d.drawLine((int) x, 0, (int) x, (int) hd);
            x++;
        }
        for (int color = 0; color < 256; color++) {
            gr2d.setColor(new Color(0, color, 255));
            gr2d.drawLine((int) x, 0, (int) x, (int) hd);
            x++;
        }
        for (int color = 255; color > -1; color--) {
            gr2d.setColor(new Color(0, 255, color));
            gr2d.drawLine((int) x, 0, (int) x, (int) hd);
            x++;
        }
        for (int color = 0; color < 256; color++) {
            gr2d.setColor(new Color(color, 255, 0));
            gr2d.drawLine((int) x, 0, (int) x, (int) hd);
            x++;
        }
        for (int color = 255; color > -1; color--) {
            gr2d.setColor(new Color(255, color, 0));
            gr2d.drawLine((int) x, 0, (int) x, (int) hd);
            x++;
        }
    }
//Метод, который возвращает цвет пикселя нужного номера
    static public Color getColor(int i) {
        return array[i];
    }
//Метод, заполняющий массив цветов,(так же проходя по граням куба в соответствие с методическими указаниями)
    private void setArray() {
        int x = 0;
        array = new Color[1280];
        int n = 0;
        for (int color = 0; color < 256; color++) {
            array[n] = new Color(0, 0, color);
            n++;
        }
        for (int color = 0; color < 256; color++) {
            array[n] = new Color(0, color, 255);
            n++;
        }
        for (int color = 255; color > -1; color--) {
            array[n] = new Color(0, 255, color);
            n++;
        }
        for (int color = 0; color < 256; color++) {
            array[n] = new Color(color, 255, 0);
            n++;
        }
        for (int color = 255; color > -1; color--) {
            array[n] = new Color(255, color, 0);
            n++;
        }
    }

}
