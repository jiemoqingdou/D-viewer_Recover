//�����ҳ���Ŀ�ļ���·���Ĺ���
package com.example.d_viewer_recover.fileutils;

import android.os.Environment;

import java.io.File;

public class FileHelper {
	//�����Ұ��ļ�·���ĳ����ĵ��ˣ���ֹ���ֱ�������
	public final static String savedSdPath = "/laser_point_detection";
	private File dirpath;
	public FileHelper(){
		File dir=Environment.getExternalStorageDirectory();
		//���ⲿ�洢�ĸ�Ŀ¼���½�һ���ļ���
		dirpath=new File(dir.toString(), savedSdPath);
		if(!dirpath.exists()){
			//�����������޸ģ�����if�Ĵ�����
			dirpath.mkdir();
		}
	}
	public File getPath(){
		return dirpath;
	}
}
