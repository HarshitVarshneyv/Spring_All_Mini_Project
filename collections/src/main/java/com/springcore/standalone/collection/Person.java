package com.springcore.standalone.collection;
import java.util.List;
import java.util.Map;
public class Person {
       private List<String> friends;
       private Map<String , Integer> feestructure;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	
	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructure=" + feestructure + "]";
	}


	
     

	
}