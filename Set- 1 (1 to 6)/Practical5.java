class Practical5
 {
    public static void main(String []args)
    {
        int[] code={1,2,3,4,5};
        int[] price={20,40,50,100,200};

        float tax;

        for(int i=0 ; i<5 ;i++)
        {

            tax=0;
            switch (code[i])
            {
                case 1 : 
                    tax += price[i] + (price[i]*0.08);
                    System.out.println("total price :"+ tax);
                    break;
                

                case 2 : 
                    tax += price[i] + (price[i]*0.12);
                    System.out.println("total price :"+ tax);
                    break;
                

                case 3 : 
                    tax += price[i] + (price[i]*0.05);
                    System.out.println("total price :"+ tax);
                    break;
                

                case 4 : 
                    tax += price[i] + (price[i]*0.075);
                    System.out.println("total price :"+ tax);
                    break;
                

                default : 
                    tax += price[i] + (price[i]*0.03);
                    System.out.println("total price :"+ tax);
                    
                    break;
                
            }
            
        }
    }

}