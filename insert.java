import java.util.*;
class insert_animal {
    Scanner sc = new Scanner(System.in);
    int id;
    String animal_name;
    int animal_hight;
    int animal_weight;
    String animal_sciname;
    int life_span;
    int animal_age;
    String animal_color;
    String gender;

    public void animal_insert() {
        System.out.print("Enter Animal ID : ");
        id = sc.nextInt();
        System.out.print("Enter Animal Name : ");
        animal_name = sc.next();
        System.out.print("Enter Animal height(cm) : ");
        animal_hight = sc.nextInt();
        System.out.print("Enter Animal weight(KG) : ");
        animal_weight = sc.nextInt();
        System.out.print("Enter Animal Scientific Name : ");
        animal_sciname = sc.next();
        System.out.print("Enter Animal life span : ");
        life_span = sc.nextInt();
        System.out.print("Enter Animal age : ");
        animal_age = sc.nextInt();
        System.out.print("Enter Animal color : ");
        animal_color = sc.next();
        System.out.print("Enter Animal gender : ");
        gender = sc.next();
    }

    public int getId() {
        return id;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public int getAnimal_hight() {
        return animal_hight;
    }

    public int getAnimal_weight() {
        return animal_weight;
    }

    public String getAnimal_sciname() {
        return animal_sciname;
    }

    public int getLife_span() {
        return life_span;
    }

    public int getAnimal_age() {
        return animal_age;
    }

    public String getAnimal_color() {
        return animal_color;
    }

    public String getGender() {
        return gender;
    }

}

class insert_animal_detail {
    int pop;
    int aid;
    int cityid;

    public int getPop() {
        return pop;
    }

    public int getAid() {
        return aid;
    }

    public int getCityid() {
        return cityid;
    }

    void insert() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Animal Id: ");
        aid = sc.nextInt();
        System.out.println("Enter population: ");
        pop = sc.nextInt();
        System.out.println("Enter City Id: ");
        cityid = sc.nextInt();
    }
}

class insert_state {
    String state_name;
    int state_id;

    void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter State Name : ");
        state_name = sc.nextLine();
        System.out.println("Enter State ID : ");
        state_id = sc.nextInt();
    }

    public String getState_name() {
        return state_name;
    }

    public int getState_id() {
        return state_id;
    }
}

class insert_city {
    int cityid;
    String cityname;

    void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter City Id: ");
        cityid = sc.nextInt();
        System.out.println("Enter City Name: ");
        cityname = sc.next();
    }

    public int getCityid() {
        return cityid;
    }

    public String getCityname() {
        return cityname;
    }
}

class insert_category{
    Scanner sc = new Scanner(System.in);
    String catname ;
    int catid ;
    void insert(){
        System.out.println("Enter Category Name : ");
        catname = sc.nextLine();
        System.out.println("Enter Category ID : ");
        catid = sc.nextInt();
    }
    public String getCatname() {
        return catname;
    }
    public int getCatid() {
        return catid;
    }
}

class insert_subcategory{
    Scanner sc = new Scanner(System.in);
    int subid ;
    String subname ;
    void insert(){
        System.out.println("Enter Sub Category ID : ");
			subid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Sub Category Name : ");
            subname = sc.nextLine();
    }
    public int getSubid() {
        return subid;
    }
    public String getSubname() {
        return subname;
    }
}