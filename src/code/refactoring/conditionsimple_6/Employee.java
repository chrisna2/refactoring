package code.refactoring.conditionsimple_6;

public class Employee {
	//as-is
	private static final double NULL_EXPENSE = -1.0;
	private double _expenseLimit = NULL_EXPENSE;
	private Project _primaryProject;
	double getExpenseLimit() { 
		_primaryProject=new Project(); 
	    // ��� �ѵ��� �ε���, �ֿ� ������Ʈ�� ���ؾ��Ѵ�.
	   return (_expenseLimit != NULL_EXPENSE) ?
	       _expenseLimit:
	       _primaryProject.getMemberExpenseLimit();
	}
	boolean withinLimit (double expenseAmount) {
	   return (expenseAmount <= getExpenseLimit());
	}
}
