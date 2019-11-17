<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>ログイン画面</title>
</head>
<body>
<s:form action="AuthAction">
<table>
<tr>
<th> ユーザID：</th>
<td><s:textfield name="userid" /></td>
</tr>
<tr>
<th> パスワード：</th>
<td><s:textfield name="password" /></td>
</tr>
<tr><td colspan="2"><s:submit value="ログイン" /></td></tr>
</table>
</s:form>
</body>
</html>