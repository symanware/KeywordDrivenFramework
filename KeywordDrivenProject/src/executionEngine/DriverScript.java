package executionEngine;


import java.lang.reflect.Method;


import Utility.Constants;
import Utility.ExcelUtil;

import config.ActionKeyWords;

public class DriverScript {
	
	
	public static ActionKeyWords actionKeyWords;
	public static String sActionKeyWord;
	public static Method method[]=null;
	
	public DriverScript () throws NoSuchMethodException, SecurityException{
		
		actionKeyWords= new ActionKeyWords();
		
		method= actionKeyWords.getClass().getMethods();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		
	    new DriverScript();
	    		
		ExcelUtil.setExcelData(Constants.pathTestData+Constants.fileTestData,"Sheet1");
	
		for(int iRow=1;iRow<9;iRow++){
			
			sActionKeyWord= ExcelUtil.getCellData(iRow, Constants.col_ActionKeyWord);
			System.out.println(sActionKeyWord);
			execute_Actions();
			
		}
		
		
	}

	
	public static void execute_Actions() throws Exception{
		for(int i=0;i<8;i++){
			
			if(method[i].getName().equals(sActionKeyWord)){
				
				method[i].invoke(sActionKeyWord);
				break;
				
			}
				
		}
	}
}