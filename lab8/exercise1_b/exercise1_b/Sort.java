package exercise1_b;

public class Sort <T extends Number> {
	T []t;

	public Sort(T[] t) {
		
		this.t = t;
		
	}
	
	public T[] getSorting(){
		
		return t;
	}
	
	public void bubbleSort(){
		for(int i=0;i<t.length-1;i++) {
			for(int j=0;j<t.length-i-1;j++) {
				
				if(t[j].doubleValue()>t[j+1].doubleValue()) {
					T temp=t[j];
					t[j]=t[j+1];
					t[j+1]=temp;
				}
				
			}
		}
	}
	
	public void print() {
		for(int i=0;i<t.length;i++) {
			System.out.print(t[i]+" ");
		}
		System.out.print("\n\n");
	}
	

}
