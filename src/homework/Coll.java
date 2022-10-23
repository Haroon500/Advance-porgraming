package homework;

public class Coll {

	public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<String>();
		LinkedList<String> al=new LinkedList<String>(); 
		Stack<String> stack = new Stack<String>();  
		Vector<String> v=new Vector<String>(); 
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
		
System.out.println("------------------------------------------------------------------------------");
 
v.add("mama");  
v.add("e");  
v.add("f");  
v.add("G");  
Iterator<String> it3r=v.iterator();  
while(itr3.hasNext()){  
System.out.println(itr3.next());  
} 
		PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit Sharma");  
queue.add("Vijay Raj");  
queue.add("JaiShankar");  
queue.add("Raj");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr4=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr6=queue.iterator();  
while(itr4.hasNext()){  
System.out.println(itr4.next());  
}  
	

	}
		
	}

}
