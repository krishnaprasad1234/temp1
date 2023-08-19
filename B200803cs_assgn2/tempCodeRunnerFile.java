public class Q8 {
   public static void main(String [] args)
   {
        Scanner myObj=new Scanner( System.in);
        ArrayList<Train> arr=new ArrayList<>();
        //System.out.println(Type.F);
        while(true)
        {
            int k=myObj.nextInt();
            String temp=myObj.nextLine();
            if(k==1)
            {
                String str=myObj.nextLine();
                String []strArray=str.split(" ");
                int busNo=Integer.parseInt(strArray[0]);
                String from=strArray[1];
                String to=strArray[2];
                int distance=Integer.parseInt(strArray[3]);
                
                String type1="O";
                if(strArray.length>=5)
                    type1=strArray[4];
                Type x=Type.valueOf(type1);
                
                Train t=new Train(busNo,from,to,distance,x);
                arr.add(t);
            }
            else if(k==2)
            {
                for(int i=0;i<arr.size();i++)
                {
                    arr.get(i).show();
                }
            }
            else
                break;
        }
   } 
}
