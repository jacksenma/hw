package edu.nju.hw.model;

public class User {
	 public int id;
	 public String name;
	 public String password;
	 public int role;
	 
//	 public User(int id,String name,String password,int role){
//		 this.id=id;
//		 this.name=name;
//		 this.password=password;
//		 this.role=role;
//	 }
	 
	 public int getId(){
		 return id;
	 }
	 public void setId(int id){
		 this.id=id;
	 }
	 
	 public String getName(){
		 return name;
	 }
	 public void setName(String name){
		 this.name=name;
	 }
	 public String getPassword(){
		 return password;
	 }
	 public void setPassword(String password){
		 this.password=password;
	 }
	 public int getRole(){
		 return role;
	 }
	 public void setRole(int role){
		 this.role=role;
	 }
	
	
}
