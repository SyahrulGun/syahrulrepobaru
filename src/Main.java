import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
class JsonEncodeDemo3 {
    public static void main(String[] args){
        /* {"employees":[ "John", "Anna", "Peter" ]} */
        JSONArray arr = new JSONArray();
        arr.add("John");
        arr.add("Anna");
        arr.add("Peter");
        JSONObject obj = new JSONObject();
        obj.put("empoyee", arr);
        System.out.println(obj);
    }
}