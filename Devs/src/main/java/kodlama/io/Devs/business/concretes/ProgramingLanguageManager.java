package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Devs.entities.concretes.programmingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // bu sınıf bir  business nesnesidir.
public class ProgramingLanguageManager implements ProgramingLanguageService {
    private ProgramingLanguageRepository programingLanguageRepository;

    @Autowired
    public ProgramingLanguageManager(ProgramingLanguageRepository programingLanguageRepository) {
        this.programingLanguageRepository = programingLanguageRepository;

    }
    @Override
    public List<programmingLanguage> getAll() {
        return programingLanguageRepository.getAll();
    }

    @Override
    public void add(programmingLanguage programmingLanguage) {
        if (programmingLanguage.getName()!="  "&& programmingLanguage.getName()=="paython"){
            programingLanguageRepository.add(programmingLanguage);
        }

    }

    @Override
    public void update(programmingLanguage language) {
        programingLanguageRepository.update(language);

    }

    @Override
    public void delete(int id) {
        programingLanguageRepository.delete(id);

    }

    @Override
    public programmingLanguage getId(int id) {
        return programingLanguageRepository.getId(id);
    }
}
