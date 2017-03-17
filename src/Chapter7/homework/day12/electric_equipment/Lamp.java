package Chapter7.homework.day12.electric_equipment;

public class Lamp extends ElectricEquipment{
	public String getName() {
		return "µçµÆ";
	}
	public void open(){
		System.out.println("¿ª" + getName());
	}
	
	public void close(){
		System.out.println("¹Ø" + getName());
	}
}
