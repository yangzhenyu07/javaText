package com.yzy.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class zzSql {

	public static void main(String[] args) {
		String filePath = "D:\\long.txt";
		new zzSql().ReadFileTxt(filePath);
	}
	 public void ReadFileTxt(String filePath) { 
	        File txtFile = new File(filePath);
	        InputStream in = null; 
	        InputStreamReader read = null; 
	        BufferedReader reader = null;
	        String msg = "ZB495";
	        String name = "T_FBSDJSYGTZD";
	        try { 
	            in = new FileInputStream(txtFile); 
	            read = new InputStreamReader(in);
	            reader = new BufferedReader(read);  
	            String temLine = "";
	                while ((temLine = reader.readLine())!=null) {
	                	String[] split = temLine.split("____");               
	                	System.out.println("INSERT INTO T_LTS_RANKS_CHANGE (ID,TYPEID,COL_NAME,COL_VALUE,TARGET_COL) VALUES (REPLACE(UUID(),'-',''),'"+msg+"."+split[1]+"','component,timeSharingClass,abudDryClass','00000031,0702,0602','"+split[0]+"');");
	                	//System.out.println("INSERT INTO T_LTS_COLUMNS_MAPPING (ID,TYPEID,SOURCE_COL,TARGET_COL,TARGET_COL_TYPE,IS_CALIBER,VAL_HANDLE_RULE,TRANS_TYPE,RANKS_TYPE,SOURCE_COL_NAME,TARGET_COL_NAME) VALUES (REPLACE(UUID(),'-',''),'"+name+"','"+split[0]+"','"+split[1]+"','string',0,'transRanksChangeSumServiceImpl',NULL,'"+msg+"."+split[1]+"','"+split[2]+"','"+split[2]+"');");
	                }
	        } catch (UnsupportedEncodingException e) { 
	            // TODO Auto-generated catch block 
	        } catch (FileNotFoundException e) { 
	            // TODO Auto-generated catch block 
	        } catch (IOException e) { 
	            // TODO Auto-generated catch block 
	        } finally { 
	            try { 
	                if (in != null) { 
	                    in.close(); 
	                } 
	                if (read != null) { 
	                    read.close(); 
	                } 
	                if (reader != null) { 
	                    reader.close(); 
	                } 
	            } catch (IOException e) { 
	                e.printStackTrace(); 
	            } 
	        }  
	    } 
	}