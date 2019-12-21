package com.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Map<Integer, String> map = new HashMap<Integer, String>();
		 map.put(1, "a");
		 map.put(2, "b");
		 map.put(3, "ab");
		 map.put(4, "ab");
	     map.put(5, "ab");
		 System.out.println(map.size());
		 
		 System.out.println("第三种：通过Map.entrySet遍历key和value");
		  for (Map.Entry<Integer, String> entry : map.entrySet()) {
		 //Map.entry<Integer,String> 映射项（键-值对）  有几个方法：用上面的名字entry
      //entry.getKey() ;entry.getValue(); entry.setValue();
     //map.entrySet()  返回此映射中包含的映射关系的 Set视图。
		  System.out.println("key= " + entry.getKey() + " and value= "+ entry.getValue());
		   }
	}
}*/
		 









		 // 第一种：
		/*
		          * Set<Integer> set = map.keySet(); //得到所有key的集合
		          * 
		          * for (Integer in : set) { String str = map.get(in);
		          * System.out.println(in + "     " + str); }
		          */
		/*
		 * Set<Integer> set = map.keySet();
		 * System.out.println("第一种：通过Map.keySet遍历key和value：");
		 *  for (Integer in : set) {
		 * //map.keySet()返回的是所有key的值 String str = map.get(in); //得到每个key多对用value的值
		 * System.out.println(str+"  "+in);
		 * 
		 *         }
		 */
		
		/* System.out.println("第二种：通过Map.entrySet使用iterator遍历key和value：");
		  Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		  while (it.hasNext()) {
		 Map.Entry<Integer, String> entry = it.next();
		 System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		 }
		*/
		/*
		 * System.out.println("第四种：通过Map.values()遍历所有的value，但不能遍历key"); for (String v :
		 * map.values()) { System.out.println("value= " + v); }
		 */
	/*
	 * System.out.println("第三种：通过Map.entrySet遍历key和value"); for (Map.Entry<Integer,
	 * String> entry : map.entrySet()) { //Map.entry<Integer,String> 映射项（键-值对）
	 *  有几个方法：用上面的名字entry //entry.getKey() ;entry.getValue(); entry.setValue();
	 * //map.entrySet()  返回此映射中包含的映射关系的 Set视图。 System.out.println("key= " +
	 * entry.getKey() + " and value= "+ entry.getValue());         } }
	 */

		
	/*	Map<String,String> pets=new HashMap<>();
		pets.put("001", "小猫");
		pets.put("002", "小小猫");
		pets.put("003", "小猫猫");
		pets.put("004", "小猫咪");
		
		Set<String> keys = pets.keySet();
		for(String key:keys){
		    String value = pets.get(key);
		    System.out.println(key+"\t"+value);


	}*/
		
		
		/*
		 * List<String> list=new ArrayList<>(); list.add("xiaohua");
		 * list.add("xiaohua1"); 
		 * list.add("xiaohua2"); 
		 * for (int i = 0; i < list.size(); i++) {
		 *  System.out.println(list.get(i));
		 * 
		 * }
		 */
		/*
		 * List<String> list=new ArrayList<>(); 
		 * list.add("xia");
		 * list.add("xua1");
		 * list.add("hua2");
		 * 
		 * for(Object o:list){ System.out.println(o); }
		 */



		
		 /* List<String> list=new ArrayList<>();
		  list.add("xia");
		  list.add("xua");
		  list.add("hua");
		  
		  Iterator it = (Iterator) list.iterator();
		   while (it.hasNext()) { 
		   String str = (String) it.next();
		   System.out.println(str); }
		 
		
		*/
		  String string="我爱学习java";
		 // String reverse=new StringBuffer(string).reverse().toString();
		  String reverse=new StringBuilder(string).reverse().toString();
		  System.out.println("反转前1："+string);
		  System.out.println("反转hou："+reverse);
	     
	   }
		
		
		
	}
	
		
	    
