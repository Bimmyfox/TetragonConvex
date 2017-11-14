package ru.dashk.tetragonConvex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс потоков ParallelogramsMain
 * считывает из входного файла поля для параллелограммов
 * демонстрирует работу класса Parallelogram
 * записывает произведённые вычисления в выходной файл
 *
 * @author Darya on 15.12.2015.
 * @version 2.0
 */

class ParallelogramsMain extends Thread {
    @Override
    public void run() {

        //чтение из файла parallelograms.txt
        BufferedReader readerParallelograms = null;
        try {
            readerParallelograms = new BufferedReader(new FileReader("Parallelograms.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;

        // запись в массив linesAsArray
        List<String> lines = new ArrayList<String>();
        try {
            while (null != (line = readerParallelograms.readLine())) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] linesAsArray = lines.toArray(new String[lines.size()]);

        //запись данных из linesAsArray в объекты
        Parallelogram parallelogram = new Parallelogram(Double.parseDouble(linesAsArray[0]), Double.parseDouble(linesAsArray[1]), Double.parseDouble(linesAsArray[2]));
        Parallelogram parallelogram1 = new Parallelogram(Double.parseDouble(linesAsArray[3]), Double.parseDouble(linesAsArray[4]), Double.parseDouble(linesAsArray[5]));

        //произведение вычислений и запись их результатов в выходной файл ParallelogramsResult.txt
        File file = new File("ParallelogramsResult.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.println("Параллелограмм по умолчанию.");
                out.println("Тип фигуры: " + parallelogram.form());
                out.println("Боковая сторона: " + parallelogram.getHeight());
                out.println("Основание: " + parallelogram.base);
                out.println("Высота: " + parallelogram.base);
                out.println("Периметр: " + parallelogram.perimeter());
                out.println("Площадь: " + parallelogram.area());
                out.println("______________________");

                out.println("Тип фигуры: " + parallelogram1.form());
                out.println("Боковая сторона: " + parallelogram1.getHeight());
                out.println("Основание: " + parallelogram1.base);
                out.println("Высота: " + parallelogram1.base);
                out.println("Периметр: " + parallelogram1.perimeter());
                out.println("Площадь: " + parallelogram1.area());
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



