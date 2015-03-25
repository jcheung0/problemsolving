import java.util.Set;
import java.util.TreeSet;
public class oddNumber{
    public static void main(String args[]){
        int[] numArray = {1,1,1,1,3,3,3,4,4,4,4,6,6,6,6};
        TreeSet temp = new TreeSet();
        for(Integer i : numArray){
            if (temp.contains(i)){
                temp.remove(i);
            }else{
                temp.add(i);
            }

        }
        
        for (Object i : temp){
            System.out.println(i);
        }
    }
}
