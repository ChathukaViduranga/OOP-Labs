package exercise1;

public   class Sort{

public <T extends Number> void bubbleSort(T arr[]) {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for (int j=0;j<n-i-1;j++) {
				
				if(arr[j].doubleValue()>arr[j+1].doubleValue()) {
					
				T temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				}
			}
		}
}	
}
