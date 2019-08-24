package code.refactoring.methodsimple_8;

import java.util.EmptyStackException;
import java.util.Stack;

public class ResourcePool {

	Stack _available;
	Stack _allocated;
	
	ResourcePool(){
		  _available=new Stack();
		  _allocated=new Stack();
	}
	
   Resource getResource() {
       Resource result;
       
       try {
    	   result = (Resource)_available.pop();
    	   _allocated.push(result);
    	   return result;
       } catch (EmptyStackException e) {
    	   result = new Resource();
    	   _allocated.push(result);
    	   return result;
       }
      
       // Resource ���� ����ġ���� ���� �ƴϹǷ� ����ó���� ������� �ʴ� ���� ����
   }
}
