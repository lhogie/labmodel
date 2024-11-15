package labmodel.model.v0;

import java.util.List;
import java.util.function.Consumer;

public class Contract {

	String name;
	Person holder;
	List<Person> subHolders;
	List<Person> coordinator;
	List<Person> partners;
	List<Person> misc;

	public void forEachMember(Consumer<Person> c) {

	}
}
