package com.bhupi.models;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //Need Default Constructor for JSON Parsing
public class AuthenticationRequest implements Serializable{

	private static final long serialVersionUID = 7865709435088923250L;
	
	private String username;
	private String password;
}
