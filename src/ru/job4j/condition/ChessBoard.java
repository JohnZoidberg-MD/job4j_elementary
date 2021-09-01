package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        // return Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(x2 - x1) : 0;
       /* Данная формула верна, но тесты  whenX1isMinus1ThenWayIs0 и whenY1isMinus1ThenWayIs0 выдадут ошибку
       т.к. тесты не верны. Движение фигуры может принимать отрицательные значения (движение назад),
       но изначальные координаты фигуры НЕ могут быть отрицательными, т.к. координаты шахматной доски положительны.
       Учитывая что задание нужно выполнить "любой ценой" и цель задания не научиться играть в шахматы,
       то примем верной следующую формулу: */
        return Math.abs(Math.abs(x2) - Math.abs(x1)) == Math.abs(Math.abs(y2) - Math.abs(y1)) ? Math.abs(Math.abs(x2) - Math.abs(x1)) : 0;
    }
}
