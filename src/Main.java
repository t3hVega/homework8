public class Main {
    public static void main(String[] args) {
        tasks();
    }
    public static void tasks() {
        System.out.println("Задача 1-2:");
        int array1 [] = new int [3];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;
        double array2 [] = {1.57, 7.654, 9.986};
        int array3 [] = {19, 32, 100, 439};
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println(array1[array1.length - 1]);
        for (int i = 0; i < array2.length - 1; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println(array2[array2.length - 1]);
        for (int i = 0; i < array3.length - 1; i++) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println(array3[array3.length - 1]);
        System.out.println("Задача 3:");
        for (int i = array1.length - 1; i > 0; i--) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println(array1[0]);
        for (int i = array2.length - 1; i > 0; i--) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println(array2[0]);
        for (int i = array3.length - 1; i > 0; i--) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println(array3[0]);
        System.out.println("Задача 4:");
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
                System.out.print(array1[i] + ", ");
            } else System.out.print(array1[i] + ", ");
        }
        if (array1[array1.length - 1] % 2 != 0) {
            array1[array1.length - 1] = array1[array1.length - 1] + 1;
            System.out.println(array1[array1.length - 1]);
        } else System.out.println(array1[array1.length - 1]);
    }
}