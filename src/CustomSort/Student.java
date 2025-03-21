package CustomSort;
import java.util.*;

class Car{
    String carName;
    String carType;

    Car(String carName, String carType){
        this.carName = carName;
        this.carType = carType;
    }
}
class Employee{
    String Name;
    Integer Roll;

    Employee(String Name, Integer Roll){
        this.Name = Name;
        this.Roll = Roll;
    }
}
public class Student {

    public static void main(String[] args) {
        //Integer [] arr = {5,2,1,100,102,101,-100,0,0};
        // ascending order
        // Arrays.sort(arr,(Integer val1,Integer val2)-> val1-val2);

        // descending order
        // Arrays.sort(arr,(Integer val1,Integer val2)-> val2-val1);

        //System.out.println(Arrays.toString(arr));

//        Car[] cars = new Car[3];
//
//        cars[0] = new Car("BMW", "Sedan");
//        cars[1] = new Car("Audi", "SUV");
//        cars[2] = new Car("Volvo", "Hatchback");
//
//        Arrays.sort(cars, (Car obj1, Car obj2)-> obj2.carType.compareTo(obj1.carType));
//
//        for(Car c: cars){
//            System.out.println(c.carName + "  " + c.carType);
//        }

//        Employee[] emp= new Employee[5];
//
//        emp[0] = new Employee("Rajesh",10);
//        emp[1] = new Employee("Mahesh",5);
//        emp[2] = new Employee("Arjun",1);
//        emp[3] = new Employee("Remo",20);
//        emp[4] = new Employee("Prasad",64);
//
//
//        Arrays.sort(emp,(Employee obj1, Employee obj2)-> obj1.Roll.compareTo(obj2.Roll));
//
//        for(Employee e: emp){
//            System.out.println(e.Name + " " + e.Roll);
//        }

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Rajesh",10));
        list.add(new Employee("Mahesh",5));
        list.add(new Employee("Arjun",1));
        list.add(new Employee("Remo",20));
        list.add(new Employee("Prasad",64));

        Collections.sort(list,(Employee obj1, Employee obj2) -> obj2.Roll.compareTo(obj1.Roll));

        for(Employee e: list){
            System.out.println(e.Name + " "+ e.Roll);
        }

//        Map<String, Integer> mp = new HashMap<>();
//        mp.put("Rajesh",10);
//        mp.put("Mahesh",5);
//        mp.put("Arjun",1);
//        mp.put("Remo",20);
//        mp.put("Prasad",64);
//        Collections.sort(mp,( a1, Integer a2)-> a1-a2)
    }
}
