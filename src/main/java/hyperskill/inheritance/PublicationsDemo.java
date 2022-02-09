/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.inheritance;

/**
 *
 * @author Rizky
 */
public class PublicationsDemo {
    public static void main(String[] args) {
        Publication publicTest = new Publication("The new era");
        System.out.println(publicTest.getDetails());
        
        Newspaper newsTest = new Newspaper("Football results", "Sport news");
        System.out.println(newsTest.getDetails());
        
        Article artiTest = new Article("Why the Sun is hot", "Dr James Smith");
        System.out.println(artiTest.getDetails());
        
        Announcement annoTest = new Announcement("Will sell a house", 30);
        System.out.println(annoTest.getDetails());
    }
}



class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public String getDetails() {
        return "title=\"" + title + "\"";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here
    @Override
    public String getDetails() {
        return super.getDetails() + ", " + "source=\"" + source + "\"";
    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here
    @Override
    public String getDetails() {
        return super.getDetails() + ", " + "author=\"" + author + "\"";
    }
    

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here
    @Override
    public String getDetails() {
        return super.getDetails() + ", " + "daysToExpire=" + daysToExpire;
    }
    
}