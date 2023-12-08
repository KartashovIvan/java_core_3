package org.example.homework.first;

import static org.example.homework.first.Product.HAM;
import static org.example.homework.first.Product.NECK;
import static org.example.homework.first.Product.SAUSAGE;
import static org.example.homework.first.TaxRates.TAX_BEFORE_MILLION;
import static org.example.homework.first.TaxRates.TAX_BEFORE_TWO_MILLION;

public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        String name = "     ПЕтРов Олег Иванович     ";
        String formattedName = name.trim().toUpperCase();
        if (formattedName.contains("ова ".toUpperCase())) {
            System.out.println("Уважаемая " + formattedName);
        } else if (formattedName.contains("ов ".toUpperCase())) {
            System.out.println("Уважаемый " + formattedName);
        } else {
            System.out.println("Неизвестное лицо " + formattedName);
        }
    }

    public static void ex2() {
        //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = false;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;
        if (
                fuel >= 10
                        && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !hasErrors
                        && isEngineWork
        ) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        String simply = "this is simply. This is my favorite song.";
        String replacedSimply = simply.toLowerCase().replaceAll("this is", "those are");
        int indexOfO = replacedSimply.indexOf("o", replacedSimply.indexOf("o") + 1);
        System.out.println(indexOfO);
    }

    public static void ex4() {
        int sausageQty = 2000;
        int sausageCost = getProductCost(SAUSAGE, sausageQty);

        int hamQty = 8511;
        int hamCost = getProductCost(HAM, hamQty);

        int neckQty = 6988;
        int neckCost = getProductCost(NECK, neckQty);

        long income = calcTotal(
                new int[]{SAUSAGE.getPrice(), HAM.getPrice(), NECK.getPrice()},
                new int[]{sausageQty, hamQty, neckQty}
        );

        int overheads = 1_000_000;
        long outcome = calcOutcome(
                new int[]{sausageCost, hamCost, neckCost},
                new int[]{sausageQty, hamQty, neckQty},
                overheads
        );

        long profitBeforeTaxes = income - outcome;

        double totalTax = calcTax(profitBeforeTaxes);
        System.out.println("Прибыль после налога: " + (profitBeforeTaxes - totalTax));
    }

    private static double calcTax(long profitBeforeTaxes) {
        if (profitBeforeTaxes < 0) {
            return 0;
        }

        double totalTax;
        long firstLimit = TAX_BEFORE_MILLION.getLimit();
        double taxBeforeMillion = TAX_BEFORE_MILLION.getTaxRate();
        long secondLimit = TAX_BEFORE_TWO_MILLION.getLimit();
        double taxBeforeTwoMillion = TAX_BEFORE_TWO_MILLION.getTaxRate();
        double taxAfterTwoMillion = TaxRates.TAX_AFTER_TWO_MILLION.getTaxRate();
        if (profitBeforeTaxes <= firstLimit) {
            totalTax = profitBeforeTaxes * taxBeforeMillion;
        } else if (profitBeforeTaxes > firstLimit && profitBeforeTaxes <= secondLimit) {
            double totalTaxBeforeMillion = firstLimit * taxBeforeMillion;
            totalTax = (profitBeforeTaxes - firstLimit) * taxBeforeTwoMillion + totalTaxBeforeMillion;
        } else {
            double totalTaxBeforeMillion = firstLimit * taxBeforeMillion;
            double totalTaxBeforeTwoMillion = (secondLimit - firstLimit - 1) * taxBeforeTwoMillion + taxBeforeMillion;
            totalTax = (profitBeforeTaxes - secondLimit) * taxAfterTwoMillion
                    + totalTaxBeforeMillion + totalTaxBeforeTwoMillion;
        }
        return totalTax;
    }

    private static long calcTotal(int[] prices, int[] count) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            result += prices[i] * count[i];
        }
        return result;
    }

    private static long calcOutcome(int[] prices, int[] count, long overheads) {
        return calcTotal(prices, count) + overheads;
    }


    private static int getProductCost(Product product, int countProduct) {
        if (product == SAUSAGE) {
            if (countProduct < 1000) {
                return 412;
            } else if (countProduct >= 1000 && countProduct < 2000) {
                return 408;
            }
            return 404;
        } else if (product == Product.HAM) {
            return 275;
        } else if (product == Product.NECK) {
            return countProduct < 500 ? 311 : 299;
        }
        throw new RuntimeException("Неизвестный тип продукта");
    }
}
