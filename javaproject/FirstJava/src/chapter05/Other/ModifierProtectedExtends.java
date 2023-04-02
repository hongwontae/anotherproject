package chapter05.Other;

import chapter05.ModifierProtected;

public class ModifierProtectedExtends extends ModifierProtected {

	//name과 age, tell 메서드는  ModifierProtectedExtends는 chapter05.ModifierProtected 이거 가져옴
	
	public static void main(String[] args) {
		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
		
		mpe.name = "이강인";
		mpe.age = 30;
		
		mpe.tell();
	}
	
	
}
