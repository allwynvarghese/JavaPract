/**
 * @author Allwyn Oommen
 * @version 1
 * @since 2023
 */
package JavaDocs;

/**
 * Class - Library, for Javadocs demo
 */
public class Library {

    /**
     * @value default value is 10
     */
    int val = 10;

    /**
     * Default constructor
     */
    public Library(){
    }

    /**
     * Parameterized constructor.
     * @param name Give the name of the book
     *
     */
    public Library(String name){

    }

    /**
     * getBooks method returns the book name
     * @param id Give the book id
     * @return String book name
     */
    public String getBooks(String id){
        return "";
    }

    /**
     * This method check if the book is available
     * @param name give the book name
     * @return true if book is available
     */
    public boolean isBookAvailable(String name){
        return true;
    }

}
