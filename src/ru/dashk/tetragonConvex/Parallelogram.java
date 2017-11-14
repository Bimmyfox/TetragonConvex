package ru.dashk.tetragonConvex;

import java.util.Scanner;


/**
 * Класс "Параллелограмм", наследник класса Rectangle.
 * Содержит методы: ввод сторон параллелограмма и его высоты с клавиатуры
 * определение типа параллелограмма: ромб или параллелограмм,
 * вычисление площади и периметра параллелограмма
 * @author Darya on 16.12.2015.
 * @version 1.0
 */
public class Parallelogram extends Rectangle {

    /**
     * height - высота
     */
    private double height;

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getSideLateral() {
        return sideLateral;
    }
    public void setSideLateral(double sideLateral) {
        this.sideLateral = sideLateral;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }


    /**
     * Контруктор по умолчанию.
     * Устанавливает значение боковой стороны и основания = 5, высота = 7
     */
    public Parallelogram() {
        this.base = this.sideLateral = 5;
        this.height = 7;
    }


    /**
     * Конструктор явной инициализации параллелограмма
     * @param base double основание парллелограмма
     * @param side_lateral double боковая сторона параллелограмма
     * @param height double высота параллелограмма
     */
    public Parallelogram(double base, double side_lateral, double height) {
        this.base = base;
        this.sideLateral = side_lateral;
        this.height = height;
    }


    /**
     * Метод ввода:
     * осуществляет ввод основания, стороны и высоты параллелограмма с клавиатуры
     */
    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нижнюю сторону(основание): ");
        base = sc.nextDouble();
        System.out.print("Введите боковую сторону: ");
        sideLateral = sc.nextDouble();
        System.out.print("Введите высоту: ");
        height = sc.nextDouble();
    }


    /**
     * Метод определения типа фигуры
     * @return String "Ромб", если основание и боковая сторона равны,
     * String "Параллелограмм", если основание и боковая сторона не равны
     */
    protected String form(){
        if (sideLateral == base) {
            return ("ромб.");
        }
        else {return ("параллелограм.");}
    }


    /**
     * Метод вычисления периметра параллелограмма
     * @return double вычисленный периметр
     */
    @Override
    protected double perimeter() {
        return ((sideLateral + base) * 2);
    }


    /**
     * Метод вычисления площади параллелограмма
     * @return double вычисленная площадь
     */
    @Override
    protected double area() {
        return (base * height);
    }
}
