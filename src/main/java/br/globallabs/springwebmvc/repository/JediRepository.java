package br.globallabs.springwebmvc.repository;

import br.globallabs.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
    private List<Jedi> jedi;

    public JediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Chambelerker"));
    }

    public List<Jedi> getAllJedi(){

        return this.jedi;
    }

    public void add(final Jedi jedi) {
        this.jedi.add(jedi);
    }
}
