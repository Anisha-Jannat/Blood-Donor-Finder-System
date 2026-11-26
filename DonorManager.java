package bdf;

public class DonorManager {

    Donor[] donors = new Donor[100];
    int count = 0;

    public void addDonor(Donor d) {
        if (count < 100) {
            donors[count] = d;
            count++;
        }
    }

    public void displayDonors() {
        for (int i = 0; i < count; i++) {
            System.out.println(donors[i].getName());
            System.out.println(donors[i].getPhone());
            System.out.println(donors[i].getBloodGroup());
        }
    }
}
