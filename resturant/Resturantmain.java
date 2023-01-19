package resturant;
import java.util.*;
public class Resturantmain {
public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
				int id;
				Map<Integer, Resturant> map = new HashMap<Integer, Resturant>();
				
				map.put(1, new Resturant("Chicken Biryani", 180));
				map.put(2, new Resturant("Panner Butter Masala",100));
				map.put(3, new Resturant("Chicken Manchurain", 170));
				map.put(4,new Resturant("Dosa", 90));
				map.put(5, new Resturant("Mushroom Chilli", 160));
				map.put(6, new Resturant("Chicken Momo",80));
				
				
				System.out.println("Welcome to C3805 Restaurant");
				System.out.println("====================");
				System.out.println("Menu");
				System.out.println("=====================");
				System.out.println("\t\tITEMS \t\t\t\t\t\tPRICE");
				
				for(Map.Entry em: map.entrySet()) {
					Resturant rest= (Resturant) em.getValue();
					System.out.println(em.getKey()+")");
					rest.display();
				}
				
				System.out.println();
				do {
					System.out.println("Enter food Id : ");
					id = sc.nextInt();
					Resturant rest =map.get(id);
					Billing.order(rest.getFname(), rest.getPrice());
					
					Billing.cont();
					
				}while(true);
				
				

			}
}


