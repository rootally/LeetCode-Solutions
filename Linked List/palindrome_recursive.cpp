class palindrome_recursive
{
public:

	bool isPlain(node* head)
	{
		node* temp =head;
		return check(head);
	}

	bool check(node* x)
	{
		if(x==NULL)
		{
			return true;
		}

		bool isPal = check(x->next) & (temp->val==x->val);
		temp=temp->next;
		return isPal;
	}

};