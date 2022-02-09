/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill2;

/**
 *
 * @author Rizky
 */
public class PublicationPolymorph {
    public static void main(String[] args) {
        Publication test1 = new Publication("The new era");
        System.out.println(test1.getInfo());
        
        Newspaper test2 = new Newspaper("Football results", "Sport news");
        System.out.println(test2.getInfo());
        
        Article test3 = new Article("Why the Sun is hot", "Dr James Smith");
        System.out.println(test3.getInfo());
        
        Announcement test4 = new Announcement("Will sell a house", 30);
        System.out.println(test4.getInfo());
    }
}



class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        // write your code here
        return getType() + getDetails() + ": " + this.title;
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
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
    public String getType() {
        return "Newspaper";
    }

    @Override
    public String getDetails() {
        return " (source - " + this.source + ")";
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
    public String getType() {
        return "Article";
    }

    @Override
    public String getDetails() {
        return " ( author - " + this.author + ")";
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
    public String getType() {
        return "Announcement";
    }

    @Override
    public String getDetails() {
        return " ( days to expire - " + this.daysToExpire + ")";
    }
    
}