package com.company;

  class Englobance {
      private Interne interne=new Interne();
    private int i=5;

      public void afficher(){
          System.out.println(" la valeur i "+i);
      }
    public class Interne{

        private int p=i;

        public void afficher(){
            System.out.println(this);
            System.out.println(Englobance.this);
        }
    }

      public static void main(String[] args) {
          Englobance E=new Englobance();
          Englobance.Interne I=E.new Interne();
          I.afficher();
      }
}
