package c4.inheritance.multiple.classs;

public class Child extends Father /*, mother */ {
	//Child can not have multiple inheritance 
	//because when sub class extends super class, it's not necessary to override
	//Therefore when super classes have the same declaration methods -> sub class can not recognize method to invoke
}
