#include<iostream>
using namespace std;

struct node
{
	int data;
	node* next;
}

class pallindrome
{
public:
	
	bool isPalin(node* head)
	{
		if(head==NULL || head->next ==NULL)
			return true;

		node* slow=head;
		node* fast=head;

		while(fast->next!=NULL && fast->next->next!=NULL)
		{
			slow=slow->next;
			fast= fast->next->next;
		}

		//fast moving at 2n speed so slow will point to the mid the list;

		slow->next=reverseList(slow->next)
		//reversing the second half of the list and setting up the link with first half so that it point correctly;
		slow=slow->next;
		//above 2 lines will always point towards the first node of the second half of the list;

		while(slow!=NULL)
		{
			if(head->data!=slow->data)
				return false;
			slow=slow->next;
			head=head->next;
		}

		return true;
	}

	node* reverseList(node* current)
	{
		node* prev=NULL;
		node* next=NULL;

		while(head!=NULL)
		{
			next=current->next;
			current->next=prev;
			prev=head;
			head=next;
		}
		return pre;
	}
};