package Chapter8.day17.homework;

public interface ICartBiz {
		//1)添加商品到购物车（输入商品的编号和数量）
		public void addToCart(Product pro, int number);
		
		//2)删除商品（删除购物车中的指定购物项）
		public void delete(Product pro);
		
		//3)修改商品（修改商品的数量）
		public void modifyNum(Product pro, int number);
		
		//4)显示所购买的商品信息（按购买商品的总价进行升序显示）
		public void showAllProductsByTotalPrice();
}
