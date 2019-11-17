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
<title>予約画面</title>
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
				<li class="nav-item active"><a class="nav-link"
					　href="ReserveAction">予約 </a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">客室紹介</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="MyPageAction">マイページ</a></li>
			</ul>
		</div>
	</nav>

	<s:form action="ReserveAction">
		<div class="form-group">
			<label for="startDate">日付(宿泊開始日)</label> <input type="text"
				id="startDate" name="startDate" class="form-control"
				placeholder="日付(宿泊開始日)" />
		</div>
		<div class="form-group">
			<label for="endDate">日付(宿泊終了日)</label> <input type="text"
				id="endDate" name="endDate" class="form-control"
				placeholder="日付(宿泊終了日)" />
		</div>
		<div class="form-group">
			<label for="number">人数</label> <input type="text" id="number"
				name="number" class="form-control" placeholder="人数" />
		</div>
		<div class="form-group">
			<label for="plan">プラン名</label> <input type="text" id="plan"
				name="plan" class="form-control" placeholder="プラン名" />
		</div>
		<div class="form-group">
			<s:submit value="登録" class="btn btn-success" />
		</div>
	</s:form>
</body>
</html>