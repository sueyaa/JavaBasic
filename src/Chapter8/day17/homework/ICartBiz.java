package Chapter8.day17.homework;

public interface ICartBiz {
		//1)�����Ʒ�����ﳵ��������Ʒ�ı�ź�������
		public void addToCart(Product pro, int number);
		
		//2)ɾ����Ʒ��ɾ�����ﳵ�е�ָ�������
		public void delete(Product pro);
		
		//3)�޸���Ʒ���޸���Ʒ��������
		public void modifyNum(Product pro, int number);
		
		//4)��ʾ���������Ʒ��Ϣ����������Ʒ���ܼ۽���������ʾ��
		public void showAllProductsByTotalPrice();
}
