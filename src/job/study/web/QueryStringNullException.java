package job.study.web;

import javax.servlet.ServletException;

public class QueryStringNullException extends ServletException {

	public QueryStringNullException() {
		// TODO Auto-generated constructor stub
		super("전달된 질의 문자열이 없습니다.");
	}


}
