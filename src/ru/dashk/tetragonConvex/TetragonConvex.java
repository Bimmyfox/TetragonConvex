package ru.dashk.tetragonConvex;

/**
 * Абстрактный суперкласс "Выпуклый четырёхугольник".
 * Содержит методы: вычисление периметра, площади, ввод с клавиатуры.
 * @author Darya on 16.12.2015.
 * @version 1.0
 */
public abstract class TetragonConvex {

    /**
     * Абстрактный метод вычисления периметра
     * @return double периметр
     */
    abstract double perimeter();


    /**
     * Абстрактный метод вычисления площади
     * @return double площадь
     */
    abstract double area();


    /**
     * Абстрактный класс ввода с клавиатуры
     */
    abstract void input();
}