package com.akshay.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employe {
@Value("#{2+3}")	
public int sum;
@Value("#{7-3}")
public int sub;
@Value("#{2*3}")
public int mul;
@Value("#{10/3}")
public float div;
@Override
public String toString() {
	return "Employe [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + "]";
}

	
}
