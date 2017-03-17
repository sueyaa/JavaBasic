package Chapter7.homework.day12.electric_equipment;

public class TV extends ElectricEquipment{
	public String getName() {
		return "电视";
	}
	public void open(){
		System.out.println("开" + getName());
	}
	
	public void close(){
		System.out.println("关" + getName());
	}
}
