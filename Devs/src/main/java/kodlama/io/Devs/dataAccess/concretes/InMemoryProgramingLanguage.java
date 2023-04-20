package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Devs.entities.concretes.programmingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository    // sen  bir  dataAccess nensnesisin
public class InMemoryProgramingLanguage implements ProgramingLanguageRepository {
    List<programmingLanguage> programmingLanguages;

    public InMemoryProgramingLanguage() {
        programmingLanguages = new ArrayList<programmingLanguage>();

        programmingLanguages.add(new programmingLanguage(1, "java"));
        programmingLanguages.add(new programmingLanguage(2, "C#"));
        programmingLanguages.add(new programmingLanguage(3, "Paython"));
    }

    @Override
    public List<programmingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void add(programmingLanguage programmingLanguage) {
        this.programmingLanguages.add(programmingLanguage);

    }

    @Override
    public void update(programmingLanguage programmingLanguage) {
        for (programmingLanguage programmingLanguage1 : programmingLanguages) {
            if (programmingLanguage1.getId() == programmingLanguage.getId()) {
                programmingLanguage1.setName(programmingLanguage.getName());
            }
        }

    }

    @Override
    public void delete(int id) {
        for (programmingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                programmingLanguages.remove(programmingLanguage);
            }

        }

    }

    @Override
    public programmingLanguage getId(int id) {
        programmingLanguage language = new programmingLanguage();
        for (programmingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                language = programmingLanguage;
                System.out.println(language.getId() + " _" + language.getName());
            }
        }
        return language;
    }
}
