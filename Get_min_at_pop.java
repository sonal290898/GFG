
class GetMin
{
     
        public static Stack<Integer> _push(int arr[],int n)
    {
        Stack<Integer> ast = new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            ast.push(arr[i]);
            // _getMinAtPop(ast);
        }
        
       return ast;
    }
    
     
    static void _getMinAtPop(Stack<Integer>s)
    {
        Stack<Integer> res = new Stack<>();
        int count = 0;
        
        while( !s.isEmpty())
        {
            count++;
            int curr = s.pop();
            res.push(curr);
        }
        
        int ans[] = new int[count];
        int mini = Integer.MAX_VALUE;
        
        for(int i=0;i<count;i++)
        {
            int curr1 = res.pop();
            mini = Math.min(mini,curr1);
            ans[i] = mini;
            
        }
        
        for(int i=count-1; i>=0; i--)
        {
            System.out.print(ans[i]+" ");
            
        }
    
        return;
        
        
    }

}
