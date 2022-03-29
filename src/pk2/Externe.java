package pk2;

public class Externe {
    private  int i=5;
    private static int comptegur=0;
    private  Interne i1=new Interne();

    public static class Interne{
        // i la une visibilite static acces
        public void afficher(){
           // System.out.println(i);
            System.out.println(comptegur);
        }

    }

    public class  hello{

    }


    public static void main(String[] args) {
        Externe.Interne i=new Interne();
    }
}
