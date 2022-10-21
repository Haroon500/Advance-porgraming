package homework;

public class Coll {

	public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<String>();
		LinkedList<String> al=new LinkedList<String>(); 
		Stack<String> stack = new Stack<String>();  
		list.add("haroon"); 
		list.add("khan");  
		list.add("haroon");  
		list.add("kaka");  	 
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		System.out.println("--------------------------------------------------------------------");
		al.add("ahmad");  
		al.add("rashid");  
		al.add("abobakar");  
		al.add("ali");  
		Iterator<String> itr1=al.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}
		
System.out.println("------------------------------------------------------------------------------");



stack.push("wali");  
stack.push("addff");  
stack.push("fdgds");  
stack.push("rwewr");  
stack.push("erewre");  
stack.pop();  
Iterator<String> itr2=stack.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}

	}

}
