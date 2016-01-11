package com.dev.database;

import java.util.HashMap;
import java.util.Map;

import com.dev.model.Message;
import com.dev.model.User;

public class DatabaseClass {
	
	private static Map<Long, Message> messages=new HashMap<Long, Message>();
	private static Map<String, User> users=new HashMap<String, User>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<String, User> getUsers() {
		return users;
	}

}
