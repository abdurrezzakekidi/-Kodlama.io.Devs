package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.programmingLanguage;

import java.util.List;

public interface ProgramingLanguageRepository {

    List<programmingLanguage> getAll();


    void add(programmingLanguage programmingLanguage);
    // değer  dödürmeyen bir  method

    void update(programmingLanguage programmingLanguage);

    void delete(int id);
    programmingLanguage getId(int id);
}
