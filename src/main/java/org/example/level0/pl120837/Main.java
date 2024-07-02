package org.example.level0.pl120837;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(23)); //23 => 5
        System.out.println(new Solution().solution(24)); //24 => 5
        System.out.println(new Solution().solution(999)); //999 => 201

    }
}

class Solution {
    public int solution(int hp) {
        int g = hp / 5;
        hp %= 5;
        int s = hp /3;
        hp %= 3;
        int w = hp;
        return g + s + w;
    }
}
