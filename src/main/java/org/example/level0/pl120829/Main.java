package org.example.level0.pl120829;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int angle) {

        if (angle < 180 && angle > 90) return 3;
        else if (angle == 90) return 2;
        else if (angle == 180) return 4;

        return 1;
    }
}
