package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.programmingLanguage;

import java.util.List;

public interface ProgramingLanguageService {
    List<programmingLanguage> getAll();
    void add(programmingLanguage programmingLanguage);
    void update(programmingLanguage language);
    void delete(int id);
    programmingLanguage getId(int id);
}
