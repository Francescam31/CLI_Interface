public class Passenger {

    private String name;
    private String contactInfo;
    private int id;

    public Passenger(String name, String contactInfo, int id) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getid() {
        return this.id;
    }

    public void setUniqueId(int uniqueId) {
        this.id = id;
    }
    
   
}
