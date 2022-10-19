//用于找出项目文件夹路径的工具
package com.example.d_viewer_recover.fileutils;

import android.os.Environment;

import java.io.File;

public class FileHelper {
	//这里我把文件路径改成中文的了，防止出现编码问题
	public final static String savedSdPath = "/laser_point_detection";
	private File dirpath;
	public FileHelper(){
		File dir=Environment.getExternalStorageDirectory();
		//在外部存储的根目录下新建一个文件夹
		dirpath=new File(dir.toString(), savedSdPath);
		if(!dirpath.exists()){
			//这里我做了修改，加了if的大括号
			dirpath.mkdir();
		}
	}
	public File getPath(){
		return dirpath;
	}
}
