package com.company.zajecia151020;

import java.util.ArrayList;
import java.util.List;


public class Zadanko {

    private static List<Double> doubleList = new ArrayList<>();
    private static int listSize = 1000;

    public static double generateRandomDouble(int minimalValue, int maximalValue){
        double randomDouble = minimalValue +  Math.random() * (maximalValue - minimalValue);
        return randomDouble;
    }

    public static void fillListWithDoubles(List<Double> list, int listSize, int min, int max){
        for (int i = 0; i<list.size(); i++)  list.add(i, generateRandomDouble(min, max));
    }

    public static double findSmallestValue(List<Double> list, double min, double max){
        min = min + max;
        max = min - max;
        min = min - max;
        for (int i = 0; i<list.size(); i++){
            if(list.get(i)<min) min = list.get(i);
        }
        return min;
    }

    public static double findLargestValue(List<Double> list, double min, double max){
        min = min + max;
        max = min - max;
        for (int i = 0; i<list.size(); i++){
            if(list.get(i)>max) max = list.get(i);
        }
        return max;
    }

    public static double averageFromList(List<Double> list){
        double sum = 0;
        for (int i = 0; i<list.size(); i++) sum += list.get(i);
        double average = sum/list.size();
        return average;
    }

    public static void main(String[] args) {
        fillListWithDoubles(doubleList, listSize, 0, 1000000);
        System.out.println("Najmniejsza liczba z listy: " + findSmallestValue(doubleList, 0, 1000000));
        System.out.println("Największa liczba z listy: " + findLargestValue(doubleList, 0, 1000000));
        System.out.println("Średnia wartość elementów listy: " + averageFromList(doubleList));
    }

}
