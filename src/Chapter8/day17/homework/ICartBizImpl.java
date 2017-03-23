package Chapter8.day17.homework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ICartBizImpl implements ICartBiz{
	Cart cart = new Cart();
	
	@Override
	public void addToCart(Product pro, int number) {
		if(pro == null){
			return;
		}
		if(cart.map.containsKey(pro)){
			cart.map.put(pro, number +cart.map.get(pro));
		}else{
			cart.map.put(pro, number);
		}
	}

	@Override
	public void delete(Product pro) {
		if(pro == null){
			return;
		}
		if(cart.map.containsKey(pro)){
			cart.map.remove(pro);
		}else{
			System.out.println("购物车不包含此商品");
		}
		
	}

	@Override
	public void modifyNum(Product pro, int number) {
		if(pro == null){
			return;
		}
		if(cart.map.containsKey(pro)){
			cart.map.replace(pro,cart.map.get(pro), number);
		}else{
			System.out.println("购物车不包含此商品");
		}
		
	}

	@Override
	public void showAllProductsByTotalPrice() {
		// TODO Auto-generated method stub
		cart.showAllProducts();
	}
	
	public void sortMap(Map<Product,Integer> map){
		Set<Entry<Product,Integer>> e = map.entrySet();
		
	}

}
