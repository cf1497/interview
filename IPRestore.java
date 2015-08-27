package leetcode;
import java.util.*;

public class IPRestore {

	public static void main(String[] args){
		String s = "25525511135";
		List<String> result = new ArrayList<String>(restore(s));
		System.out.println(result);
		
	}
	
	public static List<String> restore(String s){
		List<String> result = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		
		if(s==null || s.length()==0){
			return result;
		}
		
		rec(result, list ,s);
		return result;
	}
	
	public static void rec(List<String> result, List<String> list, String s ){
		if(list.size()>4){
			return;
		}
		
		if(list.size()==4 && s.length()==0){
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<list.size(); i++){
				sb.append(list.get(i));
				if(i!=list.size()-1){
					sb.append(".");
				}
			}
			result.add(sb.toString());
			return;
		}
		
		for(int i=1; i<=s.length(); i++){
			String str = s.substring(0,i);
			
			if(Integer.parseInt(str)>255){
				break;
			}
			
			if(str.charAt(0)=='0' && str.length()>1){
				break;
			}
			
			list.add(str);
			rec(result,list,s.substring(i));
			list.remove(list.size()-1);
		}
	}
}
