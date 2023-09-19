import java.util.ArrayList;

class countIversion {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        // calculate(arr);
        System.out.println(mergeSort(arr, 0, 4));
    }

    static int mergeSort(int[] arr, int left, int right) {
        int cnt = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            cnt += mergeSort(arr, left, mid);
            cnt += mergeSort(arr, mid + 1, right);
            cnt += merge(arr, left, mid, right);
        }
        return cnt;
    }

    static int merge(int[] arr, int left, int mid, int right) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int i = left; // starting index of left half of arr
        int j = mid + 1;
        int cnt = 0;
        while (i < mid && j < right) {
            if (arr[j] >= arr[i]) {
                temp.add(arr[i]);
                i++;
            } else {
                cnt += (right - mid + 1);
                temp.add(arr[j]);
                j++;
            }
        }
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= right) {
            temp.add(arr[j]);
            j++;
        }
        for (int k = left; k <= right; k++) {
            arr[k] = temp.get(k - left);
        }
        return cnt;
    }

    static void calculate(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    c++;
            }
        }
        System.out.println(c);
    }
}