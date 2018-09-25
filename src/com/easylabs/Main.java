package com.easylabs;

import java.util.Scanner;

import  java.util.Random ; // подключение генератора рандомных чисел
import  java.util.Scanner ; // подключение ввода
import  java.util.Arrays ; // работа с массивами

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            byte section = 0;

            while (true) {
                System.out.println("Лаб.работа №2.\n" +
                        "Выберите Задание:");
                System.out.println("1.Возведение двойки в степень");
                System.out.println("2.Расчитать факториал для n (n<10)");
                System.out.println("3.Разность,сумма и произвидение вещественных чисел");
                System.out.println("4.Вычисление времени свободного падения тела");
                System.out.println("5.Решение задачи с помощью теоремы Пифагора");


                section = scan.nextByte();
                switch (section) {

                    case 1:
                        theDegreeOfTwo();
                        break;
                    case 2:
                        Fact();
                        break;
                    case 3:
                        RealNumbers();
                        break;
                    case 4:
                        Freefall();
                        break;
                    case 5:
                        PethagoreanTheorem();
                        break;

                    default:
                        System.out.println("Некорректно указанное действие.");
                }
            }
        }


        public static void Fact() {
            Scanner scan = new Scanner(System.in);
            double n = 0;
            double fact = 1;
            System.out.println("Вычисление факториала.\n" +
                    "Введите произвольное число n\n" +
                    "(n должно быть меньше десяти)");
            n = scan.nextDouble();
            for (int i = 1; i < n + 1; i++) {
                fact *= i;
            }
            System.out.println("Значение факториала : " + fact);
        }

        public static void RealNumbers() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Вычисление суммы, разности и произведения двух вещественных чисел.");
            double num1 = 0;
            double num2 = 0;
            double summ = 0;
            double difference = 0;
            double op = 0;
            System.out.println("Введите два числа: \nx1=");
            num1 = scan.nextDouble();
            System.out.println("x2= ");
            num2 = scan.nextDouble();

            summ = num1 + num2;
            difference = num1 - num2;
            op = num1 * num2;
            System.out.println("Резултат: " +
                    "Сумма= " + summ +
                    "Разность= " + difference +
                    "Произведение=" + op);
        }

        public static void Freefall() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Вычисление время свободноо падения тела с произвольной высоты.");
            double g = 9.81523;
            double FallTime = 0;
            double h = 0;

            System.out.println("Задайте высоту:");
            h = scan.nextDouble();

            FallTime = Math.sqrt(2 * h / g);
            System.out.println("Время свободного падения="
                    + FallTime);

        }

        public static void PethagoreanTheorem() {
            Scanner scan = new Scanner(System.in);
            byte MethodOfSolution = 0;
            System.out.println("Решение задачи при помощи теоремы Пифагора.");

            System.out.println("1-Вычисление длины  гипотенузы треуголька по заданным катетам.");
            System.out.println("2-Вычисление длины  одного из катетов по гипотенузе и известному катету.");
            do {
                System.out.println("Выберите метод решения:");
                MethodOfSolution = scan.nextByte();
                if (MethodOfSolution == 1
                        || MethodOfSolution == 2)
                    break;

                System.out.println("Неверно указанный метод решения.");
            } while (true);
            double a = 0;
            double b = 0;
            double c = 0;

            if (MethodOfSolution == 1) {
                System.out.println("Вычисление длины  гипотенузы треуголька по заданным катетам.");
                System.out.println("Задайте катеты треугольника:");
                a = scan.nextDouble();
                b = scan.nextDouble();
                c = Math.sqrt(a * a + b * b);
                System.out.println("Гипотенуза равна " + c + " .");

            } else if (MethodOfSolution == 2) {
                System.out.println("Вычисление длины  одного из катетов по гипотенузе и известному катету.");
                do {
                    System.out.println("Задайте гипотенузу  треугольника:");
                    c = scan.nextDouble();
                    System.out.println("Задайте известный катет   треугольника:");
                    a = scan.nextDouble();
                    if (c > a)
                        break;
                    System.out.println("Некоректный ввод. Катет не может быть равен или длиннее  гипотенузы!");
                } while (true);

                b = Math.sqrt(c * c - a * a);
                System.out.println("Искомый катет равен " + b + " .");
            }


        }

        public static void theDegreeOfTwo(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Возведение двойки в степень.");
            int n=0;
            double result=0;
            System.out.println("Введите степень :");
            n=scan.nextInt();

            result=Math.pow(2,n);

            System.out.println("2 в степени "+n+" = "+ result);
        }




    }



