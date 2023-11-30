package threads;

public class DeadLockExample {

    public static void main(String[] args) {
        final String resource1="Java";
        final String resource2="World";
        Thread t1=new Thread()
        {
            public void run()
            {
                synchronized (resource1) 
                {
                    System.out.println("Thread 1: locked resource 1"+resource1);  
                    try
                    {
                        Thread.sleep(2000);
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2"+resource2);  
                    try
                    {
                        Thread.sleep(2000);
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }
                
            
                }
            };
            Thread t2=new Thread(){
                public void run()
                {
                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1"+resource1);  
                        try
                        {
                            Thread.sleep(2000);
                            
                        }
                        catch(Exception e)
                        {
                            System.out.println(e);
                        }
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 2: locked resource 2"+resource2);  
                        try
                        {
                            Thread.sleep(2000);
                            
                        }
                        catch(Exception e)
                        {
                            System.out.println(e);
                        }
                    }
                    
                
                    }
                };
                
            t1.start();
            t2.start();


    }

}
