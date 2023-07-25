public class Passenger {

    private String name;
    private String contactInfo;
    private int uniqueId;

    public Passenger(String name, String contactInfo, int uniqueId) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.uniqueId = uniqueId;
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

    public int getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }
}
