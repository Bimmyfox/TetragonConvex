package ru.dashk.tetragonConvex;

/**
 * Класс "Равнобедренная трапеция", наследник класса TrapezeRectangle.
 * Содержит методы: вычисление неизвестной стороны трапеции
 * вычисление площади, периметра равнобедренной трапеции
 * @author Darya on 17.12.2015.
 * @version 1.0
 */
public class TrapezeIsosceles extends TrapezeRectangle {

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
    public TrapezeIsosceles() {
        this.topBasis = 3;
        this.lowerBasis = 4;
        this.height = 2.5;
    }


    /**
     * Конструктор явной инициализации равнобедренной трапеции
     * @param topBasis double верхнее основание
     * @param lowerBasis double нижнее основание
     * @param height double высота
     */
    public TrapezeIsosceles(double topBasis, double lowerBasis, double height) {
        this.topBasis = topBasis;
        this.lowerBasis = lowerBasis;
        this.height = height;
    }


    /**
     * Метод вычисления периметра равнобедренной трапеции
     * @return double периметр равнобедренной трапеции
     */
    @Override
    double perimeter(){
        return (calculationSide() * 2 + topBasis + lowerBasis);
    }


    /**
     * Метод вычисления площади равнобедренной трапеции
     * @return double площадь равнобедренной трапеции
     */
    @Override
    double area(){
        return (((topBasis + lowerBasis) / 2) * height);
    }
}
