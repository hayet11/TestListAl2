public class TestMain {
    public static void main(String[] args) {

        //test de la classe Etudiant
        Etudiant e1 = new Etudiant(1,"Nom1","Prenom1");
        Etudiant e2 = new Etudiant(2,"Nom2","Prenom2");
        Etudiant e3 = new Etudiant(3,"Nom3","Prenom3");

        System.out.println(e1.equals(e2));
        System.out.println(e1);
    }
}
