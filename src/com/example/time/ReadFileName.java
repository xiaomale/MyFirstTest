package com.example.time;

import java.io.File;

import android.os.Environment;

public class ReadFileName {
	public static String findFileName() {
		StringBuffer sb = null;
		if (Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED)) {
			File file = new File(Environment.getExternalStorageDirectory()
					.toString() + "/Contacts/ContactsBackUp");
			if (file.isDirectory()) {
				File[] fileArray = file.listFiles();
				if (null != fileArray && 0 != fileArray.length) {
					for (int i = 0; i < fileArray.length; i++) {
						sb.append(fileArray[i].getName());
						//sb.append("\n");
					}

				}

			}
		}

		return sb.toString();
	}

}
