package kodlama.io.Devs.webApi.controller;

import kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Devs.entities.concretes.programmingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annatation   bilgilendirme  ifadesidir
@RequestMapping("/api/programmingLanguage")

public class ProgramingLangagesController {
    private ProgramingLanguageRepository languageRepository;


    @Autowired
    public ProgramingLangagesController(ProgramingLanguageRepository programingLanguageRepository) {
        this.languageRepository = programingLanguageRepository;
    }

    @GetMapping("/getAll")
    public List<programmingLanguage> getAll() {
        return languageRepository.getAll();
    }

    @GetMapping("/getİd/{id}")
    public programmingLanguage getId(@PathVariable("id") int id) {
        return languageRepository.getId(id);

    }

    @PostMapping("/update")
    public void update(@RequestBody programmingLanguage programmingLanguage) {
        languageRepository.update(programmingLanguage);

    }

    @PostMapping("/add")
    public void add(@RequestBody programmingLanguage programmingLanguage) {
        languageRepository.add(programmingLanguage);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        languageRepository.delete(id);
    }
}
