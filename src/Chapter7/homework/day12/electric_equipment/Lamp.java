package Chapter7.homework.day12.electric_equipment;

public class Lamp extends ElectricEquipment{
	public String getName() {
		return "���";
	}
	public void open(){
		System.out.println("��" + getName());
	}
	
	public void close(){
		System.out.println("��" + getName());
	}
}
