package br.com.nomadweb.springwebmvc.service;

import br.com.nomadweb.springwebmvc.exception.JediNotExistException;
import br.com.nomadweb.springwebmvc.model.Jedi;
import br.com.nomadweb.springwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JediService {

    @Autowired
    private JediRepository repository;

    public List<Jedi> findAll() {
        return repository.findAll();
    }

    public Jedi findById(Long id) {
        final Optional<Jedi> jedi = repository.findById(id);

        if (jedi.isPresent()) {
            return jedi.get();
        } else {
            throw new JediNotExistException();
        }

    }

    public Jedi save(Jedi jedi) {
        return repository.save(jedi);
    }

    public Jedi update(Long id, Jedi updatedJedi) {

        final Optional<Jedi> oldJedi = repository.findById(id);
        final Jedi jedi;

        if (oldJedi.isPresent()) {
            jedi = oldJedi.get();
        } else {
            throw new JediNotExistException();
        }

        jedi.setName(updatedJedi.getName());
        jedi.setLastName(updatedJedi.getLastName());

        return repository.save(jedi);

    }

    public void delete(Long id) {

        final Jedi jedi = findById(id);

        repository.delete(jedi);

    }
}
