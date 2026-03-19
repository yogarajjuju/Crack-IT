import java.util.*;
class StudentMarks{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Yogaraj",95);
        map.put("Anya",99);
         map.put("Alice", 75);
        map.put("Bob", 60);
        map.put("Charlie", 80);

        map.get("Yogaraj");
        map.containsKey("Anya");
    // Loop 1 - print all students
for(Map.Entry<String,Integer> entry : map.entrySet()){
    System.out.println(entry.getKey() + " : " + entry.getValue());
}

// Loop 2 - find topper
String topper = "";
int max = 0;
for(Map.Entry<String,Integer> entry : map.entrySet()){
    if(entry.getValue() > max){
        max = entry.getValue();
        topper = entry.getKey();
    }
}
System.out.println("Topper: " + topper + " with " + max);

// Loop 3 - find average
int sum = 0;
for(int marks : map.values()){
    sum += marks;
}
System.out.println("Average: " + sum / map.size());
    }
}