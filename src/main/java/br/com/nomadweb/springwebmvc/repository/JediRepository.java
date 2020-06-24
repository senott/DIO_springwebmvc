package br.com.nomadweb.springwebmvc.repository;

import br.com.nomadweb.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

    private List<Jedi> jediList = new ArrayList<>();

    public JediRepository() {
        jediList.add(new Jedi("Luke", "Skywalker"));
    }

    public List<Jedi> getAllJedi() {

        return this.jediList;

    }

    public void add(Jedi jedi) {
        this.jediList.add(jedi);
    }
}
