import java.util.*;
public class Frequency{
    private static HashMap<Integer, Integer> frequency  = new HashMap<Integer, Integer>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String []args){
        Frequency.countFrequency();
        Frequency.printFrequency();
    }
    private static void countFrequency(){
        while(Frequency.scan.hasNextInt()){
            int element = Frequency.scan.nextInt();
            if (Frequency.frequency.containsKey(element)){
                Frequency.frequency.replace(element, Frequency.frequency.get(element) + 1);
            }
            else{
                Frequency.frequency.put(element, 1);
            }
        }
    }
    private static void printFrequency(){

        for(Map.Entry<Integer, Integer> entry : Frequency.frequency.entrySet()) {
            if (entry.getValue() > 1){
                System.out.println(entry.getValue() + " occurrences of " + entry.getKey());
            }
        }
    }
}