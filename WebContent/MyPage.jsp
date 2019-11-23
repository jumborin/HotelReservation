<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- Bootstrap用 -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>マイページ画面</title>
</head>
<body>

	<!-- Bootstrap用 -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

	<!-- ナビゲーションバー -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="TopAction">ホテル予約システム</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<s:form action="Menu_NewReserveAction">
					<li class="nav-item"><s:submit class="btn btn-link" value="予約" />
					</li>
				</s:form>
				<s:form action="Menu_AboutAction">
					<li class="nav-item"><s:submit class="btn btn-link"
							value="客室紹介" /></li>
				</s:form>
				<s:form action="Menu_MyPageAction">
					<li class="nav-item active"><s:submit class="btn btn-link"
							value="マイページ" /></li>
				</s:form>
			</ul>
		</div>
	</nav>

	<!-- 画面本体 -->
	<div class="alert alert-info" role="alert">
		<s:property value="userName" />
		さんの予約状況は下記の通りです。
	</div>

	<s:form action="MyPageAction">
		<table class="table">
			<thead>
				<tr>
					<th>日付(宿泊開始日)</th>
					<th>日付(宿泊終了日)</th>
					<th>人数</th>
					<th>プラン名</th>
					<th>修正・キャンセル</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>2019/11/11</td>
					<td>2019/11/23</td>
					<td>2名</td>
					<td>素泊まりプラン</td>
					<td>
						<button class="btn btn-primary">修正</button>
						<button class="btn btn-danger">キャンセル</button>
					</td>
				</tr>
			</tbody>
		</table>
		<div>
			<s:submit class="btn btn-success" value="追加" />
		</div>
	</s:form>
</body>
</html>