package com.example.barito;

public class Tiga {

    private static void sortPrice(int[] price, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (price[j] > price[j + 1]) {

                    int temp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = temp;
                }

            }
        }

    }

    static void maxProvit(int arr[]) {
        int n = arr.length;
        int max = arr[n-1] - arr[0];
        System.out.println( "max provit ::: " + max);
    }

    public static void main(String[] args) {
        System.out.println("START");
        int price[] = {10, 15, 8, 7, 14};
        int n = price.length;
        sortPrice(price, n);
        maxProvit(price);


    }


}
