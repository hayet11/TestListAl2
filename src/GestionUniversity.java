import java.util.ArrayList;
import java.util.Collections;

public class GestionUniversity implements University{

    public ArrayList<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : etudiants){
            if(e.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        etudiants.forEach(e-> System.out.println(e));
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants,new TrierId());
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants,new TrierNom());
    }
}
