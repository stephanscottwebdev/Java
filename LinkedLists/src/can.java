/**
 * @author Stephan
 * Can class covers the company, content, size, and prices of cans.
 */

public class can {

    String company;
    String content;
    double size;
    double price;

    public can()
    {

    }

    /**
     * @param comp
     * @param cont
     * @param oz
     * @param pri
     */
    public can(String comp, String cont, double oz, double pri)
    {
        company = comp;
        content = cont;
        size = oz;
        price = pri;
    }

    /**
     * @param comp
     * @param cont
     */
    public can (String comp, String cont)
    {
        company = comp;
        content = cont;
    }

    /**
     * @return maker of can
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company, sets maker of can
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return content of can
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content, sets content of can
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return size of can
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size, sets size of can (assumed ounces)
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return price of can
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price, sets price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString()
    {
        return "[Company= " + company + ", Content= " + content + ", Size= " + size + ", Price= " + price + "]";
    }

}
