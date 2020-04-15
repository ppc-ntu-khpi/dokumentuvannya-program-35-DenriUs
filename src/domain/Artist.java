package domain;

/**
 * Class that represents an artist
 * @author Denis Tatsii
 */
public class Artist extends Employee {

    /**
     *Constructor that accept information about artist
     * @param skiils skills of the artist
     * @param name artist name
     * @param jobTitle artist job title
     * @param level level of the artist
     * @param dept department name where the artist works
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Constructor that accept skills of the artist
     * @param skiils skills of the artist
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Artist class default constructor
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Method that returns artist information
     * @return string with artist information
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Method that returns all artist skills
     * @return string with artist's skills
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method that sets skills to the artist
     * @param skills string array that contains skills
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Method that returns all artist's skills
     * @return string array that contains artist's skills
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
