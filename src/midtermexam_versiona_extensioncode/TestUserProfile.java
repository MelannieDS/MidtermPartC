
package midtermexam_versiona_extensioncode;

import java.util.Scanner;


public class TestUserProfile {

    public static void main (String [] args){
        
        String [] genres ={"Comedy", "Drama","Action", "Mystery"};
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your Name:");
        String name = input.nextLine();
           
        System.out.println("Choose Genre from the list below");
        for (int i = 0; i < genres.length; i ++){
            System.out.println( genres[i] );
        }
        System.out.println();
        System.out.println("Enter your choosen Genre");
        
        String choosenGenre;
        Scanner genre = new Scanner(System.in);
        choosenGenre=genre.nextLine();
        
        
        UserProfile profile = new UserProfile(name, choosenGenre);
        System.out.println("Your Profile is created"+ profile);
        
    }
    
}
