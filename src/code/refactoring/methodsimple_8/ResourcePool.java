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

	//to-be : 
	Resource getResource() {
		
	    Resource result;
	    
	    if(_available.isEmpty()) {
			result = new Resource();
			_allocated.push(result);
			return result;
	    }
	    
	 	result = (Resource)_available.pop();
	 	_allocated.push(result);
	 	return result;
	    // Resource ���� ����ġ���� ���� �ƴϹǷ� ����ó���� ������� �ʴ� ���� ����
	}
	   
	/*
	//as-is : 
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
   }*/
}
