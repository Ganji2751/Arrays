class P5 
{
    public static void main(String args[])
    {
        int array[] = new int[]{96,23,41,14,67,34};
        int first=0,second=0,pos=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>=first)
            {
                first = array[i];
                pos = i;
            }
            else if(array[i]>second && pos!=i)
                second = array[i];
        }
        System.out.println("The first largest nuumber is : "+first);
        System.out.println("The second largest nuumber is : "+second);
    }
}