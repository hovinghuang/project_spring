package com.tutorialspoint.di004;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	List addressList;// 它有助于连线，如注入一列值，允许重复。
	Set addressSet;// 它有助于连线一组值，但不能重复。
	Map addressMap;// 它可以用来注入名称-值对的集合，其中名称和值可以是任何类型。
	Properties addressProp;// 它可以用来注入名称-值对的集合，其中名称和值都是字符串类型。

	// a setter method to set List
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	// prints and returns all the elements of the list.
	public List getAddressList() {
		System.out.println("List Elements :" + addressList);
		return addressList;
	}

	// a setter method to set Set
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	// prints and returns all the elements of the Set.
	public Set getAddressSet() {
		System.out.println("Set Elements :" + addressSet);
		return addressSet;
	}

	// a setter method to set Map
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	// prints and returns all the elements of the Map.
	public Map getAddressMap() {
		System.out.println("Map Elements :" + addressMap);
		return addressMap;
	}

	// a setter method to set Property
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	// prints and returns all the elements of the Property.
	public Properties getAddressProp() {
		System.out.println("Property Elements :" + addressProp);
		return addressProp;
	}
}
