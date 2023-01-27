//package Seminar_2;
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
public class Task_2 {

        public static void main(String[] args) {
            String s = "Dcba";
            final int[] index = new int[] { 3, 2, 1, 4 };
            System.out.println(shuffle(s, index));
        }

        public static String shuffle(final String s, final int[] index) {
            String outputResult = "";
            String temp = "";
            for (int i = 0; i < index.length; i++) {
                outputResult = outputResult + s.charAt(index[i] - 1);
            }
            return outputResult;
        }
}

/*
 * public static void main(String[] args) {
 * String jewels = "aB";
 * String stones = "aaaAbbbB";
 * System.out.println(findJewelsInStones(jewels, stones));
 * }
 * 
 * public static String findJewelsInStones(String jewels, String stones) {
 * String outputResult = "";
 * int counter = 0;
 * for (int i = 0; i < jewels.length(); i++) {
 * for (int j = 0; j < stones.length(); j++) {
 * if (jewels.charAt(i) == stones.charAt(j)) {
 * counter++;
 * }
 * 
 * }
 * outputResult = outputResult + jewels.charAt(i) + counter;
 * counter = 0;
 * }
 * return outputResult;
 * }}
 * 
 * От Easy
 * TRADing всем 10:42 AM
 * 
 * public class Main {
 * public static void main(String[] args) {
 * String s = "Dcba";
 * final int[] index = new int[]{3, 2, 1, 4};
 * System.out.println(shuffle(s, index));
 * }
 * 
 * public static String shuffle(final String s, final int[] index) {
 * String outputResult = "";
 * String temp = "";
 * for (int i = 0; i < index.length; i++) {
 * outputResult = outputResult + s.charAt(index[i] - 1);
 * }
 * return outputResult;
 * }
 */