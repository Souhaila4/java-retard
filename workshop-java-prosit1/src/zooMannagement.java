import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class zooMannagement {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("donner le nom du zoo");
    String zooname= scanner.nextLine();
    while (zooname.trim().isEmpty){
        System.out.print("le nom du zoo ne peut pas etre vide ");
        zooname =scanner.nextLine();
        }
    System.out.print("donner le nombre de cages :");
    while(!scanner.hasNextInt()){
        System.out.print("Veuiller entrer un entier valide ");
        scanner.next();

    }
int nbrcages = scanner.nextInt();
    System.out.print(zooname+ "comporte" + nbrcages +"nbrcages");


    }
}