package br.com.desafio.poo.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev  {
    private String name;
    private Set<Content> contentsInscribe =  new LinkedHashSet<>();
    private Set<Content> contentsConcluded = new LinkedHashSet<>();

    public void inscribeBootcamp(Bootcamp bootcamp){
        this.contentsInscribe.addAll(bootcamp.getContents());
        bootcamp.getDevInscrible().add(this);
    }

    public  void progress(){
        Optional<Content> content = this.contentsInscribe.stream().findFirst();
        if(content.isPresent()){
            this.contentsConcluded.add(content.get());
            this.contentsInscribe.remove(content.get());
        }else{
            System.err.println("you are not subscribed to any content");
        }


    }

    public double calculateXp(){
        return this.contentsConcluded
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentsInscribe() {
        return contentsInscribe;
    }

    public void setContentsInscribe(Set<Content> contentsInscribe) {
        this.contentsInscribe = contentsInscribe;
    }

    public Set<Content> getContentsConcluded() {
        return contentsConcluded;
    }

    public void setContentsConcluded(Set<Content> contentsConcluded) {
        this.contentsConcluded = contentsConcluded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentsInscribe, dev.contentsInscribe) && Objects.equals(contentsConcluded, dev.contentsConcluded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsInscribe, contentsConcluded);
    }
}
