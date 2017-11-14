package ru.dashk.tetragonConvex;

/**
 * Класс демонструрует работу иерархии классов "Выпуклый четырёхугольник",
 * создаёт экземпляр класса потоков ParallelogramsMain и запускает его,
 * создаёт экземпляр класса потоков RectangleMain и запускает его
 * @author Darya on 15.12.2015.
 * @version 2.0
 */
public class Main {
    public static void main(String[] args) {

        //Создание экземпляра класса потоков ParallelogramsMain и его запуск
        ParallelogramsMain parallelogramsMain = new ParallelogramsMain();
        parallelogramsMain.start();


        //Создание экземпляра класса потоков RectangleMain и его запуск
        RectangleMain rectangleMain = new RectangleMain();
        rectangleMain.start();

        TrapezeRectangle trapeze = new TrapezeRectangle();
        System.out.println("______________________");
        System.out.println("Прямоугольная трапеция по умолчанию.");
        System.out.println("Нижнее основание: " + trapeze.lowerBasis);
        System.out.println("Верхнее основание: " + trapeze.topBasis);
        System.out.println("Высота: " + trapeze.height);
        System.out.println("Вычисленная сторона: " + trapeze.calculationSide());
        System.out.println("Периметр: " + trapeze.perimeter());
        System.out.println("Площадь: " + trapeze.area());
        System.out.println("______________________");

        TrapezeRectangle trapeze_rectangle = new TrapezeRectangle(3, 4, 2.7);
        trapeze_rectangle.input();
        System.out.println("Вычисленная сторона: " + trapeze_rectangle.calculationSide());
        System.out.println("Периметр: " + trapeze_rectangle.perimeter());
        System.out.println("Площадь: " + trapeze_rectangle.area());
        System.out.println("______________________");

        TrapezeSimple trapeze_simple = new TrapezeSimple();
        System.out.println("______________________");
        System.out.println("Обычная трапеция по умолчанию.");
        System.out.println("Нижнее основание: " + trapeze_simple.lowerBasis);
        System.out.println("Верхнее основание: " + trapeze_simple.topBasis);
        System.out.println("Высота: " + trapeze_simple.height);
        System.out.println("Вычисленная сторона: " + trapeze_simple.calculationSide());
        System.out.println("Вычисленная сторона 2: " + trapeze_simple.calculationSide2());
        System.out.println("Периметр: " + trapeze_simple.perimeter());
        System.out.println("Площадь: " + trapeze_simple.area());
        System.out.println("______________________");

        TrapezeSimple trapeze_simple1 = new TrapezeSimple(3, 4, 2.7);
        trapeze_simple.input();
        System.out.println("Вычисленная сторона: " + trapeze_simple1.calculationSide());
        System.out.println("Вычисленная сторона 2: " + trapeze_simple1.calculationSide2());
        System.out.println("Периметр: " + trapeze_simple1.perimeter());
        System.out.println("Площадь: " + trapeze_simple1.area());
        System.out.println("______________________");

        TrapezeIsosceles trapeze_isosceles = new TrapezeIsosceles();
        System.out.println("______________________");
        System.out.println("Равнобедренная трапеция по умолчанию.");
        System.out.println("Нижнее основание: " + trapeze_isosceles.lowerBasis);
        System.out.println("Верхнее основание: " + trapeze_isosceles.topBasis);
        System.out.println("Высота: " + trapeze_isosceles.height);
        System.out.println("Вычисленная сторона: " + trapeze_isosceles.calculationSide());
        System.out.println("Периметр: " + trapeze_isosceles.perimeter());
        System.out.println("Площадь: " + trapeze_isosceles.area());
        System.out.println("______________________");

        TrapezeIsosceles trapeze_isosceles1 = new TrapezeIsosceles(3, 4, 2.7);
        trapeze_isosceles.input();
        System.out.println("Вычисленная сторона: " + trapeze_isosceles1.calculationSide());
        System.out.println("Периметр: " + trapeze_isosceles1.perimeter());
        System.out.println("Площадь: " + trapeze_isosceles1.area());
        System.out.println("______________________");
    }
}
