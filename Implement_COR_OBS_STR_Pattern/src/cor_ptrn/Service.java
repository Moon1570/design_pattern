package cor_ptrn;

public class Service {
	private String name;
	private int dmg;

	
	public Service(String name, int dmg) {
		super();
		this.name = name;
		this.dmg = dmg;
	}


	public String getName() {
		return name;
	}



	public int getDmg() {
		return dmg;
	}

	
	public void ShowDetails() {
		System.out.println("-----------------------------");
		System.out.println("Task: "+name+" => dmg: "+ dmg);
	
	}
}
	

	