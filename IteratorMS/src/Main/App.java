package Main;

import iterator.Method.Iterator;
import iterator.Model.Book;
import iterator.Model.BookShelf;

/**
 * 
 * @author zengrong
 *  测试
 */
public class App {
	public static void main(String[] args) {
		BookShelf bookShelf=new BookShelf(5);
		Book book =new Book("苍老师日语全集");
		Book book2 =new Book("电影AV无码");
		Book book3 =new Book("小泽从你的全世界路过");
		Book book4 =new Book("自己动手丰衣足食");
		Book book5 =new Book("给我一个杠杆我会撬动你");
		bookShelf.appendBook(book);
		bookShelf.appendBook(book2);
		bookShelf.appendBook(book3);
		bookShelf.appendBook(book4);
		bookShelf.appendBook(book5);
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book bo = (Book) it.next();
			System.out.println(bo);
		}
		
		
	}
}
