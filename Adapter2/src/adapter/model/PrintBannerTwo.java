package adapter.model;
/**
 * 相当于小姐妹的"经济人"
 * @author zengrong
 * 小姐妹的经纪人肯定要知道小姐妹的想的啥，当然继承了就完全知道了。
 * 经纪人为了给小姐妹接*，肯定要实现你的方法，来满足你的需求！
 * 哈哈。。。。
 *
 *这是适配器模式中得：类继承的适配模式
 *
 *
 *
 */
public class PrintBannerTwo extends PrintTwo {

	private BannerTwo Banner2;
	
	public PrintBannerTwo(String str) {
		super();
		this.Banner2=new BannerTwo(str);
	}

	@Override
	public void printHow() {
		Banner2.showWithAster();
		
	}

	@Override
	public void printOneNightHowMuch() {
		Banner2.showWithAster();
		
	}



}
