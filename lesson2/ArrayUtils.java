package lesson2;

import java.util.Random;

public class ArrayUtils {

    private static Random random = new Random();

    /**
     * Подготовить массив случайных чисел
     * @return
     */
    public static int[] prepareArray(){
        return prepareArray(random.nextInt(6) + 10);
    }

    /**
     * Подготовить массив случайных чисел
     * @param length размерность массива
     * @return
     */
    public static int[] prepareArray(int length){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(199) - 99;
        }
        return array;
    }

    /**
     * Печать массива на экран
     * @param array
     */
    public static void printArray(int[] array){
        for (int e : array){
            System.out.printf("%d\t", e);
        }
        System.out.println();
    }

}
