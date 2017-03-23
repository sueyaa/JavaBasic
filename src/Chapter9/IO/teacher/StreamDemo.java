package Chapter9.IO.teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 瀛楄妭娴�
 * 璇惧爞缁冧範:
 * 澶嶅埗纾佺洏涓婁竴寮犲浘鐗囧埌鍙﹀涓�涓鐩�
 * 1.灏嗙鐩樹笂鐨勫浘鐗囩敤瀛楄妭娴佽鍙栧埌鍐呭瓨涓�
 * (File -> 鎸囧悜婧愭枃浠剁殑)
 * 2.鍒╃敤杈撳嚭娴佸皢鍐呭瓨涓殑鍥剧墖鍐欏埌鏈湴鐨勫彟澶栦竴涓鐩樹腑
 * (File -> 鎸囧悜鏂扮殑鍦板潃鐨�)
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class StreamDemo {
	
	
	public static void main(String[] args) {
		
		StreamDemo sd = new StreamDemo();
		File file = new File("E:\\A\\A.txt");
		try {
			//sd.writeToFile(file, "涓婃捣琚彨鍋氶瓟閮芥湁璋佺煡閬撲负浠�涔�.");
			String temp = sd.readFromFile(file);
			System.out.println(temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}

	
	
	/**
	 * 浣跨敤瀛楄妭娴佸悜鏂囦欢涓啓鍏ュ唴瀹�
	 * @param file  瑕佸啓鍏ョ殑鏂囦欢
	 * @param content 瑕佸啓鍏ョ殑鍐呭
	 * @throws IOException  鍥犱负FileNotFound鏄疘O鐨勫瓙绫�.鎶涘嚭鐖剁被鍙互浠ｈ〃鍏跺瓙绫诲拰鐖剁被鏈韩.
	 */
	public void writeToFile(File file,String content) throws IOException{
		//--1.瀵瑰弬鏁板仛妫�鏌�
		if (file == null || content == null || content.length() == 0) {
			return ;
		}
		//--2.鏍规嵁鍙傛暟涓殑File瀵硅薄鏋勫缓涓�涓緭鍑烘祦瀵硅薄
		/*
		 * file 娴佽杈撳嚭鍒伴偅涓枃浠朵腑.
		 * true boolean append 鏄惁宸茶拷鍔犵殑褰㈠紡鍐欏叆鏁版嵁
		 * 濡傛灉涓嶆寚瀹氳鍊间娇鐢ㄥ彧鏈変竴涓狥ile浣滀负鍙傛暟鐨勬垨鑰呰繖閲�
		 * 缁檉alse.閭ｄ箞绗簩娆℃彃鍏ョ殑鍐呭浼氭妸绗竴娆℃彃鍏ョ殑瑕嗙洊
		 */
		OutputStream os = new FileOutputStream(file);
		
		//--3.閫氳繃娴佸璞¤皟鐢ㄧ殑鍐欐柟娉曡繘琛屽悜鏂囦欢涓啓鍏ュ唴瀹�
		
		/*
		 *b 瑕佸啓鍏ョ殑鍐呭.鍥犱负鏄瓧鑺傛祦鎵�浠ヨ繖閲岀殑b鏄瓧鑺傛暟缁�.
		 *off offset 鍋忕Щ閲�.灏嗘暟鎹簮鍐欏叆鏂囦欢鏃�.璁╁厜鏍囪繘琛屽亸绉�.鍐冲畾浠庡摢閲屽紑濮嬫彃鍏ュ埌鏂囦欢涓�
		 *len length.闀垮害瑕佸啓鍏ョ殑闀垮害. 
		 */
		os.write(content.getBytes());
		//os.write(b);//--int
		//os.write(b);//--byte[]
		//--4.灏嗘祦鍏抽棴
		os.close();	
	}
	
	
	/**
	 * 浠庢枃浠朵腑璇诲彇鍐呭
	 * @param file
	 * @return
	 * @throws IOException 
	 */
	public String readFromFile(File file) throws IOException{
		
		//--1.瀵瑰弬鏁板仛楠岃瘉
		if (file == null) {
			throw new IllegalArgumentException("鍙傛暟鏈夐棶棰�");
		}
		
		//--2.鏍规嵁鍙傛暟File鏋勫缓杈撳叆娴佸璞�
		InputStream is = new FileInputStream(file);
		//--3.鎻愪緵瀛楄妭鏁扮粍鐢ㄦ潵淇濆瓨浠庢枃浠朵腑璇诲彇鐨勫唴瀹�
		//--鏁扮粍鐨勯暱搴﹂�氬父鏄�256鐨勬暣鏁板��.瓒呰繃2048姣旇緝灏戣
		byte[] buffer = new byte[1024];
		//--4.閫氳繃娴佸璞′腑鐨剅eand鏂规硶杩涜璇诲彇.灏嗗唴瀹硅鍙栧埌鏁扮粍涓�	
		is.read(buffer);
		//--5.灏嗘祦鍏抽棴
		is.close();
		//--6.鎶婂瓧鑺傛暟缁勬瀯寤烘垚涓�涓猄tring瀵硅薄.骞惰繑鍥�.
		return new String(buffer);
	}
}
