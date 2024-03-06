
package librarymanagementsystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        /*MainForm homeframe = new MainForm();
        homeframe.setVisible(true);
        homeframe.pack();
        homeframe.setLocationRelativeTo(null);*/
        LoginAndSignup ls = new LoginAndSignup();
        ls.setVisible(true);
        ls.pack();
        ls.setLocationRelativeTo(null);
    }
    
}