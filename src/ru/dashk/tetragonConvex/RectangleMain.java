package ru.dashk.tetragonConvex;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс потоков RectangleMain
 * считывает из входного файла поля для прямоугольника
 * демонстрирует работу класса Rectangle
 * записывает произведённые вычисления в выходной файл
 *
 * @author Darya on 15.12.2015.
 * @version 2.0
 */
class RectangleMain extends Thread {
    @Override
    public void run() {

        //чтение из файла Rectangles.txt
        BufferedReader readerRectangle = null;
        try {
            readerRectangle = new BufferedReader(new FileReader("Rectangles.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String lineR;

        // запись в массив linesAsArray
        List<String> linesR = new ArrayList<String>();
        try {
            while (null != (lineR = readerRectangle.readLine())) {
                linesR.add(lineR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] linesAsArrayR = linesR.toArray(new String[linesR.size()]);

        //запись данных из linesAsArray в объекты
        Rectangle rectangle = new Rectangle(Double.parseDouble(linesAsArrayR[0]), Double.parseDouble(linesAsArrayR[1]));
        Rectangle rectangle2 = new Rectangle(Double.parseDouble(linesAsArrayR[2]), Double.parseDouble(linesAsArrayR[3]));

        //произведение вычислений и запись их результатов в выходной файл RectangleResult.txt
        File fileR = new File("RectangleResult.txt");
        try {
            if (!fileR.exists()) {
                fileR.createNewFile();
            }
            PrintWriter out = new PrintWriter(fileR.getAbsoluteFile());
            try {
                out.println("Прямоугольник по умолчанию.");
                out.println("Тип фигуры: " + rectangle.form());
                out.println("Боковая сторона: " + rectangle.sideLateral);
                out.println("Нижняя сторона: " + rectangle.base);
                out.println("Периметр: " + rectangle.perimeter());
                out.println("Площадь: " + rectangle.area());
                out.println("______________________");

                out.println("Тип фигуры: " + rectangle2.form());
                out.println("Боковая сторона: " + rectangle2.sideLateral);
                out.println("Нижняя сторона: " + rectangle2.base);
                out.println("Периметр: " + rectangle2.perimeter());
                out.println("Площадь: " + rectangle2.area());

            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

