package pk2;

public class cordonne {

    public interface T1{

    }
    private pere[] trajet= {
            new pere(4,2),
            new pere(3,2),
            new pere(4,2),
            new pere(6,2)


    };

        public static pere nouveaupere(int x, int y){
            return new pere(x,y);
        }


    public static class pere{
        private int x,y;

        public pere(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "pere{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static void main(String[] args) {
            cordonne.pere p=new pere(5,5);
        cordonne.pere p1=cordonne.nouveaupere(4,4);
        System.out.println(p);

        System.out.println(p1);

    }
}
