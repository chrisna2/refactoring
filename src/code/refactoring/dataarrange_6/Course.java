package code.refactoring.dataarrange_6;

public class Course {

	String _name;
	boolean _isAdvanced;
	
	public Course (String name, boolean isAdvanced) {  
		_name = name ;
		_isAdvanced = isAdvanced ;
	};
	public boolean isAdvanced() {  return _isAdvanced; };
	
}
