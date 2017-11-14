package ru.dashk.tetragonConvex;


/**
 * Класс "Обычная трапеция", наследник класса TrapezeRectangle
 * Содержит методы: вычисление неизвестных сторон обычной трапеции
 * вычисление площади, периметра обычной трапеции
 * @author Darya on 17.12.2015.
 * @version 1.0
 */
public class TrapezeSimple extends TrapezeRectangle{

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
private double side = calculationSide();

/**
 * Конструктор по умолчанию:
 * верхнее основание = 3
 * нижнее основание = 4
 * высота = 2,5
 */
public TrapezeSimple() {
        this.topBasis = 3;
        this.lowerBasis = 4;
        this.height = 2.5;
        }


/**
 * Конструктор явной инициализации обычной трапеции
 * @param topBasis верхнее основание
 * @param lowerBasis нижнее основание
 * @param height высота
 */
public TrapezeSimple(double topBasis, double lowerBasis, double height) {
        this.topBasis = topBasis;
        this.lowerBasis = lowerBasis;
        this.height = height;
        }


/**
 * Метод вычисления второй неизвестной стороны обычной трапеции
 * @return double значение второй неизветной стороны
 */
protected double calculationSide2(){
        return Math.round(Math.sqrt((height * height) + (lowerBasis - (topBasis + (Math.sqrt(side) - (height * height))))));
        }


/**
 * Метод вычисления периметра обычной трапеции
 * @return double периметр обычной трапеции
 */
@Override
    double perimeter(){
            return (calculationSide() + calculationSide2() + topBasis + lowerBasis);
            }


/**
 * Метод вычисления площади обычной трапеции
 * @return double площадь обычной трапеции
 */
@Override
    double area(){
            return (((topBasis + lowerBasis) / 2) * height);
            }
            }
