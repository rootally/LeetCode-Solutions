public class Solution
{
	public class ListNode addtwolist(ListNode l1, ListNode l2)
	{
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		while (l1 != null) 
		{
			s1.push(li.val);
			l1=l1.next;	
		}
		//push all the integers to stack so that when can add from the last node!

		while (l2 != null)
		{
			s2.push(l2.val);
			l2 = l2.next;
		}

		int sum =0;
		LinkedList<Integer> ls = new LinkedList<>();

		while(!s1.empty() || !s2.empty() )
		{
			if(!s1.empty())
				sum+=s1.pop;
			if(!s2.empty())
				sum+= s2.pop

			ls.add(0,sum%10);
			//Appending the sum always at the head!
			sum/=10;
		}

		if(sum >0)
			ls.add(0,sum);
		//Checking if any sum is left over
	}
}