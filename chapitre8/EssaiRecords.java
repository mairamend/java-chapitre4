import java.util.ArrayList;
import java.util.List;
public class EssaiRecords {
 record LivreInfo(String titre, String isbn, List<String> auteurs){
            LivreInfo{
                if (titre == null || titre.isBlank())
                    throw new IllegalArgumentException("Le titre est obligatoire");
                if (isbn == null || isbn.isBlank())
                    throw new IllegalArgumentException("L'ISBN est obligatoire");
                auteurs = List.copyOf(auteurs);
            }
    }
    public static void main(String[] args) {
        List<String> auteurs = new ArrayList<>();
        auteurs.add("Mariama Bâ");

        LivreInfo livre = new LivreInfo("Une si longue lettre", "123456", auteurs);

          auteurs.add("Un autre auteur");
          System.out.println(livre);
    }
}
