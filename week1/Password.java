import java.util.Scanner;

public class Password{
    public  static void main (String[] args){
        Scanner reader =new Scanner(System.in);
        String passw= "carrot";
        
        while(true){
            System.out.print("Type the password: ");
            String pass =reader.nextLine();
            
            if(pass.equals(passw)){
                System.out.println("Right !");
                break;
            }
            else{
                System.out.println("Wrong !");    
            } 
        
        }
       
        System.out.println("The secret is qbar !");
    }
}