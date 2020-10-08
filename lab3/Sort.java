public class Sort
{
	
	public static void main(String[] args) 
    	{

        	int arr[] = { 12, 11, 13, 5, 6 };
        	
        	int k = arr.length;

        	for (int v=0; v<k;v++)

        	{
        		
        		System.out.println( "unsorted array is " + arr[v]);

        	}
        	for(int i=0;i<k;i++) 
        	{
        		for(int j=i+1;j<k;j++) 
            	{	
            		if(arr[j] < arr[i])
					{
             
                    	int temp = arr[j];

                   		arr[j] = arr[i];

                   	 	arr[i] = temp;
               		 }
           		 }
        	}
        	
        	

        	for (int i=0; i<k;i++)
        	System.out.println( "sorted array is " + arr[i]);


    	}


}
