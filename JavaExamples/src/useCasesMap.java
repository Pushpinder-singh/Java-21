package java_17.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Person( String name, Integer age   ){

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}

public class useCasesMap {
    public static void main(String[] args) {
        // Use cases of Map() of streams
        //1 

        List<String> names = Arrays.asList("Singh","kabir","jyoti","sandeep","Pushpinder");
         
        List<Integer>  stringLenth = names.stream()
         .map(String::length)
         .collect(Collectors.toList());
    
         System.out.println("Lenght of each string: "+stringLenth);

    List<String> uppercaseNames = names.stream()
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());
     System.out.println("Upper case names :" +uppercaseNames);




// 2. Fetching a name field from Person record and uppercase the name 

List<Person> persons = Arrays.asList( new Person("Pushpinder Singh", 33),
                                        new Person("Sandeep Singh", 38),
                                        new Person("Sandeep Singh", 18)
                                        );



         List<String> personNames = persons.stream()
         .map(Person::getName)
         .map(String::toUpperCase)
         .collect(Collectors.toList());                               
System.out.println("Person Names : "+personNames);

         List<Integer> personAge = persons.stream()
         .map(Person::getAge)
         .filter(n->n<30)
         .collect(Collectors.toList());                               

System.out.println("Person Age : "+personAge);
                                        }
}
