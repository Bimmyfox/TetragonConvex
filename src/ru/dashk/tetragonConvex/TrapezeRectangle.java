package ru.dashk.tetragonConvex;

import java.util.Scanner;

/**
 * Класс "Прямоугольная трапеция", наследник класса TetragonConvex
 * Содержит методы: ввод оснований и высоты прямоугольной трапеции с клавиатуры
 * вычисление неизвестной сторону трапеции,
 * вычисление площади, периметра прямоугольной трапеции
 * @author Darya on 15.12.2015.
 * @version 1.0
 */
public class TrapezeRectangle extends TetragonConvex{

    /**
     * верхнее основание трапеции
     */
    protected double topBasis;
    /**
     * нижнее основание трапеции
     */
    protected double lowerBasis;

    /**
     * высота трапеции
     */
    protected double height;

    public double getTopBasis() {
        return topBasis;
    }
    public void setTopBasis(double topBasis) {
        this.topBasis = topBasis;
    }
    public double getLowerBasis() {
        return lowerBasis;
    }
    public void setLowerBasis(double lowerBasis) {
        this.lowerBasis = lowerBasis;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }


    /**
     * Конструктор по умолчанию:
     * верхнее основание = 3
     * нижнее основание = 4
     * высота = 2,5
     */
    public TrapezeRectangle() {
        this.topBasis = 3;
        this.lowerBasis = 4;
        this.height = 2.5;
    }


    /**
     * Конструктор явной инициализации прямоугольной трапеции
     * @param topBasis верхнее основание
     * @param lowerBasis нижнее основание
     * @param height высота
     */
    public TrapezeRectangle(double topBasis, double lowerBasis, double height) {
        this.topBasis = topBasis;
        this.lowerBasis = lowerBasis;
        this.height = height;
    }


    /**
     * Метод ввода:
     * осуществляет ввод оснований и высоты прямоугольной трапеции с клавиатуры
     */
    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нижнее основание : ");
        lowerBasis = sc.nextDouble();
        System.out.print("Введите верхнее основание: ");
        topBasis = sc.nextDouble();
        System.out.print("Введите высоту: ");
        height = sc.nextDouble();
    }


    /**
     * Метод вычисления неизвестной стороны прямоугольной трапеции
     * @return double значение стороны прямоугольной трапеции
     */
    protected double calculationSide(){
        return (Math.sqrt((height * height) + Math.pow((lowerBasis - topBasis), 2)));
    }


    /**
     * Метод вычисления периметра прямоугольной трапеции
     * @return double периметр прямоугольной трапеции
     */
    @Override
    double perimeter(){
        return (height + calculationSide() + topBasis + lowerBasis);
    }


    /**
     * Метод вычисления площади прямоугольной трапеции
     * @return double площадь прямоугольной трапеции
     */
    @Override
    double area(){
        return (((topBasis + lowerBasis) / 2) * height);
    }
}
