import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("test");
//        list.add(2);
//        list.add(2.2);
//        list.add(3);
//        list.add(5);
//        list.add("test");
//        list.add(2);
//
//        System.out.println(list);
//        System.out.println(list.size());

        ArrayList<Personne> listP = new ArrayList();
        listP.add(new Personne("Fkiri",1,"Hayet",22));
        listP.add(new Personne("Khayati",2,"Khaoula",21));
        listP.add(new Personne("Wasli",3,"Hana",21));

        listP.forEach(p-> System.out.println(p.getNom()) );
    }
}