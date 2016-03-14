package com.example.dell.tdexo1h;

/**
 * Created by Dell on 29/02/2016.
 */
public class Book {

    private int cover;
    private String titre;
    private String author;
    private String edition;
    private String annee;
    private String resume;


    public Book(int cover, String titre, String author, String edition, String annee, String resume) {
        this.cover = cover;
        this.titre = titre;
        this.author = author;
        this.edition = edition;
        this.annee = annee;
        this.resume = resume;
    }

    public int getCover() {
        return cover;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuthor() {
        return author;
    }

    public String getEdition() {
        return edition;
    }

    public String getAnnee() {
        return annee;
    }

    public String getResume() {
        return resume;
    }


    public void setCover(int cover) {
        this.cover = cover;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
