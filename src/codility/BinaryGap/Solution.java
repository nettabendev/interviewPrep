package codility.BinaryGap;

public class Solution {


    public int solution(int N) {

        String s = Integer.toBinaryString(N);
        char[] chars = s.toCharArray();
        int countMax = 0, countTemp = 0;
        boolean startedGap = false;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                if (startedGap == true) {
                    countTemp++;
                }
            } else {
                //chars[i]==1
                if (startedGap == true) {
                    //finished gap
                    if (countTemp > countMax) {
                        countMax = countTemp;
                        countTemp = 0;
                    }

                }
                countTemp = 0;
                startedGap = true;

            }

        }
        return countMax;
    }
}
