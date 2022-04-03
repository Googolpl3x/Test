class Test
{
    void run()
    {
        int a = 2;
        int b = 4;
        int c = a + b;
        while(a <= 102 && b <= 102)
        {
            a = a + 4;
            b = b + 4;
            c = a + b + c;
        }
        
        System.out.println(c);
    }
    
    
    void run2()
    {
        int a = 2;
        int b = 0;
        int c = a + b;
        while(a <= 102)
        {
            b = b + a;
            a = a + 2;
        }
        
        System.out.println(b);
    }
}
