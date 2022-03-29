package pk4;

import java.util.Comparator;

public class Employee {
    private String nom;
    private int nbAnnee;
    private double salairebase;

    public Employee(String nom, int nbAnnee, double salairebase) {
        this.nom = nom;
        this.nbAnnee = nbAnnee;
        this.salairebase = salairebase;
    }

    public double calculersalaire(){
        return salairebase*(1+(double) nbAnnee/10);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nom='" + nom + '\'' +
                ", nbAnnee=" + nbAnnee +
                ", salairebase=" +this.calculersalaire() +
                '}';
    }

    public static void main(String[] args) {
        Employee E=new Employee("mehdi",5,15000);
        System.out.println(E);
        Employee D=new Employee("brahim",10,20000){
            @Override
            public double calculersalaire(){
                return super.calculersalaire()+15000;
            }
        };
        Comparator<Employee> comparator=new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.calculersalaire()>e2.calculersalaire()){
                    return 1;
                }
                if(e1.calculersalaire()==e2.calculersalaire()){
                    return 0;
                }
                return -1;
            }
        };
        System.out.println(D);

    }





}

class Directeur extends  Employee{

    public Directeur(String nom, int nbAnnee, double salairebase) {
        super(nom, nbAnnee, salairebase);
    }

    public double calculerSalaire(){
        return super.calculersalaire()+1500;
    }
}
