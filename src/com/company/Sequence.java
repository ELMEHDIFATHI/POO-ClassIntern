package com.company;

import java.util.Arrays;

public class Sequence {
    private int[] array;

    public class SubSequence{
        public SubSequence(int lenght){
            if(lenght <=0)throw  new IllegalArgumentException("la taille est doit etre positive");

                array =new int[lenght];
                for (int i=0;i< array.length;i++){
                    array[i]=(int)(Math.random()*1000);
                }

        }
        public int intat(int index){
            if(index <=0 || index >= array.length)throw  new IllegalArgumentException("la taille est doit etre positive");
            return array[index];
        }

        public void afficher(){
            System.out.println(Arrays.toString(array));
        }

        // methode static travaille selon les version
    }

    public static void main(String[] args) {
        Sequence s=new Sequence();
        Sequence.SubSequence sub=s.new SubSequence(15);
        sub.afficher();
        System.out.println(sub.intat(2));

    }
}
