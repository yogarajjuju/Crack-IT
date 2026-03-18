import java.util.*;
class StudentMarks{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Yogaraj",95);
        map.put("Anya",99);

        map.get("Yogaraj");
        map.containsKey("Anya");
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for(int marks : map.values()){
    System.out.println(marks);
}
    }
}