package iterator.Model;

import iterator.Method.Aggregate;
import iterator.Method.Iterator;
import iterator.Method.IteratorBookshelf;

public class BookShelf implements Aggregate {
	private Book books[];
	//定义指针的位置
	private int last=0;
	//获取数据额书
	
	public Book  getBookAt(int index) {
		return books[index];
	}
	public BookShelf(int maxsize) {
		this.books=new Book[maxsize];
	}
	//获取长度
	public int getLength() {
		return last;
	}
	//添加书
	public void  appendBook(Book book) {
		this.books[last]=book;
		last++;
	}
	//添加
	@Override
	public Iterator iterator() {
		
		return new IteratorBookshelf(this);
	}
}
