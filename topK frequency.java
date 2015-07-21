// Find K-th maximum frequency words  找到第K个出现频率最高的词语

public String kthFrequency(String[] words){
	if(words.length()==0){
		return "";
	}

	HashMap<String, Integer> map = new HashMap<String, Integer>();

	for(String s:words){
		if(!map.containsKey(s)){
			map.put(s,1);
		}else{
			map.put(s,map.get(s)+1);
		}
	}

	List<Integer> list = new ArrayList(map.entrySet());

	Collections.sort(list,new Comparator(){
          public int compare(Object obj1, Object obj2){
                return ((Comparable)((Map.Entry)(obj1)).getValue()).compareTo(((Map.Entry)(obj2)).getValue()); 
   }
  });

	return list;
}

// 各种尝试
package leetcode;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class kthFrequency {
	
	public static Map sortByValue(Map unsortMap) {	 
		LinkedList list = new LinkedList(unsortMap.entrySet());
	 
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
							.compareTo(((Map.Entry) (o2)).getValue());
			}
		});
	 
		Map sortedMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
//	public class Pair{
//		String s;
//		int n;
//	    public Pair(String s, int n){
//	    	this.s = s;
//	    	this.n = n;
//	    }	
//	}
//	
	public static void main(String[] args){
	     final Map<String ,Integer> map = new HashMap<String,Integer>();
	     map.put("a", 1);
	     map.put("b", 5);
	     map.put("c", 3);
	     map.put("d", 2);
	     
	     PriorityQueue<String> queue = new PriorityQueue<String>(3, new Comparator<String>(){
	    	 
	    	 public int compare(String s1, String s2){
	    		 int n1 = map.get(s1);
	    		 int n2 = map.get(s2);
	    		 return n1-n2;
	    	 }
	     });
	     
	     Set<String> set = map.keySet();
	     for(String s :set){
	    	 queue.add(s);
	     }
	     
	     System.out.println(queue);
	     
	    // map = sortByValue(map);
//	     ArrayList list = new ArrayList(map.entrySet());
//	     Collections.sort(list,new Comparator(){
//	    	   public int compare(Object obj1, Object obj2){
//	    	   return ((Comparable)((Map.Entry)(obj1)).getValue
//
//	    	()).compareTo(((Map.Entry)(obj2)).getValue()); 
//	    	   }
//	    	  });
         
	     
	    // System.out.println(list.get(2));
	}
}
