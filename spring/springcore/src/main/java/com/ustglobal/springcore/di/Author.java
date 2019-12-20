package com.ustglobal.springcore.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Author {
private String name;
private String pen_name;

public Author() {
	System.out.println("Author created");
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPen_name() {
	return pen_name;
}
public void setPen_name(String pen_name) {
	this.pen_name = pen_name;
}

@PostConstruct
public void init() {
	System.out.println("This is init method exeuting fronm hello");
}
@PreDestroy
public void destroy() {
	System.out.println("This is Destroy method exeuting fronm hello");
}

}
