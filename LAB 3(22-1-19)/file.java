import java.util.*;
enum Result
{
	correct,incorrect,unanswered;
}
class report
{
	public Character [] solution;
	public static Character[] correctAns={'C','A','B','D','B','C','C','A'};
	public Result[] res;
	private int correct,incorrect,unanswered;

	report(Character[] sol)
	{
		solution = new Character[8];
		for(int i=0;i<8;i++)
		{
			solution[i] = sol[i];
		}
		res=  new Result[8];
		find();
	}

	void find()
	{
		for(int i=0;i<8;i++)
		{
			if(solution[i] == correctAns[i])
			{
				res[i] = Result.correct;
				correct++;
			}
			else
			{
				if(solution[i] == 'X')
				{
					res[i] = Result.unanswered;
					unanswered++;
				}
				else
				{
					res[i] = Result.incorrect;
					incorrect++;
				}
			}
		}
	}

	void print()
	{
		System.out.println("Question"+"  "+"submitted Ans"+"  "+"correct Ans"+"  "+"Result");
		for (int i=0; i<8; i++) 
		{
			System.out.println(i+1 + "           "+ solution[i]+"               "+correctAns[i]+"         "+res[i]); 
		}

		System.out.println("Number of correct answers"+ correct);
		System.out.println("Number of incorrect answers"+ incorrect);
		System.out.println("Number of unanswered answers"+ unanswered);
		if(correct >=5)
		{
			System.out.println("The candidate is passed.");
		}
		else
		{
			System.out.println("The candidate is failed.");
		}
	}

}
class file
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Character[] a = new Character[8];
		System.out.println("write your submissions");
		for (int i=0;i<8 ;i++ ) 
		{
			a[i] = s.next().charAt(0);
		}
		report r = new report(a);
		r.print();
	}
}