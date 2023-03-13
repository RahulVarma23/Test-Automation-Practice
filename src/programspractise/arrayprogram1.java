package programspractise;

import java.util.Arrays;

public class arrayprogram1 {
//WAP to append array. add 0 after every 5 in array
	//i/p-{1,4,5,7,3,5,2,5,9};
	//o/p={1,4,5,0,7,3,5,0,2,5,0,9}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int array1[]= {1,4,5,7,3,5,2,5,9};
     int count=0;
     for(int i=0;i<array1.length;i++) {
    	  if(array1[i]==5){
    		 count++;
    	 }
     } //1,4,5,7,3,5,2,5,9
     int array2[]=new int[array1.length+count];
     int j=0;
     for(int i=0;i<array1.length;i++) { 	
    	if(array1[i]!=5) {  
    		array2[j]=array1[i]; //1,4,
    		j++;
    	}
    	else if(array1[i]==5){
    		array2[j]=array1[i];//1,4,5
    		j++;
    		array2[j]=0; //j 1,4,5,0
    		 j++;
    	  }
     }
     
     System.out.println(Arrays.toString(array2));
	}

}
