class 328-Odd_Even
{
public:

	node* OddEven(node* head)
	{
		if(head!=NULL && head->next!=NULL)
		{
			node* odd=head;
			node* even=head->next;
			node* evenhead=even;

			while(even!=NULL and even->next!=NULL)
			{
				odd->next=odd->next-> next;
				even->next=even->next->next;
				odd=odd->next;
				even=even->next;
			}

			odd->next=evenhead;
		}
		
		return head;	
	}	
};		