package lessons.group9;

import java.io.IOException;

class A20{ 
    public A20 method() throws Throwable{ // 1 
        return new Single(); 
        }  
    }  
class Single extends A20{ 
    public Single method(String str) throws RuntimeException{ // 2 
        return new Single();  
        } 
    public Single method() throws Exception{  //3 
        return new Double();  
        }  
    }  
class Double extends Single{ 
    public void method(Integer digit) throws ClassCastException{      
    } 
    public Double method() throws IOException{   
        return new Double();  
        } 
    } 