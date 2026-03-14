
class FourFive1
{
	public static void main(String[] args)
	{
		char a[][]=new char[4][5];
		a[0][0]='A';
		a[0][1]='B';
		a[0][2]='C';
		a[0][3]='D';
		a[0][4]='E';
		a[1][0]='E';
		a[1][1]='F';
		a[1][2]='G';
		a[1][3]='H';
		a[1][4]='I';
		a[2][0]='J';
		a[2][1]='K';
		a[2][2]='L';
		a[2][3]='M';
		a[2][4]='N';
		a[3][0]='I';
		a[3][1]='J';
		a[3][2]='K';
		a[3][3]='L';
		a[3][4]='M';
		System.out.println("THE CHARACTER TABLE ");
		System.out.println("       Coloumn");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Row "+(i+1)+": ");
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
