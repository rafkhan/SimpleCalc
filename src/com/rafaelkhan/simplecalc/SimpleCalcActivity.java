package com.rafaelkhan.simplecalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SimpleCalcActivity extends Activity {
	
	public final int MAX_CHAR = 10; //max characters in input field
	public String currentField; //input field
	public Float operand1;
	public Float operand2;
	public Float answer;
	public Boolean overwrite = true;
	public Boolean canOp = true;
	private char operator;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	this.currentField = "0";
    	this.operator = ' ';
    	this.operand1 = 0f;
    	this.operand2 = 0f;
    	this.answer = 0f;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	this.setAnswer();
    }
    
    public void setAnswer() { //update field
    	TextView tvId = (TextView) findViewById(R.id.inputField);
    	tvId.setText(this.currentField);
    }
    
    public void setField(String s) { //set field to value of s
    	if(s.endsWith(".0")) {
    		s = s.substring(0, s.length() - 2);
    	}
    	TextView tvId = (TextView) findViewById(R.id.inputField);
    	tvId.setText(s);
    }
    
    public void b1(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "1";
    		}
    		else {
    			this.currentField += "1";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "1";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }
    
    public void b2(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "2";
    		}
    		else {
    			this.currentField += "2";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "2";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }

    public void b3(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "3";
    		}
    		else {
    			this.currentField += "3";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "3";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }
    
    public void b4(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "4";
    		}
    		else {
    			this.currentField += "4";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "4";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }
    
    public void b5(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "5";
    		}
    		else {
    			this.currentField += "5";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "5";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }	
    
    public void b6(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "6";
    		}
    		else {
    			this.currentField += "6";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "6";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }
    
    public void b7(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "7";
    		}
    		else {
    			this.currentField += "7";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "7";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }

    public void b8(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "8";
    		}
    		else {
    			this.currentField += "8";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "8";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }
    
    public void b9(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "9";
    		}
    		else {
    			this.currentField += "9";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "9";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }
    
    public void b0(View v) {
    	if(this.currentField.length() <= MAX_CHAR && this.overwrite == false) {
    		if(this.currentField.equals("0")) {
    			this.currentField = "0";
    		}
    		else {
    			this.currentField += "0";
    		}
    	}
    	else if(this.overwrite) {
    		this.currentField = "0";
    		this.overwrite = false;
    	}
    	this.setAnswer();
    }
    
    public void bCLR(View v) {
    	this.currentField = "0";
    	this.operator = ' ';
    	this.operand1 = 0f;
    	this.operand2 = 0f;
    	this.answer = 0f;
    	this.setField(this.currentField);
    }
    
    public void bAdd(View v) {
    	if(this.operator != ' ') {
    		this.operand1 = Float.valueOf(this.currentField).floatValue();
    		this.solve();
    		this.operator = '+';
    		this.currentField = this.answer.toString();
    		this.setField(currentField);
    		this.operand2 = this.answer;
    		this.overwrite = true;
    	}
    	else {
    		this.operator = '+';
    		this.operand2 = Float.valueOf(this.currentField).floatValue();
    		this.currentField = "0";
    		this.setField(currentField);
    		this.overwrite = true;		
    	}
    }
    
    public void bSub(View v) {
    	if(this.operator != ' ') {
    		this.operand1 = Float.valueOf(this.currentField).floatValue();
    		this.solve();
    		this.operator = '-';
    		this.currentField = this.answer.toString();
    		this.setField(currentField);
    		this.operand2 = this.answer;
    		this.overwrite = true;
    	}
    	else {
    		this.operator = '-';
    		this.operand2 = Float.valueOf(this.currentField).floatValue();
    		this.currentField = "0";
    		this.setField(currentField);
    		this.overwrite = true; 		
    	}
    }

    public void bMul(View v) {
    	if(this.operator != ' ') {
    		this.operand1 = Float.valueOf(this.currentField).floatValue();
    		this.solve();
    		this.operator = '*';
    		this.currentField = this.answer.toString();
    		this.setField(currentField);
    		this.operand2 = this.answer;
    		this.overwrite = true;
    	}
    	else {
    		this.operator = '*';
    		this.operand2 = Float.valueOf(this.currentField).floatValue();
    		this.currentField = "0";
    		this.setField(currentField);
    		this.overwrite = true;
    	}
    }

    public void bDiv(View v) {
    	if(this.operator != ' ') {
    		this.operand1 = Float.valueOf(this.currentField).floatValue();
    		this.solve();
    		this.operator = '/';
    		this.currentField = this.answer.toString();
    		this.setField(currentField);
    		this.operand2 = this.answer;
    		this.overwrite = true;
    	}
    	else {
    		this.operator = '/';
    		this.operand2 = Float.valueOf(this.currentField).floatValue();
    		this.currentField = "0";
    		this.setField(currentField);
    		this.overwrite = true;
    	}
    }
    
    public void bEql(View v) {   	
    	this.operand1 = Float.valueOf(currentField).floatValue();
    	this.solve();
    	this.currentField = this.answer.toString();
		this.setField(this.currentField);
    	this.operator = ' ';
    	this.overwrite = true;
    }
    
    public void bNeg(View v) {
    	Float ans;
    	ans = Float.valueOf(this.currentField).floatValue();
    	ans *= -1;
    	this.currentField = ans.toString();
    	this.setField(this.currentField);
    }
    
    public void solve() {
    	switch(this.operator) {
		case '+':
			this.answer = this.operand2 + this.operand1;
			break;
		case '-':
			this.answer = this.operand2 - this.operand1;
			break;
		case '*':
			this.answer = this.operand2 * this.operand1;
			break;
		case '/':
			this.answer = this.operand2 / this.operand1;
			break;
    	}
    }
}