package org.jsp.SpringDemo;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {
	private List<String> names;
	private Set<Integer> ids;
	private Map<Integer,String> datails;
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<Integer> getIds() {
		return ids;
	}
	public void setIds(Set<Integer> ids) {
		this.ids = ids;
	}
	public Map<Integer, String> getDatails() {
		return datails;
	}
	public void setDatails(Map<Integer, String> datails) {
		this.datails = datails;
	}
	

}
