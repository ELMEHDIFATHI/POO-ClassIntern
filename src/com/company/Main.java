package com.company;

public class Main {

    public static void main(String[] args) {
        Sequence s=new Sequence();
        Sequence.SubSequence sub=s.new SubSequence(15);
        sub.afficher();
        System.out.println(sub.intat(2));

    }
}
