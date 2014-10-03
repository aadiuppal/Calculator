package com.hw4.calc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	public float num1=0,num2=0,result=0,product=1;
	public String n1,n2,op="";
	public boolean isdot=false;
	public boolean isresult = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//final float num1;
		//float num2, result;
		
		Button button1 = (Button)findViewById(R.id.button1);
		Button button2 = (Button)findViewById(R.id.button2);
		Button button3 = (Button)findViewById(R.id.button3);
		Button button4 = (Button)findViewById(R.id.button4);
		Button button5 = (Button)findViewById(R.id.button5);
		Button button6 = (Button)findViewById(R.id.button6);
		Button button7 = (Button)findViewById(R.id.button7);
		Button button8 = (Button)findViewById(R.id.button8);
		Button button9 = (Button)findViewById(R.id.button9);
		Button buttonzero = (Button)findViewById(R.id.button14);
		Button buttondot = (Button)findViewById(R.id.button13);
		Button buttonplus = (Button)findViewById(R.id.buttonplus);
		Button buttonmul = (Button)findViewById(R.id.button12);
		Button buttonminus = (Button)findViewById(R.id.buttonminus);
		Button buttonequal = (Button)findViewById(R.id.button15);
		Button buttonback = (Button)findViewById(R.id.button16);
		Button buttondiv = (Button)findViewById(R.id.button10);
		
		final TextView text = (TextView)findViewById(R.id.textView2);
		final TextView caldisp = (TextView)findViewById(R.id.textView1);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("1");
				caldisp.append("1");
			}
		});
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("2");
				caldisp.append("2");
			}
		});
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("3");
				caldisp.append("3");
			}
		});
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("4");
				caldisp.append("4");
			}
		});
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("5");
				caldisp.append("5");
			}
		});
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("6");
				caldisp.append("6");
			}
		});
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("7");
				caldisp.append("7");
			}
		});
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("8");
				caldisp.append("8");
			}
		});
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("9");
				caldisp.append("9");
			}
		});
		buttonzero.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				text.append("0");
				caldisp.append("0");
			}
		});
		buttonback.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.setText("");
				caldisp.setText("");
				result=0;
				num1=0;
				num2=0;
				product=1;
				isdot=false;
			}
		});
		buttondot.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isresult){
					text.setText("");
					} 
				if (!isdot){
				text.append(".");
				caldisp.append(".");
				}
				isdot=true;
			}
		});
		buttonplus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				n1= text.getText().toString();
				//String n1=(String) text.getText();
				if (!n1.equals("")){
					num1 = Float.parseFloat(n1);
				}
				else{
					num1=0;
				}
			
				if (op.equals("S")){
					result=result-num1;
					product=result;
				}
				else{
					if(op.equals("A")){
                        result = result + num1;
                        product=result;
                }
					if(op.equals("M")){
                        result = result * num1;
                        product = result;
                }
					if(op.equals("D")){
                        result = result / num1;
                        product = result;
                }
					else{
						result =result +num1;
					}
				}
				//result =result +num1;
				op = "A";
				if (text.getText().toString().equals("")){
					if(!caldisp.getText().toString().equals("")){
					String txt = caldisp.getText().toString(); 
				caldisp.setText(txt.substring(0, txt.length()-1));
					}
				}
				caldisp.append("+");
				text.setText("");
			}
		});
		buttonminus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				n1= text.getText().toString();
				//String n1=(String) text.getText();
				if (!n1.equals("")){
					num1 = Float.parseFloat(n1);
				}
				else{
					num1=0;
				}
				
				
				if (op.equals("S")){
					result=result-num1;
					product=result;
				}
				else{
					if(op.equals("A")){
				        result = result + num1;
                        product=result;
                }
					else if(op.equals("M")){
                        result = result * num1;
                        product = result;
                }
					else if(op.equals("D")){
                        result = result / num1;
                        product = result;
                }
					else{
						result =num1;
						product= result;
					}
				}
				op = "S";
				if (text.getText().toString().equals("")){
					if(!caldisp.getText().toString().equals("")){
					String txt = caldisp.getText().toString(); 
					caldisp.setText(txt.substring(0, txt.length()-1));
					}
				}
				caldisp.append("-");
				text.setText("");
			}
		});
		buttondiv.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				n1= text.getText().toString();
				//String n1=(String) text.getText();
				if (!n1.equals("")){
					num1 = Float.parseFloat(n1);
				}
				else{
					num1=0;
				}
				
				if (op.equals("S")){
					result=result-num1;
					product=result;
				}
				else{
					if(op.equals("A")){
                        result = result + num1;
                        product=result;
                }
					else if(op.equals("M")){
                        result = result * num1;
                        product = result;
                }
					else if(op.equals("D")){
						result = result / num1;
                        product = result;
                }
					else{
						result =num1;
						product=result;
					}
				}
				
				/*
				if (op.equals("D")){
					product=product/num1;
					result=product;
				}
				else{
				product =num1;
				result=product;
				}*/
				op = "D";
				if (text.getText().toString().equals("")){
					if(!caldisp.getText().toString().equals("")){
					String txt = caldisp.getText().toString(); 
					caldisp.setText(txt.substring(0, txt.length()-1));
					}
				}
				caldisp.append("/");
				text.setText("");
			}
		});
		buttonmul.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				n1= text.getText().toString();
				//String n1=(String) text.getText();
				//if(result.equals("0")){
					
				//}
				if (!n1.equals("")){
					num1 = Float.parseFloat(n1);
				}
				else {
					num1=0;
				}
				
				
				if (op.equals("S")){
					result=result-num1;
					product=result;
				}
				else{
					if(op.equals("A")){
                        result = result + num1;
                        product=result;
                }
					else if(op.equals("M")){
                        result = result * num1;
                        product = result;
                }
					else if(op.equals("D")){
                        result = result / num1;
                        product = result;
                }
					else{
						product =product *num1;
						result=product;
					}
				}
				
				
				//product =product *num1;
				//result=product;
				op = "M";
				if (text.getText().toString().equals("")){
					if(!caldisp.getText().toString().equals("")){
					String txt = caldisp.getText().toString(); 
					caldisp.setText(txt.substring(0, txt.length()-1));
					}
				}
				caldisp.append("*");
				text.setText("");
			}
		});
		buttonequal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				n2=text.getText().toString();
				if (!n2.equals("")){ 
						if (!n2.equals(".")){
					num2 = Float.parseFloat(n2);
				}
				}
				
				else{
					num2=0;
				}
				
				//TODO
				//TODO switch cases here::
				//TODO
				switch(op)
				{	case "A":
						result= result + num2;
						text.setText(Float.toString(result));
						product=result;
						isresult=true;
						break;
					case "M":
						product= product * num2;
						text.setText(Float.toString(product));
						result=product;
						isresult=true;
						break;
					case "S":
						result= result - num2;
						text.setText(Float.toString(result));
						product=result;
						isresult=true;
						break;
					case "D":
						product= product / num2;
						text.setText(Float.toString(product));
						result=product;
						isresult=true;
						break;
					default:
						
				}
				
				isdot=true;
				product=1;
				result=0;
				num1=0;
				num2=0;
				op="";
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
