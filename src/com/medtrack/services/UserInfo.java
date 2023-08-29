package com.medtrack.services;

public class UserInfo 
{
	public static String uemail;
	public static String  uname;
	public static double ulongitude;
	public static double ulatitude;
	public static double getUlongitude() {
		return ulongitude;
	}
	public static void setUlongitude(double ulongitude) {
		UserInfo.ulongitude = ulongitude;
	}
	public static double getUlatitude() {
		return ulatitude;
	}
	public static void setUlatitude(double ulatitude) {
		UserInfo.ulatitude = ulatitude;
	}
	
	
	public static boolean flag1 =false;
	public static boolean flag2 =false;
	public static boolean flag3 =false;
	public static String getUemail() {
		return uemail;
	}
	public static void setUemail(String uemail) {
		UserInfo.uemail = uemail;
	}
	public static String getUname() {
		return uname;
	}
	public static void setUname(String uname) {
		UserInfo.uname = uname;
	}
	public static boolean isFlag1() {
		return flag1;
	}
	public static void setFlag1(boolean flag1) {
		UserInfo.flag1 = flag1;
	}
	public static boolean isFlag2() {
		return flag2;
	}
	public static void setFlag2(boolean flag2) {
		UserInfo.flag2 = flag2;
	}
	public static boolean isFlag3() {
		return flag3;
	}
	public static void setFlag3(boolean flag3) {
		UserInfo.flag3 = flag3;
	}
	
}
