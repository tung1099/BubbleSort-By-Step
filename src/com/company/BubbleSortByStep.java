    package com.company;

    import java.util.Scanner;

    public class BubbleSortByStep {

        public static void main(String[] args) {
        // write your code here
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số lượng phần tử trong mảng:");
            int size = scanner.nextInt();
            int[] list = new int[size];
            System.out.println("Nhập " + list.length + " phần tử:");
            for (int i = 0; i < list.length; i++) {
                list[i] = scanner.nextInt();
            }
            System.out.print("Mảng đã chọn: ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + "\t");
            }
            System.out.println("\nXử lý sắp xếp...");
            bubbleSortByStep(list);
        }
        public static void bubbleSortByStep(int[] list) {
            boolean needNextPass = true;
            for (int k = 1; k < list.length && needNextPass; k++) {
                needNextPass = false;
                for (int i = 0; i < list.length - k; i++) {
                    if (list[i] > list[i + 1]) {

                        System.out.println("Đổi " + list[i] + " với " + list[i + 1]);
                        int temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;

                        needNextPass = true;
                    }
                }
                if (needNextPass == false) {
                    System.out.println("Mảng đã được sắp xếp");
                    break;
                }

                System.out.print("Mảng sau " + k + " lần thay đổi: ");
                for (int j = 0; j < list.length; j++) {
                    System.out.print(list[j] + "\t");
                }
                System.out.println();

            }
        }
    }
