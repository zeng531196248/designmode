package iterator.Method;

import iterator.Model.Book;
import iterator.Model.BookShelf;

/*
 * 遍历书架上面书的类
 */
public  class IteratorBookshelf implements Iterator{
	private BookShelf bookShelf;
	private int index;
	
	
	public IteratorBookshelf(BookShelf bookShelf) {
		super();
		this.bookShelf = bookShelf;
	}

	public boolean hasNext() {
		if(index<bookShelf.getLength()){
			return true;
		}else{
		return false;}
	}

	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book ;
	}

}
