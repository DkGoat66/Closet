import java.util.Scanner;

public class Closet {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //create new object of the BlueRayCollection class//
        Clothecollection CD=new Clothecollection();
        boolean attempt=true;
        int options;
        //Using do while loop to print the options for the users to chose//
        do {
            System.out.println("0. Quit");
            System.out.println("1. Add clothes to my closet");
            System.out.println("2. See clothes in my closet");
            System.out.println("3. Search my collection in the closet");
            System.out.println("4. Remove clothes from my collection in the closet");
            options = sc.nextInt();
            sc.nextLine();
            //*if the option is one, ask them the information//
            if (options == 1) {
                System.out.println("What is the color?");
                String color=sc.nextLine();
                System.out.println("What is the material of the clothes?");
                String mat=sc.nextLine();
                System.out.println("What type of clothes do you have ? ");
                String CT=sc.nextLine();
                System.out.println("What type of sleeve does it have ?");
                String sl=sc.nextLine();
                CD.add(color,mat,CT,sl);
            }
            //*if the option is two, call the show all method//
            else if (options==2){
                CD.show_all();
            }
            //* if the option is three, ask the title and call the search method in the object of the BluerayCollections//
            else if (options==3){
                System.out.println("What clothes  to search for?");
                String clothe=sc.nextLine();
                System.out.println(CD.search(clothe));
            }
            //* if the options is four, ask the title to remove and called remove method//
            else if (options==4){
                System.out.println("What clothes to remove?");
                String clothes=sc.nextLine();
                if (CD.remove(clothes)){
                    System.out.println(clothes+" deleted");
                }else{
                    System.out.println("Not Found");
                }
            }
            else{
                attempt=false;
            }
        }while (attempt);
    }
}

