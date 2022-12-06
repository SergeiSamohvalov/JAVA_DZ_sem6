package Java_DZ.JAVA_DZ_sem6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        NB n1 = new NB (2, 128, "Белый");
        NB n2 = new NB ( 4, 256, "Серый");
        NB n3 = new NB ( 32, 512, "Черный");
        NB n4 = new NB (16, 256,  "Черный");
       
        System.out.println("Выберите функцию:");
        System.out.println("1 - фильтр по ОЗУ");
        System.out.println("2 - фильтр по SSD");
        System.out.println("3 - фильтр по цвету");
        Scanner sc = new Scanner(System.in);        
        Integer choice = sc.nextInt();
        
            if(choice == 1){

                System.out.printf("Введите значение ОЗУ: ");
                Integer ram = sc.nextInt();
                if(ram >=32){
                    System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n4.toString() + "\n" + n3.toString() + "\n");
                }else if(ram < 32){
                    System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n4.toString());
                }else if(ram < 16){
                    System.out.printf(n1.toString() + "\n" + n2.toString());
                }else if(ram < 4){
                    System.out.printf(n1.toString());
                }else System.out.println("Ничего не найдено. Введите другой параметр ");

            }else if(choice == 2){

                System.out.printf("Введите значение SSD: ");
                Integer ssd = sc.nextInt();
                if(ssd >=512){
                    System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n3.toString() + "\n" + n4.toString() + "\n");
                }else if(ssd < 512){
                    System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n4.toString());
                }else if(ssd < 256){
                    System.out.printf(n1.toString() + "\n" + n2.toString());
                }else if(ssd < 128){
                    System.out.printf(n1.toString());
                }else System.out.println("Ничего не найдено. Введите другой параметр ");

            }else if(choice == 3){

                System.out.println("Введите цвет");
                Scanner sc1 = new Scanner(System.in);
                String color = sc1.nextLine();
                if(color.equalsIgnoreCase("White")){
                    System.out.printf(n1.toString() + "\n");
                }else if(color.equalsIgnoreCase("Grey")){
                    System.out.printf(n2.toString() + "\n" + n3.toString());
                }else if(color.equalsIgnoreCase("Black")){
                    System.out.printf(n4.toString() + "\n" );
                }else System.out.println("Ничего не найдено. Введите другой параметр ");
                sc1.close();
                sc.close();
                }
            
            } 
}
