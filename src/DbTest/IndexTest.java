package DbTest;


public class IndexTest {
    public static void main(String[] args) {
        IndexTest indexTest = new IndexTest();
        int[] a = new int[]{2,3,4,6,33,44,66,67,69,71,100};
        System.out.println(indexTest.SequenceSearch(a,71,a.length));
        System.out.println(indexTest.BinarySearch2(a,71));
    }

    //顺序查找
    public int SequenceSearch(int a[], int value, int n) {
        int i;
        for (i = 0; i < n; i++)
            if (a[i] == value)
                return i;
        return -1;
    }

    //二分查找，递归版本
    public int BinarySearch2(int A[], int target) {
        int l = 0;
        int r = A.length-1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(A[mid]==target)
                return mid;
            if(A[mid]<target)
                l = mid+1;
            else
                r = mid-1;
        }
        return l;
    }
}
