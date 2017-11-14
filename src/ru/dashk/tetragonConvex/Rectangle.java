package ru.dashk.tetragonConvex;

import java.util.Scanner;

/**
 * Класс "Прямоугольник", наследник абстрактного суперкласса TetragonConvex.
 * Содержит методы: ввод сторон прямоугольника с клавиатуры,
 * определение типа прямоугольника: квадрат или прямоугольник,
 * вычисление площади и периметра прямоугольника.
 * @author Darya on 17.12.2015.
 * @version 1.0
 */
public class Rectangle extends TetragonConvex{

    /**
     * base - нижняя сторона прямоугольника
     */
    protected double base;

    /**
     * sideLateral - боковая сторона прямоугольника
     */
    protected double sideLateral;

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


    /**
     * Контруктор по умолчанию.
     * Основание, боковая сторона = 5
     */
    public Rectangle() {
        this.base = this.sideLateral = 5;
    }


    /**
     * Конструктор явной инициализации прямоугольника
     * @param base double основание
     * @param sideLateral double боковая сторона
     */
    public Rectangle(double base, double sideLateral) {
        this.base = base;
        this.sideLateral = sideLateral;
    }


    /**
     * Метод ввода:
     * осуществляет ввод сторон прямоугольника с клавиатуры
     */
    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нижнюю сторону(основание): ");
        base = sc.nextDouble();
        System.out.print("Введите боковую сторону: ");
        sideLateral = sc.nextDouble();
    }


    /**
     * Метод определения типа фигуры
     * @return String "Квадрат", если стороны равны, String "Прямоугольник", если стороны не равны
     */
    protected String form(){
        if (sideLateral == base) {
            return ("квадрат.");
        }
        else return ("прямоугольник.");
    }


    /**
     * Метод вычисления периметра прямоугольника
     * @return double вычисленный периметр
     */
    @Override
    protected double perimeter() {
        return ((sideLateral + base) * 2);
    }


    /**
     * Метод вычисления площади прямоугольника
     * @return double вычисленная площадь
     */
    @Override
    protected double area() {
        return (sideLateral * base);
    }
}
