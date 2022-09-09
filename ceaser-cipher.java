public static void main(String[] args) {
        String str="middle-Outz";
        char []arr=str.toCharArray();
       int k=2;
        char last='z';
      for(char c:arr)
      {
          int i=(char)last;
          if(c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='-'||c=='!')
          {
              System.out.print(c);
          }
          if(c=='z')
          {
              System.out.print((char)(i-24));
          }
         if(c>='a'&&c<='y')
          {
              System.out.print((char)(k+c));
          }
         if(c>='A'&&c<='Y')
         {
             System.out.print((char)(k+c));
         }
          
      }