package Chapter7.homework.day12.electric_equipment;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People("ะกร๗");
		ElectricEquipment e1 = new Lamp();
		ElectricEquipment e2 = new ElectricFan();
		ElectricEquipment e3 = new TV();
		
		p.setElt(e1);
		p.open();
		p.close();
		
		p.setElt(e2);
		p.open();
		p.close();
		
		p.setElt(e3);
		p.open();
		p.close();
	}

}
