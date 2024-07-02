package org.example.pl120807;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Sloution().solution(2,3)); //1
        System.out.println(new Sloution().solution(11,11)); //1
        System.out.println(new Sloution().solution(7,9)); //1

    }
}

class Sloution{
    public int solution(int num1, int num2){
        if (num1 == num2){
            return 1;
        }
        return -1;
    }

}
