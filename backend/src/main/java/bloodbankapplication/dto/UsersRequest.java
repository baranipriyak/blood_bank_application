package bloodbankapplication.dto;

import bloodbankapplication.dao.Address;
import bloodbankapplication.dao.User;
import bloodbankapplication.dao.Users;

public class UsersRequest {

	private Users users;
	private Address address;
	private User user;
	public UsersRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsersRequest(Users users, Address address, User user) {
		super();
		this.users = users;
		this.address = address;
		this.user = user;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UsersRequest [users=" + users + ", address=" + address + ", user=" + user + "]";
	}
	
	
}
