package com.bhupi.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = -858129313624250935L;

	private String jwt;

}
