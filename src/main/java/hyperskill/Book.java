/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill;

/**
 *
 * @author Rizky
 */
class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;   
    
    public String getTitle() {
        return this.title;
    }
    
    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }
    
    public String[] getAuthors() {
        return this.authors.clone();
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    
    public void setAuthors(String[] authors) {
        this.authors = authors.clone();
    }
}