package org.tnsindia.di1;

//class2
public class Student1  {
	//2.DI in the forms of object
	MathCheat math;
	
	//DI using setter	
	public void setMath(MathCheat math) {
		this.math = math;
	}

	//MathCheat m=new MathCheat();
	public void cheating()
	{
		math.mathcheat();
	}

}