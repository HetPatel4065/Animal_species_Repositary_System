import java.sql.Connection;
import java.util.*;

class MainClass {
	Scanner sc = new Scanner(System.in);

	void animal() throws Exception {
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.View");
		System.out.println("5.Exit");
		System.out.println("\nWhich Choice You want to Select?(1-5)");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		int choice = sc.nextInt();
		Animal a = new Animal();
		insert_animal animal = new insert_animal();
		linkList_animal link_animal = new linkList_animal();
		switch (choice) {
			case 1:
				animal.animal_insert();
				a.insert(animal);
				link_animal.Add(animal);
				break;
			case 2:
				a.update();
				break;
			case 3:
				a.delete(link_animal);
				break;
			case 4:
				a.list();
				break;
			case 5:
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}

	void animalDetails(AnimalDetails ad) throws Exception {

		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.View");
		System.out.println("5.Exit");
		System.out.println("\nWhich Choice You want to Select?(1-5)");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		int choice = sc.nextInt();
		insert_animal_detail animal_detail = new insert_animal_detail();
		linkList_animal_details link_animal_details = new linkList_animal_details();
		switch (choice) {
			case 1:
				animal_detail.insert();
				ad.insert(animal_detail);
				link_animal_details.Add(animal_detail);
				break;
			case 2:
				ad.update();
				break;
			case 3:
				ad.delete(link_animal_details);
				break;
			case 4:
				ad.list();
				break;
			case 5:
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}

	void state(State s) throws Exception {

		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.View");
		System.out.println("5.Exit");
		System.out.println("\nWhich Choice You want to Select?(1-5)");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		int choice = sc.nextInt();
		insert_state state = new insert_state();
		linkList_state link_state = new linkList_state();
		switch (choice) {
			case 1:
				state.insert();
				s.insert(state);
				link_state.Add(state);
				break;
			case 2:
				s.update();
				break;
			case 3:
				s.delete(link_state);
				break;
			case 4:
				s.list();
				break;
			case 5:
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}

	void city(City c) throws Exception {

		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.View");
		System.out.println("5.Exit");
		System.out.println("\nWhich Choice You want to Select?(1-5)");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		int choice = sc.nextInt();
		insert_city city = new insert_city();
		linkList_city link_city = new linkList_city();
		switch (choice) {
			case 1:
				city.insert();
				c.insert(city);
				link_city.Add(city);
				break;
			case 2:
				c.update();
				break;
			case 3:
				c.delete(link_city);
				break;
			case 4:
				c.list();
				break;
			case 5:
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}

	void category(Category cat) throws Exception {
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.View");
		System.out.println("5.Exit");
		System.out.println("\nWhich Choice You want to Select?(1-5)");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		int choice = sc.nextInt();
		insert_category category = new insert_category();
		linkList_category link_cat = new linkList_category();
		switch (choice) {
			case 1:
				category.insert();
				cat.insert(category);
				link_cat.Add(category);
				break;
			case 2:
				cat.update();
				break;
			case 3:
				cat.delete(link_cat);
				break;
			case 4:
				cat.list();
				break;
			case 5:
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}

	void subCategory(SubCategory scat) throws Exception {

		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.View");
		System.out.println("5.Exit");
		System.out.println("\nWhich Action You want to Perform?(1-5)");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		int choice = sc.nextInt();
		insert_subcategory subcat = new insert_subcategory();
		linkList_subcategory link_subcat = new linkList_subcategory();
		switch (choice) {
			case 1:
				subcat.insert();
				scat.insert(subcat);
				link_subcat.Add(subcat);
				break;
			case 2:
				scat.update();
				break;
			case 3:
				scat.delete(link_subcat);
				break;
			case 4:
				scat.list();
				break;
			case 5:
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}
}

public class MainDriver {
	private static Scanner sc;
	static Connection con;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println(
				"                         Welcome To The Animal Repositery System                              ");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		while (true) {
			System.out.println("\nList Of tables:-");
			System.out.println("1.Animal");
			System.out.println("2.Category");
			System.out.println("3.Sub_Category");
			System.out.println("4.Animal_details");
			System.out.println("5.State");
			System.out.println("6.City");
			System.out.println("7.Exit");
			System.out.println("Enter your Choice(1-7)");
			int table_choice = sc.nextInt();
			MainClass mainclass = new MainClass();
			switch (table_choice) {
				case 1:
					mainclass.animal();
					break;
				case 2:
					Category c = new Category();
					mainclass.category(c);
					break;
				case 3:
					SubCategory scat = new SubCategory();
					mainclass.subCategory(scat);
					break;
				case 4:
					AnimalDetails ad = new AnimalDetails();
					mainclass.animalDetails(ad);
					break;
				case 5:
					State state = new State();
					mainclass.state(state);
					break;
				case 6:
					City city = new City();
					mainclass.city(city);
					break;
				case 7:
					System.out.println("Exiting From The System..............");
					Thread.sleep(1000);
					System.exit(0);
					sc.close();
					break;
				default:
					System.out.println("Wrong Choice!!");
					break;
			}
		}
	}
}