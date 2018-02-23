 package com.amra.interviews;
/*
 * Amazon Interview
 Edward is organizing a meeting and has to order lunch for everyone in the team. To make his task simpler he has prepared two lists. 
 The first list has pairs of team members and their preferred cuisine types. Each team member either has a preference for a particular cuisine or does not have any particular preference and likes all cuisines. 
 The second one contains a list of lunch options along with the cuisine type to which it belongs. Each lunch option belongs to only one cuisine type.

Write an algorithm that outputs a list of all possible pairs of team members along with lunch option they would enjoy. There can be no, one or more entries for a team member in the output list depending on how many lunch options satisfy their choice of cuisine(s). 

Input:
The input to the function/method consists of four arguments – lunchMenuPairs, representing a list containing pairs of lunch option and its associated cuisine type; teamCuisinePreference, representing a list containing pairs of team members and their cuisine preferences. 

Output:
Return a list representing all possible pairs of team members and lunch options they would enjoy.

Note
If a team member does not have a particular preference and likes all cuisines, then the preference is specified as a "*" in the teamCuisinePreference list. 
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TeamLunch {
	
	public static void main(String[] args){
									//i=0,3 ,j=0,1
	String[][] nameCuisineList= {{"jose","itly"},
								 {"john","india"},
								 {"sara","thai"},
								 {"mary","*"}};
	
	String[][] dishCuisineList= {{"pizza","itly"},
								 {"curry","india"},
								 {"masala","india"}};
	
	System.out.println(Arrays.deepToString(findTeamLunchOptions(nameCuisineList,dishCuisineList)));
}

	
	private static String[][] findTeamLunchOptions(String[][] nameCuisineList,String[][] dishCuisineList) {
		String[][] result =  new String[(nameCuisineList.length*dishCuisineList.length)-1][2];
		
		Map<String,String> nameCuisineMap = new HashMap<String,String>();
		Map<String,String> dishCuisineMap = new HashMap<String,String>();
		
		//put name values into map
		for (int i=0;i<nameCuisineList.length;i++){
			nameCuisineMap.put(nameCuisineList[i][0],nameCuisineList[i][1]);
			}
		
		//put dish values into map
		for(int i=0;i<dishCuisineList.length;i++){
			dishCuisineMap.put(dishCuisineList[i][0],dishCuisineList[i][1]);
		}
		//compare the values of both the maps to 
		//map1=[jose,itly]
		 
		//map2=[pizza,itly]
		
		int row=0;
		for(String names : nameCuisineMap.keySet()){
			String cuisine = nameCuisineMap.get(names);
			for(String dish : dishCuisineMap.keySet()){
				String place = dishCuisineMap.get(dish);
				if(cuisine.equalsIgnoreCase(place)){
					result[row][0]=names;
					result[row][1]=dish;
					row++;
				}
				else if(cuisine.equals("*")){
					//map1=["mary","*"] map2= {"pizza","itly"},{"curry","india"},{"masala","india"}
					//result=
					result[row][0]=names;
					result[row][1]=dish;
					row++;
				}
			}
		}	
	
		return result;
	}
}