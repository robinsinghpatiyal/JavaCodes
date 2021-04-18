import java.util.*;

public class BucketSort {
    static void sortData(int arr[], int n)
    {
        if (n <= 0)
            return;

        // 1) Create n empty buckets
        @SuppressWarnings("unchecked")
        Vector<Integer>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Integer>();
        }

        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            int idx = arr[i] * n;
            buckets[(int)idx].add(arr[i]);
        }

        // 3) Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    // Driver code
    public static void main(String args[])
    {
        int data[] = {10, 12, 15, 5, 3, 5, 10, 1, 2, 5, 19, 5, 2, 5, 4, 4, 5, 7, 10, 5};

        int n = data.length;
        sortData(data, n);

        System.out.println("Sorted array is ");
        for (int i =0; i<n; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
