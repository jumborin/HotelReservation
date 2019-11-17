<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>トップ画面</title>
</head>
<body>
<s:form action="login">
  <s:property value="userid" />でログインしました。
</s:form>
</body>
</html>