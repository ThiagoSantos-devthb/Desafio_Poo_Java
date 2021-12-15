package br.com.desafio.poo.dominio;


public class Course extends Content{

    private int workload;


    @Override
    public double calculateXp() {
        return  XP_STANDARD * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

}
