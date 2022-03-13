package hello;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO sorting numeric list
        ArrayList<Integer>myNumbers=new ArrayList<Integer>();
        myNumbers.add(20);
        myNumbers.add(15);
        myNumbers.add(10);
        myNumbers.add(25);
        myNumbers.stream().sorted().forEach(System.out::println);
	}

}
