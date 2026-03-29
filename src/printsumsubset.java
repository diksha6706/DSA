public class printsumsubset {
    static void subsetsum(int[] a, int n, int idx, int sum){
        if(idx>= n)
        {
            System.out.println(sum);
            return;
        }

        subsetsum(a, n, idx+1, sum+a[idx]);
        subsetsum(a, n, idx+1, sum);



    }
    static void main() {
        int[] a = {2,4,5};
        subsetsum(a, a.length,  0, 0);

    }
}
