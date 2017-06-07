package cn.htu.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteXls extends HttpServlet {

	public void init() throws ServletException {
		// Put your code here

		File file = new File(".");

		File[] subfiles = file.listFiles();

		for (File f : subfiles) {
			if (f.getName().endsWith(".xls"))
				;
			{
				f.delete();
			}

		}

	}

}
