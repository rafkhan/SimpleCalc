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
	private char operator;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	this.currentField = "";
    	this.operator = ' ';
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void setAnswer() {
    	TextView tvId = (TextView) findViewById(R.id.inputField);
    	tvId.setText(this.currentField);
    }
    
    public void b1(View v) {
    	if(this.currentField.length() <= MAX_CHAR) {
    		this.currentField += "1";
    	}
    	this.setAnswer();
    }
    
    public void b2(View v) {
    	if(this.currentField.length() <= MAX_CHAR) {
    		this.currentField += "2";
    	}
    	this.setAnswer();
    }

    public void b3(View v) {
    	if(this.currentField.length() <= MAX_CHAR) {
    		this.currentField += "3";
    	}
    	this.setAnswer();
    }
    
    public void b4(View v) {
    	if(this.currentField.length() <= MAX_CHAR) {
    		this.currentField += "4";
    	}
    	this.setAnswer();
    }
    
    public void b5(View v) {
    	if(this.currentField.length() <= MAX_CHAR) {
    		this.currentField += "5";
    	}
    	this.setAnswer();
    }	
    
    public void b6(View v) {
    	if(this.currentField.length() < MAX_CHAR) {
    		this.currentField += "6";
    	}
    	this.setAnswer();
    }
    
    public void b7(View v) {
    	if(this.currentField.length() < MAX_CHAR) {
    		this.currentField += "7";
    	}
    	this.setAnswer();
    }

    public void b8(View v) {
    	if(this.currentField.length() < MAX_CHAR) {
    		this.currentField += "8";
    	}
    	this.setAnswer();
    }
    
    public void b9(View v) {
    	if(this.currentField.length() < MAX_CHAR) {
    		this.currentField += "9";
    	}
    	this.setAnswer();
    }
    
    public void b0(View v) {
    	if(this.currentField.length() < MAX_CHAR) {
    		this.currentField += "0";
    	}
    	this.setAnswer();
    }
    
    public void bCLR(View v) {
    	this.currentField = "";
    	this.operand1 = 0f;
    	this.operand2 = 0f;
    	this.answer = 0f;
    	this.setAnswer();
    }
    
    public void bAdd(View v) {
    	this.operator = '+';
    }
    
    public void bSub(View v) {
    	this.operator = '-';
    }

    public void bMul(View v) {
    	this.operator = '*';
    }

    public void bDiv(View v) {
    	this.operator = '/';
    }
    
    public void bEql(View v) {
    	switch(this.operator) {
    		case '+':
    			this.answer = this.operand1 + this.operand2;
    		case '-':
    			this.answer = this.operand1 - this.operand2;
    		case '*':
    			this.answer = this.operand1 * this.operand2;
    		case '/':
    			this.answer = this.operand1 / this.operand2;
    	}
    }
}