package Code.Char1Sec4AlgorithmAnalysis;

import NoteByMyself.Cha1Sec1.BinarySearch;

import java.util.Arrays;

public class TwoSumFast {
    /**
     * Find all pairs which adding is 0.
     *
     * @param a
     * @return cnt
     */
    public static int count(Integer[] a) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }
}
