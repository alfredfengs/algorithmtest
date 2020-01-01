package algorithm;

public class nextSort {
        public static Integer nextSortResult(Integer num) {
            String string = num.toString();
            char[] numChar = string.toCharArray();
            if (numChar[0]=='9') {
                return num; // 第一个是9的永远没有好戏可以上演了
            }
            int maxIndex = -1;
            int record = 0;
            for (int i = 0; i + 1 < numChar.length; i++) { // 遍历一遍 找到转折点记录下来 后面找到最大值
                if (numChar[i] > numChar[i + 1]) {
                    record = i + 1;
                }
            }
            for (int i = record + 1; i < numChar.length; i++) {
                if (numChar[i] > numChar[record]) {
                    maxIndex = i;
                }
            }

            swap(numChar, record, maxIndex);
            String stringNum = new String(numChar);
            int resultNum = Integer.valueOf(stringNum);
            return resultNum;
        }

        public static void swap(char[] arr, int k, int n) {
            char temp = arr[k];
            arr[k] = arr[n];
            arr[n] = temp;

        }

        public static void main(String[] args) {
            Integer num = 134238;
            Integer nextSortResult = nextSortResult(num);
            System.out.println(nextSortResult);
        }

    }
