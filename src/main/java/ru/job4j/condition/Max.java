package ru.job4j.condition;

    public class Max {
        public static int max(int left, int right) {
            int max = left >= right ? left : right;
            return max;
        }

        public static void main(String[] args) {
            int max = Max.max(4, 9);
            System.out.println(max);
            max = Max.max(7, 3);
            System.out.println(max);
            max = Max.max(5, 5);
            System.out.println(max);
        }
    }