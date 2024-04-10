//package magazine.shelf;
public class Magazine{
     int magazine_id;
     String magazine_name;
     String magazine_author;
     int no_of_pages;
     int magazine_price;
    public int getMagazine_id() {
        return magazine_id;
    }
    public void setMagazine_id(int magazine_id) {
        this.magazine_id = magazine_id;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + magazine_id;
        result = prime * result + ((magazine_name == null) ? 0 : magazine_name.hashCode());
        result = prime * result + ((magazine_author == null) ? 0 : magazine_author.hashCode());
        result = prime * result + no_of_pages;
        result = prime * result + magazine_price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Magazine other = (Magazine) obj;
        if (magazine_id != other.magazine_id)
            return false;
        if (magazine_name == null) {
            if (other.magazine_name != null)
                return false;
        } else if (!magazine_name.equals(other.magazine_name))
            return false;
        if (magazine_author == null) {
            if (other.magazine_author != null)
                return false;
        } else if (!magazine_author.equals(other.magazine_author))
            return false;
        if (no_of_pages != other.no_of_pages)
            return false;
        if (magazine_price != other.magazine_price)
            return false;
        return true;
    }
    public String getMagazine_name() {
        return magazine_name;
    }
    @Override
    public String toString() {
        return "Magazine [magazine_id=" + magazine_id + ", magazine_name=" + magazine_name + ", magazine_author="
                + magazine_author + ", no_of_pages=" + no_of_pages + ", magazine_price=" + magazine_price + "]";
    }
    public void setMagazine_name(String magazine_name) {
        this.magazine_name = magazine_name;
    }
    public Magazine(int magazine_id, String magazine_name, String magazine_author, int no_of_pages,
            int magazine_price) {
        this.magazine_id = magazine_id;
        this.magazine_name = magazine_name;
        this.magazine_author = magazine_author;
        this.no_of_pages = no_of_pages;
        this.magazine_price = magazine_price;
    }
    public String getMagazine_author() {
        return magazine_author;
    }
    public void setMagazine_author(String magazine_author) {
        this.magazine_author = magazine_author;
    }
    public int getNo_of_pages() {
        return no_of_pages;
    }
    public void setNo_of_pages(int no_of_pages) {
        this.no_of_pages = no_of_pages;
    }
    public int getMagazine_price() {
        return magazine_price;
    }
    public void setMagazine_price(int magazine_price) {
        this.magazine_price = magazine_price;
    }

}
    
