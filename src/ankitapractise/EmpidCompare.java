package ankitapractise;

import java.util.Comparator;

public class EmpidCompare implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.empid==e2.empid)
		return 0;
		else if(e1.empid>e2.empid) {
			return 1;
		}
			else return -1;
		}

}
