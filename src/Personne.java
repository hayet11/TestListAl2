public class Personne implements Comparable<Personne>{
    private int id;
    private String nom,prenom;
    private int age;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Personne(){};

    public Personne(String nom, int id, String prenom, int age) {
        this.nom = nom;
        this.id = id;
        this.prenom = prenom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Personne p) {
        if(id>p.id)
            return 1;
        else if(id<p.id)
            return -1;
        return 0;
    }
}
