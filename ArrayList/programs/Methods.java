import java.util.ArrayList;
import java.util.List;

public class Methods {

	public static double average(ArrayList<Double> list) {
		double sum = 0;
		
		for(double num : list) {
			sum += num;
		}
//		for(int i =0; i< list.size(); i++) {
//			sum += list.get(i);
//		}
		return  sum/list.size();
	}
	
	public static int maxLength(ArrayList<String> list) {
		int max = 0;
		
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).length() > max) {
				max = list.get(i).length();
			}
		}
		
		return max;
	}
	
	public static String first(ArrayList<String> list) {
		return list.get(0);
	}
	
	public static ArrayList<String> firstThree(ArrayList<String> list) {
		ArrayList<String> newList = new ArrayList<>();
		newList.add(list.get(0));
		newList.add(list.get(1));
		newList.add(list.get(2));
		return newList;
	}
	
	public static ArrayList<String> firstN(ArrayList<String> list, int n) {
		ArrayList<String> newList = new ArrayList<String>();
		for(int i =0; i < n; i++) {
		newList.add(list.get(i));
		}
		return newList;
	}

	public static String last(ArrayList<String> list) {
		return list.get(list.size()-1);
	}
	
	public static ArrayList<String> lastThree(ArrayList<String> list) {
		ArrayList<String> newList = new ArrayList<>(List.of(list.get(list.size()-3),list.get(list.size()-2),list.get(list.size()-1)));
		return newList;
		
	}
	
	public static ArrayList<String> lastN(ArrayList<String> list, int n) {
		ArrayList<String> newList = new ArrayList<String>();
		
		for(int i = 0; i < n; i++) {
			newList.add(0, list.get(list.size()-i-1));
		}
		return newList;
	}
	
	public static void swapFirstAndLast(ArrayList<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, temp);
	}
	
	public static int nthIndexOf(ArrayList<String> list, String str, int n) {
		int index = 0;
        int findTimes = 0;
        if (n == 0)
            return -1;
        if (list.isEmpty())
            return -1;
        for (Object o : list) {
            if (o.equals(str))
                findTimes++;
            if (findTimes >= n)
                return index;
            index++;
        }
        return -1;
		
	}
}
