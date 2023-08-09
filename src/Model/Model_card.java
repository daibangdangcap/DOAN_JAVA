
package Model;

import javax.swing.Icon;

/**
 *
 * @author Admin
 */
public class Model_card {
    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Model_card(Icon icon, String title, String description) {
        this.icon = icon;
        this.title = title;
        this.description = description;
    }
    
    public Model_card() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     String id;
     private Icon icon;
     private String title;
     private String description; //giá tiền
     private int soluong;

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    }
