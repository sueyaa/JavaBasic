package Chapter7.homework.day12.electric_equipment;

public class ElectricFan extends ElectricEquipment{
	public String getName() {
		return "电风扇";
	}
	public void open(){
		System.out.println("开" + getName());
	}
	
	public void close(){
		System.out.println("关" + getName());
	}
}
