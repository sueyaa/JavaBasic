package Chapter7.homework.day12.electric_equipment;

public class People {
	private String name;
	private ElectricEquipment elt;
	
	public People(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ElectricEquipment getElt() {
		return elt;
	}

	public void setElt(ElectricEquipment elt) {
		this.elt = elt;
	}
	
	public void open(){
		elt.open();
	}
	
	public void close(){
		elt.close();
	}
	
}
