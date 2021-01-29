package com.rabbitmqapp.code;

import java.io.Serializable;

public class SimpleMessage implements Serializable {
private String name;
private String description;

public SimpleMessage() {
	
}

public void setName(String name) {
	this.name = name;
}

public void setDescription(String desc) {
	this.description = desc;
}

public String getName() {
	return this.name;
}

public String getDescription() {
	return this.description;
}

}
