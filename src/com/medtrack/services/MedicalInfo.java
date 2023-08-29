package com.medtrack.services;

public class MedicalInfo 
{
	public static String memail;
	public static String  mname;
	public static boolean flag1 =false;
	public static boolean flag2 =false;
	public static boolean flag3 =false;
	public static boolean isFlag3() {
		return flag3;
	}
	public static void setFlag3(boolean flag3) {
		MedicalInfo.flag3 = flag3;
	}
	public static String getMemail() {
		return memail;
	}
	public static void setMemail(String memail) {
		MedicalInfo.memail = memail;
	}
	public static String getMname() {
		return mname;
	}
	public static void setMname(String mname) {
		MedicalInfo.mname = mname;
	}
	public static boolean isFlag1() {
		return flag1;
	}
	public static void setFlag1(boolean flag1) {
		MedicalInfo.flag1 = flag1;
	}
	public static boolean isFlag2() {
		return flag2;
	}
	public static void setFlag2(boolean flag2) {
		MedicalInfo.flag2 = flag2;
	}
	
	
	
}
