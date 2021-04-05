package NewTest;

public class IInterfaceB_studentdetails extends IInterfaceA_address{
	int studid;
	String classname;
	public IInterfaceB_studentdetails(int studid,String classname){
		this.studid =studid;
		this.classname=classname;
	}
	
	
			public static void main(String[] args) {
				IInterfaceB_studentdetails aa = new IInterfaceB_studentdetails(11,"AAAA");
				aa.address("India", 55555, 1111);
				System.out.println(aa.studid+"--"+aa.classname+"--"+aa.country);
			}
}
