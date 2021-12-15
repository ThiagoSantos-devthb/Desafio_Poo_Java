package br.com.desafio.poo.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private LocalDate dateInitial = LocalDate.now();
    private LocalDate dateFinal = dateInitial.plusDays(45);
    private Set<Dev> devInscrible = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateInitial() {
        return dateInitial;
    }

    public void setDateInitial(LocalDate dateInitial) {
        this.dateInitial = dateInitial;
    }

    public LocalDate getDateFinal() {
        return dateFinal;
    }

    public void setDateFinal(LocalDate dateFinal) {
        this.dateFinal = dateFinal;
    }

    public Set<Dev> getDevInscrible() {
        return devInscrible;
    }

    public void setDevInscrible(Set<Dev> devInscrible) {
        this.devInscrible = devInscrible;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(dateInitial, bootcamp.dateInitial) && Objects.equals(dateFinal, bootcamp.dateFinal) && Objects.equals(devInscrible, bootcamp.devInscrible) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dateInitial, dateFinal, devInscrible, contents);
    }
}
