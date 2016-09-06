import java.util.*;


/**
 * Created by Jakob on 31-08-2016.
 */
public class removeOddLength {

    public static void main (String[] args) {

        Set<String> set= new HashSet<String>();
        set.addAll(Arrays.asList("Hi", "mate", "seems", "like", "you", "could", "use", "a", "hug"));


        System.out.println(removeOddLengths(set));

    }

    public static Set<String> removeOddLengths (Set<String> set){


        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){
            String tempElement = itr.next();
            int str = tempElement.length();

            if(str%2==1){
                itr.remove();
            }
        }
        return set;
    }

}






