package algorithm;

import java.util.Arrays;

public class plus_one {
public void merge(int[] num1,int m,int[] num2,int n){
    int i = 0,j = 0,k = 0;
    int[] result = new int[m + n];
    while (i < m && j < n){
        if(num1[i] < num2[j]){
            result[k ++] = num1[i++];
        }else {
            result[k ++] = num2[j++];
        }
    }
    if(i != m){
        while (i < m){
            result[k ++] = num1[i ++];
        }
    }
    if(j != n){
        while (j < n){
            result[k ++] = num2[j ++];
        }
    }
    k = 0;
    for (i = 0;i < num1.length;i++){
        num1[i] = result[k ++];
    }
    System.out.println(Arrays.toString(num1));
}
    public void merge1(int[] num1,int m,int[] num2,int n){
        int i = m - 1 ;
        int j = n - 1;
        int k = m + n -1;
        while (i >= 0 && j >= 0){
            if(num1[i] > num2[j]){
                num1[k--] = num1[i --];
            }else {
                num1[k--] = num2[j --];
            }
        }
//        if(i > 0){
//            while (i >= 0){
//                num1[k --] = num1[i --];
//            }
//        }
        if(j >= n){
            while (j >= 0){
                num1[k --] = num2[j --];
            }
        }
        System.out.println(Arrays.toString(num1));
    }

    public static void main(String[] args) {
        int[] n1 = new int[]{1,2,3,2,0,0};
        int[] n2 = new int[]{1,6,7};
        plus_one plus_one = new plus_one();
//        plus_one.merge(n1,3,n2,3);
        plus_one.merge1(n1,3,n2,3);
    }

}
