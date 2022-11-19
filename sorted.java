
class sorted
{
    public static void main(String[]abc)
    {
        int n[]={100,105,102,109,110,107,103};
        int size=n.length;
        System.out.println("unsorted array");
        for(int i=0;i<size;i++)
        {
            System.out.println("  "+n[i]);
        }
        //sorting procedure
        for(int i=0;i<size-1;i++)//0 to 6
        {
            for(int j=i+1;j<size;j++)//1 to 7
            {
                if(n[i]>n[j])
                {
                    int temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        System.out.println("ascending order");
        for(int i=0;i<size;i++)
        {
            System.out.println(" "+n[i]);
        }
        System.out.println("descending order");
        for(int i=size-1;i>=0;i--)
        {
        System.out.println("descending order:-"+n[i]);
        }
        
    }
}