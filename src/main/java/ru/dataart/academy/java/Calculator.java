package ru.dataart.academy.java;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {

        return reverse(firstNumber) + reverse(secondNumber);
    }

    private Integer reverse(List<Integer> number) {
        int num = 0;
        for (int i = 0; i < number.size(); i++) {
            num += (number.get(i) * (int) Math.pow(10, i));
        }
        return num;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> list2 = new ArrayList<>(list);
        Iterator iterator = list2.iterator();
              int count=0;
              while (iterator.hasNext())
              {
                  iterator.next();
                  if (count%2!=0){ iterator.remove();}
                  count++;
              }
              return list2;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        List<T> list2 = new ArrayList<>(list);

        Iterator iterator= list2.iterator();
        for (int i = 0; i <2 ; i++) {
            if (!(iterator.hasNext())) return list2;
            iterator.next();
        }

        while (iterator.hasNext())
        {
            iterator.remove();
            iterator.next();
        }



        return list2;
    }
}
