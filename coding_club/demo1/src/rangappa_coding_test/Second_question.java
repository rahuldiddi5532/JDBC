package rangappa_coding_test;

public class Second_question 
{
   
   
   public static int[] check(Object[][] arr)
   { int[] temp= new int[4];
   int j=0;
      for(int i=0;i<=arr.length-2;i++)
      {
    	  int id1=(Integer)arr[i][1];
    	  int id2=(Integer)arr[i+1][1];
    	  
    	  String place1=(String)arr[i][3];
    	  String place2=(String)arr[i][3];
    	  
    	  int time1=(Integer)arr[i][4];
    	  int time2=(Integer)arr[i+1][4];
      
    	  if(id1==id2&&place1!=place2&&time1+time2<=30)
    	  {
//    		  System.out.println();
    		  temp[j]=(Integer)arr[i+1][0];
    		  j++;
    	  }
      }
	   return temp;
   }
   public static void main(String[] args) {
	   Object[][] arr= {{1,1000,500.00,"Vadodara",0},{2,1000,500.00,"Mumbai",5},{3,1001,500.00,"Mumbai",10},{4,1001,10000.00,"Mumbai",10}};
//   int id=(Integer) arr[1][0];
//   System.out.println(id);
	   int[] ra=check(arr);
    for(int e:ra)
    {
    	System.out.print(e+" ");
    }
     
   }

}
