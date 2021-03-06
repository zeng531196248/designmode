package inter.pro.two;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器
 * @author zengrong
 *，作为对所有原型对象的登记，
 *这个角色提供必要的方法，
 *供外界增加新的原型对象和取得已经登记过的原型对象。
 */
public class PromManger {
		/**
		 * 用来记录原型
		 */
	private static Map<String,PrototypeTwo> map = new HashMap<String,PrototypeTwo>();
		
	private PromManger(){}//私有化构造
	
	/**
	 * 设置一个方法来进行向原型集合中添加
	 */
	public synchronized static void setPrototypes(String prototypeId,PrototypeTwo prototypeTwo) {
		map.put(prototypeId, prototypeTwo);
		
	}
	 /**
     * 从原型管理器里面删除某个原型注册
     * @param prototypeId 原型编号
     */
    public synchronized static void removePrototype(String prototypeId){
        map.remove(prototypeId);
    }
	
	/**
	 * 获取原型
	 */
    public synchronized static  PrototypeTwo getPrototypeTwo( String prototypeId) {
		PrototypeTwo prototypeTwo = map.get(prototypeId);
		if(prototypeTwo==null){
			System.out.println("该原型还没有进行登记注册------无法获取---");
		}
		return prototypeTwo;
	}
    
	
	
}
