
package bdf;

public class Donor {

    private String name;
    private String phone;
    private String bloodGroup;

    public Donor(String name, String phone, String bloodGroup) {
        this.name = name;
        this.phone = phone;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}