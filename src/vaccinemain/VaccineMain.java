
package vaccinemain;


public class VaccineMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AllPeople ap = new AllPeople();
        ap.modifyvaccinationstatus();
        LoginPage lp = new LoginPage();
        lp.show();

    }
    
}
