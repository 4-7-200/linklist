class Selectionsort
{
	 public static void main(String args[])
	 {
      int array[] = {1, 26, 35, 8, 196, 2257};
      int size = array.length;

      for (int v=0; v<size;v++)

        	{
        		
        		System.out.println( "Unsorted array is \n" + array[v]);

        	}

      for (int i = 0 ;i< size-1; i++)
      {
         int min = i;

         for (int j = i+1; j<size; j++)
         {
            if (array[j] < array[min]){
            min = j;
            }
         }
         int temp = array[min];
         array[min] = array[i];
         array[i] = temp;
      }

      for (int i = 0 ;i< size; i++){
         System.out.println("The sorted array are:\n "+array[i]);
      }
   }  
}