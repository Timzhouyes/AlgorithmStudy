package Code.Char1Sec4AlgorithmAnalysis;

import NoteByMyself.Cha1Sec1.BinarySearch;

import java.util.Arrays;

public class ThreeSumFast {
    public static int count(Integer[] a) {
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (BinarySearch.rank(-(a[i] + a[j]), a) > j) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
