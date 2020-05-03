import java.util.*;
 //collection Practice
public class CollectionAZ {
    public static void main(String a[]){
        List<Integer> li = new ArrayList<Integer>();
        ListIterator<Integer> litr = null;
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);
        litr=li.listIterator();
        System.out.println("Elements in forward directiton");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Elements in backward directiton");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
		
		System.out.println("----------------Linked List----------------");
		
	    LinkedList<String> ll = new LinkedList<String>();
        ll.add("Orange");
        ll.add("Apple");
        ll.add("Grape");
        ll.add("Banana");
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? "+ll.contains("Grape"));
	//perform adding task    
		System.out.println("Adding element at first position...");
        ll.offerFirst("first like fruits");
        System.out.println(ll);
	//perform addAll function	
		List<String> list2 = new ArrayList<String>();
        list2.add("one");
        list2.add("two");
        ll.addAll(list2);
        System.out.println("After Copy: "+ll);
		
			System.out.println("----------------Vector----------------");
		Vector<String> v=new Vector<String>();  
		v.add("man");  
		v.add("div");  
		v.add("Goa");  
		v.add("Vadodara");  
		Iterator<String> itr3=v.iterator();  
		while(itr3.hasNext()){  
		System.out.println(itr3.next());  
		}  
		
	System.out.println("----------------Stack----------------");	
		
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr4=stack.iterator();  
		while(itr4.hasNext()){  
		System.out.println(itr4.next());  
		}  
		System.out.println("----------------queue----------------");	
			
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Ram verma");  
		queue.add("Shyam Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr4.hasNext()){  
		System.out.println(itr4.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr5=queue.iterator();  
		while(itr5.hasNext()){  
		System.out.println(itr5.next());  
		}  
	System.out.println("----------------HashSet----------------");	
	
  //Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr6=set.iterator();  
		while(itr6.hasNext()){  
		System.out.println(itr6.next());  
		}  
	
  System.out.println("----------------TreeSet----------------");	
	//Creating and adding elements  
		TreeSet<String> set1=new TreeSet<String>();  
		set1.add("Ravi");  
		set1.add("Vijay");  
		set1.add("Ravi");  
		set1.add("Ajay");  
		//traversing elements  
		Iterator<String> itr7=set1.iterator();  
		while(itr7.hasNext()){  
		System.out.println(itr7.next());  
		}  
		
    }
}
