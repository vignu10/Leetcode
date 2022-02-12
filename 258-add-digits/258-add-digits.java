class Solution {
    public int addDigits(int num) {
        int sum=0,a,b;
        if(num<=9&&num>0)
            {
                return num;
            }
            if(num==0)
            {
                return 0;
            }
        while(num>9)
        {
            a=num%10;
            b=num/10;
            sum=a+b;
            num=sum;
             
        }
        System.out.print(sum);
        return sum;
    }
}